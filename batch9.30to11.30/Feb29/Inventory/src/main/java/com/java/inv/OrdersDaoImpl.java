package com.java.inv;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OrdersDaoImpl implements OrdersDao {

	Connection connection;
	PreparedStatement pst;
	
	@Override
	public String placeOrder(Order order) throws ClassNotFoundException, SQLException {
		StockDao daoStock = new StockDaoImpl();
		Stock stock = daoStock.searchByStockId(order.getStockId());
		int qtyAvail = stock.getQuantityAvail();
		if (qtyAvail < order.getQtyOrd()) {
			return "Quantity is Not Available...Order Not Placed...";
		}
		order.setPrice(stock.getPrice());
		connection = ConnectionHelper.getConnection();
		String cmd = "Update Stock Set QuantityAvail = QuantityAvail - ? "
				+ " WHERE StockID = ?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, order.getQtyOrd());
		pst.setString(2, order.getStockId());
		pst.executeUpdate();
		cmd = "Insert into Orders(OrderId, StockId, QtyOrd, Price) "
				+ " values(?, ?, ?, ?)";
		pst = connection.prepareStatement(cmd);
		pst.setString(1, order.getOrderId());
		pst.setString(2, order.getStockId()); 
		pst.setInt(3, order.getQtyOrd());
		pst.setDouble(4, order.getPrice());
		pst.executeUpdate();
		double billAmount = order.getQtyOrd() * stock.getPrice();
		cmd = "Update Amount set Gamt=Gamt+?";
		pst = connection.prepareStatement(cmd);
		pst.setDouble(1, billAmount);
		pst.executeUpdate();
		return "Order Placed Successfully...";
	}

}
