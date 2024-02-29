package com.java.inv;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StockDaoImpl implements StockDao {

	Connection connection;
	PreparedStatement pst;
	
	@Override
	public List<Stock> showStock() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Stock";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		List<Stock> stockList = new ArrayList<Stock>();
		Stock stock = null;
		while(rs.next()) {
			stock = new Stock();
			stock.setStockId(rs.getString("stockId"));
			stock.setItemName(rs.getString("itemName"));
			stock.setPrice(rs.getDouble("price"));
			stock.setQuantityAvail(rs.getInt("QuantityAvail"));
			stockList.add(stock);
		}
		return stockList;
	}

	@Override
	public Stock searchByStockId(String stockId) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Stock where StockId = ?";
		pst = connection.prepareStatement(cmd);
		pst.setString(1, stockId);
		ResultSet rs = pst.executeQuery();
		Stock stock = null;
		if (rs.next()) {
			stock = new Stock();
			stock.setStockId(rs.getString("stockId"));
			stock.setItemName(rs.getString("itemName"));
			stock.setPrice(rs.getDouble("price"));
			stock.setQuantityAvail(rs.getInt("QuantityAvail"));
		}
		return stock;
	}	

}
