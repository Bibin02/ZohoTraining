import java.sql.*;
public class VotingDAO {
    public boolean castVote(String vid, int party){
        try {
            Connection con = DBConnector.establishCon();
            String query = "update voters set party = ? where vid = ? ";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, party);
            pst.setString(2 , vid);
            pst.executeUpdate();
            con.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Voter ID / Party Invalid.");
        }
        return false;
    }

    public void displayParties() {
        try {
            Connection con = DBConnector.establishCon();
            String query = "select party_name, party_code from parties";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            System.out.println("Party Name\tParty Code");
            while (rs.next()) {
                System.out.println(rs.getString(1)+"\t"+rs.getString(2));
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Voting DB issue occured.");
        }
    }
}
