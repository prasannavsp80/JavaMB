package com.java.inv;

import java.sql.SQLException;
import java.util.List;

public class ShowStockMain {

	public static void main(String[] args) {
		StockDao dao = new StockDaoImpl();
		try {
			List<Stock> stockList = dao.showStock();
			for (Stock stock : stockList) {
				System.out.println(stock);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
