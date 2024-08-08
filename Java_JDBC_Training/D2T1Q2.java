/*
2(L2).Create a basic application using JDBC which satisfies the basic CRUD operations.
*/
import java.sql.*;
import java.util.Scanner;
public class D2T1Q2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		EmpDAO dao = new EmpDAO();
		
		boolean kill = false;
		String option = "";
		
		do {
			displayDash();
			
			option = sc.next();
			switch(option){
				//Insert
				case "1" -> {
					try{
						System.out.println("Inserted "+dao.insert(sc)+" rows");
					}
					catch(SQLException sx){
						System.out.println("Insertion Not possible / Duplicate Insertion");
					}
				}
				// Update
				case "2" -> {
					try{
						System.out.println("Updated "+dao.update(sc)+" rows");
					}
					catch(SQLException sx){
						System.out.println("Updation Not possible");
					}
				}
				// Delete
				case "3" -> {
					try{
						System.out.println("Deleted "+dao.delete(sc)+" rows");
					}
					catch(SQLException sx){
						System.out.println("Deletion Not possible");
					}
				}
				// Select
				case "4" -> {
					try{
						dao.display();
					}
					catch(SQLException sx){
						System.out.println("Selection Not possible");
					}
					
				}
				// Kill
				case "5" ->{ kill = true;}
				
				default -> {}
			}
			
		}while(!kill);
		
		
	}
	
	private static void displayDash(){
		System.out.println("\n\nCRUD Operations in Employee Table.");
		System.out.println("1. Insert Elements");
		System.out.println("2. Update Table Row");
		System.out.println("3. Delete Table Row");
		System.out.println("4. Display Table");
		System.out.println("5. Quit");
		System.out.print("Enter option ==>> ");
	}
}

class EmpDAO{
	// Classloader dynamically loads the suitable driver for jdk version x.y and latest.
	// Class.forName("org.postgresql.Driver");
	
	// URL Template 
	// String url = "jdbc:postgresql://host:port/database";

	private String url = "jdbc:postgresql://localhost:8000/empmgmt";
	private String user = "postgres";
	private String pass = "root";
	private Connection con;
	private PreparedStatement psmt;

	private Connection getCon(){
		try{
			return DriverManager.getConnection(url, user, pass);
		}
		catch(SQLException sx){
			System.out.println("SQLException Occured During Connection");
		}
		return null;
	}

	void display() throws SQLException{
		
		con = getCon();
		
		String query = "select * from empdetails";
		
		psmt = con.prepareStatement(query);

		ResultSet rs = psmt.executeQuery();
		
		// Table Heading.
		System.out.println("emp_no  emp_name  emp_age  emp_address emp_phone");
		
		while (rs.next()) {
			System.out.println(rs.getInt(1) +" "+ rs.getString(2) +" "+ rs.getInt(3) +" "+ rs.getString(4) +" "+ rs.getInt(5));
		}

		con.close();
		
	}
	
	int insert(Scanner sc) throws SQLException{
		con = getCon();
		
		System.out.println("Please Enter Values");
		
		String query = "insert into empdetails values (?, ?, ?, ?, ?)";
		psmt = con.prepareStatement(query);
		
		System.out.print("Please Enter Employee ID : ");
		psmt.setInt(1, sc.nextInt());
		System.out.print("Please Enter Employee Name : ");
		psmt.setString(2, sc.next());
		System.out.print("Please Enter Employee Age : ");
		psmt.setInt(3, sc.nextInt());
		System.out.print("Please Enter Employee Address : ");
		psmt.setString(4, sc.next());
		System.out.print("Please Enter Employee Phone : ");
		psmt.setInt(5, sc.nextInt());
		
		int affected = psmt.executeUpdate();
		con.close();
		return affected;
	}
	
	int update(Scanner sc) throws SQLException{
		
		con = getCon();
		System.out.println("Please Enter column to update");
		String column = sc.next();
		
		String query = "update empdetails set "+column+" = ? where "+column+" = ?";
		
		psmt = con.prepareStatement(query);
		System.out.println("Please Enter what to update");
		psmt.setString(1, sc.next());
		System.out.println("Please Enter where to update");
		psmt.setString(2, sc.next());
		int affected = psmt.executeUpdate();
		con.close();
		return affected;
	}
	
	int delete(Scanner sc) throws SQLException{
		con = getCon();
		System.out.println("Please Enter which column to delete");
		String column = sc.next();
		
		String query = "delete from empdetails where "+column+" = ?";
		
		psmt = con.prepareStatement(query);
		System.out.println("Please Enter what to delete");
		psmt.setString(1, sc.next());
		
		int affected = psmt.executeUpdate();
		con.close();
		return affected;
	}
}