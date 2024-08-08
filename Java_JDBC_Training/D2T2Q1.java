/*
1. Create a database for student details management system it must follows the conditions,

The fields must have Regno, Name, DOB, Address, Email, CGPA.

Get the input from the user and store it into database table
*/
import java.sql.*;
import java.util.Scanner;
public class D2T2Q1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		StuDAO dao = new StuDAO();
		
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
				// Select
				case "2" -> {
					try{
						dao.display();
					}
					catch(SQLException sx){
						System.out.println("Selection Not possible");
					}
					
				}
				// Kill
				case "3" ->{ kill = true;}
				
				default -> {}
			}
			
		}while(!kill);
		
		
	}
	
	private static void displayDash(){
		System.out.println("\n\nCRUD Operations in Student Table.");
		System.out.println("1. Insert Elements");
		System.out.println("2. Display Table");
		System.out.println("3. Quit");
		System.out.print("Enter option ==>> ");
	}
}

class StuDAO{
	// Classloader dynamically loads the suitable driver for jdk version x.y and latest.
	// Class.forName("org.postgresql.Driver");
	
	// URL Template 
	// String url = "jdbc:postgresql://host:port/database";

	private String url = "jdbc:postgresql://localhost:8000/stumgmt";
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
		
		String query = "select * from studetails";
		
		psmt = con.prepareStatement(query);

		ResultSet rs = psmt.executeQuery();
		
		// Table Heading.
		System.out.println("reg_no  stu_name  stu_dob  stu_address stu_cgpa");
		
		while (rs.next()) {
			System.out.println(rs.getInt(1) +" "+ rs.getString(2) +" "+ rs.getDate(3) +" "+ rs.getString(4) +" "+ rs.getFloat(5));
		}

		con.close();
		
	}
	
	int insert(Scanner sc) throws SQLException{
		con = getCon();
		
		System.out.println("Please Enter Values");
		
		String query = "insert into studetails values (?, ?, ?, ?, ?)";
		psmt = con.prepareStatement(query);
		
		System.out.print("Please Enter Register Number : ");
		psmt.setInt(1, sc.nextInt());
		System.out.print("Please Enter Student Name : ");
		psmt.setString(2, sc.next());
		System.out.print("Please Enter Student DOB (YYYY-MM-DD) : ");
		Date date = Date.valueOf(sc.next());
		psmt.setDate(3, date);
		System.out.print("Please Enter Student Address : ");
		psmt.setString(4, sc.next());
		System.out.print("Please Enter Student CGPA : ");
		psmt.setFloat(5, sc.nextFloat());
		
		int affected = psmt.executeUpdate();
		con.close();
		return affected;
	}

}