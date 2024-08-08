/*
1(L1).Create a database and implement the JDBC commands and in build methods for database.
*/

import java.sql.*;

public class D2T1Q1{
	public static void main(String[] args) throws SQLException{
		
		// Classloader dynamically loads the suitable driver for jdk version x.y and latest.
		// Class.forName("org.postgresql.Driver");
		
		// URL Template 
		// String url = "jdbc:postgresql://host:port/database";

		String url = "jdbc:postgresql://localhost:8000/db1";
		String user = "postgres";
		String pass = "root";
		Connection con = DriverManager.getConnection(url, user, pass);

		String query = "select * from details";
		PreparedStatement psmt = con.prepareStatement(query);

		ResultSet rs = psmt.executeQuery();
		
		// Insertion
		try {
			query = "insert into details values(1006, 'Person6', '9090909096', 'address6')";
			psmt = con.prepareStatement(query);
			int affected = psmt.executeUpdate();
			System.out.println("Inserted "+affected+" rows");
		}
		catch (SQLException sx){
			System.out.println("Duplicate Insertion happened");
		}
		
		// Updation
		query = "update details set address = 'updated address' where pname = 'Person6'";
		psmt = con.prepareStatement(query);
		int affected = psmt.executeUpdate();
		System.out.println("Updated "+affected+" rows");
		
		// Table Heading.
		System.out.println("Adhaar Number  Person Name   Phone Number   Address");
		
		while (rs.next()) {
			System.out.println(rs.getInt(1) +" "+ rs.getString(2) +" "+ rs.getString(3) +" "+ rs.getString(4));
		}

		con.close();
	}
	
}