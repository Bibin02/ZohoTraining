import java.sql.*;
public class DBConnector {
    public static Connection establishCon(){
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:postgresql://localhost:8000/peoplemgmt", "postgres", "root");
        } 
        catch (SQLException e) {
            System.out.println("Could'nt Establish Connection");
        }
        return con;
    }
}