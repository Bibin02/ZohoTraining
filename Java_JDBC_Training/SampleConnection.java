import java.sql.*;

public class SampleConnection{
	public static void main(String[] args) throws SQLException{
		
		// Class.forName("org.postgresql.Driver");
		
		// String url = "jdbc:postgresql://host:port/database";
		String url = "jdbc:postgresql://localhost:8000/db1";
		String user = "postgres";
		String pass = "root";
		Connection con = DriverManager.getConnection(url, user, pass);

		String query = "select * from student";
		PreparedStatement psmt = con.prepareStatement(query);

		ResultSet rs = psmt.executeQuery();

		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2));
		}

		con.close();
	}
	
}