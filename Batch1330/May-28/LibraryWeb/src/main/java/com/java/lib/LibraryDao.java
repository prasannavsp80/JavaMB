package com.java.lib;

import java.sql.SQLException;
import java.util.List;

public interface LibraryDao {

	int authenticate(String user, String pwd) throws ClassNotFoundException, SQLException;
	List<Books> searchBooks(String type, String searchvalue) throws ClassNotFoundException, SQLException;
}
