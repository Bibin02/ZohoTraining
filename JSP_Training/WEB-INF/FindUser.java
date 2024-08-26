import java.sql.*;
public class FindUser {
    public boolean findUser(Connection con, String uname, String pass) throws SQLException{

        String selectquery = "select uname from users";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(selectquery);

        while (rs.next()) {
            if(rs.getString(1).equals(uname)){
                return true;
            }
        }
        return false;
    }
    public boolean AuthUser(String uname, String pass){
        try {
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:8000/peoplemgmt", "postgres", "root");
            String selectquery = "select uname from users where uname=? and pass=?";
            PreparedStatement psmt = con.prepareStatement(selectquery);
            psmt.setString(1, uname);
            psmt.setString(2, pass);
            ResultSet rs = psmt.executeQuery();

            while (rs.next()) {
                if(rs.getString(1).equals(uname)){
                    return true;
                }
            }
            return false;

        } catch (SQLException se) {
            System.out.println("SQLException : "+se.getMessage());
            return false;
        }
        
    }
}
