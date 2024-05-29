package com.java.lib;

import java.sql.SQLException;
import java.util.List;

public interface LibraryDao {

	int authenticate(String user, String pwd) throws ClassNotFoundException, SQLException;
	List<Books> searchBooks(String type, String searchvalue) throws ClassNotFoundException, SQLException;
	String issueBook(String user, int bookId) throws ClassNotFoundException, SQLException;
	List<TranBook> showIssuedBooks(String user) throws ClassNotFoundException, SQLException;
	String returnBook(String user, int bookId) throws ClassNotFoundException, SQLException;
}
