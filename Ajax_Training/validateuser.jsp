<%@page contentType="text/plain" import="java.io.*" import="java.sql.*" %> 
<%!
    boolean checkUserDB(String user, String pass) throws SQLException{
        String dburl = "jdbc:postgresql://localhost:8000/peoplemgmt"; 
        String dbuser = "postgres";
        String dbpass = "root";

        Connection con = DriverManager.getConnection(dburl, dbuser, dbpass);
        String query = "select * from users";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        while(rs.next()){
            if (rs.getString(1).equals(user) && rs.getString(2).equals(pass)){
                return true;
            }
        }
        con.close();
        return false;
    }

%>
<%
    try{
        String user = request.getParameter("username").toString();
        String pass = request.getParameter("password").toString();

        if (checkUserDB(user, pass)){
            out.println("User is Available.");
        }
        else{
            out.println("User Unavailable in Database Please Signup.");
        }
    }

    catch(SQLException sx){
        out.println("SQLException occured :"+sx.getMessage());
    }

    catch(Exception e){
        out.println(e.getMessage());
    }
%>