import java.sql.*;

public class AdminDAO {
    public boolean login(String uname, String pass){
        Connection con = DBConnector.establishCon();
        boolean find = false;

        try {
            String query = "select uname, pass from users";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            while (rs.next()) {
                if (rs.getString(1).equals(uname) && rs.getString(2).equals(pass)){
                    find = true;
                }
            }
            con.close();
            return find;
        } 
        catch (SQLException e) {
            System.out.println("User Table unaccesable");
        }
        
        return find;
    }

    public boolean insertVoter(Admin admin, String vid){
        if (admin == null) {
            System.out.println("Admin Access required");
            return false;
        }
        Connection con = DBConnector.establishCon();
        boolean status = false;

        try {
            String query = "insert into voters values ("+vid+")";
            Statement st = con.createStatement();
            int affected = st.executeUpdate(query);
            
            if (affected == 1){
                status = true;
            }
            con.close();
        } 
        catch (SQLException e) {
            System.out.println("User Table unaccesable");
        }
        
        return status;
    }

    public boolean deleteVoter(Admin admin, String vid){
        if (admin == null) {
            System.out.println("Admin Access required");
            return false;
        }
        Connection con = DBConnector.establishCon();
        boolean status = false;

        try {
            String query = "delete from voters where vid = '"+vid+"'";
            Statement st = con.createStatement();
            int affected = st.executeUpdate(query);
            
            if (affected == 1){
                status = true;
            }
            con.close();
        } 
        catch (SQLException e) {
            System.out.println("User Table unaccesable");
        }
        
        return status;
    }

    public void declareResults(Admin admin){
        if (admin == null) {
            System.out.println("Admin Access required");
        }
        
        Connection con = DBConnector.establishCon();

        try {
            String query = "select parties.party_name, parties.party_code, count(voters.party) as total_voters from parties left join voters on parties.party_code = voters.party group by parties.party_code order by total_voters desc";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            System.out.println("Election Results !");
            System.out.println("Party Name\tParty Code\tTotal Votes");
            while (rs.next()) {
                System.out.println(rs.getString(1) +"\t\t"+ 
                rs.getInt(2)+"\t\t"+
                rs.getInt(3));
            }
            con.close();
        } 
        catch (SQLException e) {
            System.out.println("User Table unaccesable");
        }
    }
}
