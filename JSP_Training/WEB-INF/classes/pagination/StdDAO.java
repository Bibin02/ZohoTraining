
import java.util.*;
import java.sql.*;

public class StdDAO{
	
	public List<Student> getStudents(int pgno){
		List<Student> list = new ArrayList<>();
		
        pgno=pgno-1;  
        pgno=pgno*3+1;  
			
		// 3 Rows per Page.
		String query = "select * from studue limit ? offset ?";
		
		try{
			Connection con = getCon();
			
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, 3);
			pst.setInt(2, pgno);
			
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()){
				Student stu = new Student();
				
				stu.reg_no = rs.getInt(1);
				stu.stu_name = rs.getString(2);
				stu.paid_amount = rs.getInt(3);
				stu.due_amount = rs.getInt(4);
				stu.due_date = rs.getDate(5) != null ? rs.getDate(5).toString() : null;
				
				list.add(stu);
				
			}
			con.close();
		}
		catch(SQLException ex){
			ex.printStackTrace();
		}
		
		return list;
		
	}
	
	private Connection getCon() throws SQLException{
		String url = "jdbc:postgresql://localhost:8000/stumgmt";
		String user = "postgres";
		String pass = "root";
		
		Connection con = DriverManager.getConnection(url, user, pass);
		
		return con;
	}
	
}