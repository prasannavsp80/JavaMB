package com.java.inv;

import java.sql.SQLException;
import java.util.List;

public interface StockDao {
	List<Stock> showStock() throws ClassNotFoundException, SQLException;
	Stock searchByStockId(String stockId) throws ClassNotFoundException, SQLException;
}
