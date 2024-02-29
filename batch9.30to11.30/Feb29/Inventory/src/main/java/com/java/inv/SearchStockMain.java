package com.java.inv;

import java.sql.SQLException;
import java.util.Scanner;

public class SearchStockMain {

	public static void main(String[] args) {
		String stockId;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Stock Id  ");
		stockId = sc.next();
		StockDao dao = new StockDaoImpl();
		try {
			Stock stock = dao.searchByStockId(stockId);
			if (stock!=null) {
				System.out.println(stock);
			} else {
				System.out.println("Stock Id not Found...");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
