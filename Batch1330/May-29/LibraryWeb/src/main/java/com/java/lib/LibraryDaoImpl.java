package com.java.lib;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LibraryDaoImpl implements LibraryDao {

	Connection connection;
	PreparedStatement pst;
	
	@Override
	public int authenticate(String user, String pwd) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select count(*) cnt from LibUsers Where UserName = ? AND Password = ?";
		pst = connection.prepareStatement(cmd);
		pst.setString(1, user);
		pst.setString(2, pwd);
		ResultSet rs = pst.executeQuery();
		rs.next();
		int count = rs.getInt("cnt");
		return count;
	}

	@Override
	public List<Books> searchBooks(String searchType, String searchValue) throws ClassNotFoundException, SQLException {
		String sql;
		boolean isValid=true;
		if(searchType.equals("id")) {
			sql = " SELECT * FROM Books WHERE Id = ? " ;
		} else if(searchType.equals("bookname")) {
			sql = " SELECT * FROM Books WHERE Name = ? " ;
		} else if(searchType.equals("authorname")) {
			sql = " SELECT * FROM Books WHERE Author = ? " ;
		} else if(searchType.equals("dept")) {
			sql = " SELECT * FROM Books WHERE Dept = ? " ;
		}
		else {
			isValid=false;
			sql = " SELECT * FROM Books" ;
		}
		connection = ConnectionHelper.getConnection();
		pst = connection.prepareStatement(sql);
		if (isValid==true) {
			pst.setString(1, searchValue);
		} 
		ResultSet rs = pst.executeQuery();
		Books books = null;
		List<Books> booksList = new ArrayList<Books>();
		while(rs.next()) {
			books = new Books();
			books.setId(rs.getInt("id"));
			books.setName(rs.getString("name"));
			books.setAuthor(rs.getString("author"));
			books.setEdition(rs.getString("edition"));
			books.setDept(rs.getString("dept"));
			books.setTotalBooks(rs.getInt("TotalBooks"));
			booksList.add(books);
		}
		return booksList;
	}
    
	
	public int issuedOrNot(String user, int bookId) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd ="select count(*) cnt from TranBook Where UserName = ? AND BookID = ?";
		pst = connection.prepareStatement(cmd);
		pst.setString(1, user);
		pst.setInt(2, bookId);
		ResultSet rs = pst.executeQuery();
		rs.next();
		int count = rs.getInt("cnt");
		return count;
	}
	
	@Override
	public String issueBook(String user, int bookId) throws ClassNotFoundException, SQLException {
		int count = issuedOrNot(user, bookId);
		if (count==1) {
			return "Book with Id  " +bookId + " Already Issued...";
		}
		connection = ConnectionHelper.getConnection();
		String sql = "Update Books set TotalBooks = totalBooks - 1 where id = ?";
		pst = connection.prepareStatement(sql);
		pst.setInt(1, bookId);
		pst.executeUpdate();
		sql = "Insert into TranBook(UserName, BookId, FromDate) values(?, ?, ?)";
		pst = connection.prepareStatement(sql);
		pst.setString(1, user);
		pst.setInt(2, bookId);
		pst.setDate(3, new java.sql.Date(new java.util.Date().getTime()));
		pst.executeUpdate();   
		return "Book with Id  " +bookId +" Issued Successfully...";
	}

	@Override
	public List<TranBook> showIssuedBooks(String user) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from tranbook Where UserName = ?";
		pst = connection.prepareStatement(cmd);
		pst.setString(1, user);
		ResultSet rs = pst.executeQuery();
		TranBook tranBook = null;
		List<TranBook> tranBookList = new ArrayList<TranBook>();
		while(rs.next()) {
			tranBook = new TranBook();
			tranBook.setBookId(rs.getInt("bookId"));
			tranBook.setUserName(rs.getString("userName"));
			tranBook.setFromDate(rs.getDate("fromDate"));
			tranBookList.add(tranBook);
		}
		return tranBookList;
	}

	@Override
	public String returnBook(String user, int bookId) throws ClassNotFoundException, SQLException {
		TranBook tranBook = null;
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from TranBook Where UserName = ? AND BookId = ?";
		pst = connection.prepareStatement(cmd);
		pst.setString(1, user);
		pst.setInt(2, bookId);
		ResultSet rs = pst.executeQuery();
		if (rs.next()) {
			tranBook = new TranBook();
			tranBook.setBookId(rs.getInt("bookId"));
			tranBook.setUserName(rs.getString("userName"));
			tranBook.setFromDate(rs.getDate("fromDate"));
		}
		String sql = "Update Books set TotalBooks = totalBooks + 1 where id = ?";
		pst = connection.prepareStatement(sql);
		pst.setInt(1, bookId);
		pst.executeUpdate();
		sql = "Delete from tranbook Where bookid = ? AND UserName = ?";
		pst = connection.prepareStatement(sql);
		pst.setString(2, user);
		pst.setInt(1, bookId);
		pst.executeUpdate();   
		sql = "Insert into TransReturn(UserName, BookId, FromDate, toDate) values(?,?,?,?)";
		pst = connection.prepareStatement(sql);
		pst.setString(1, user); 
		pst.setInt(2, bookId);
		pst.setDate(3, tranBook.getFromDate());
		pst.setDate(4, new java.sql.Date(new java.util.Date().getTime()));
		pst.executeUpdate();
		return "Book with Id  " +bookId +" Returned Successfully...";
	}

}
