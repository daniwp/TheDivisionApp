package dataAccessLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import entity.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserMapper {
    
    public User getUserByUsername(String username) throws ClassNotFoundException, SQLException {
        
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        User user = null;
        
        try {
            Class.forName(DB.driver);
            con = DriverManager.getConnection(DB.URL, DB.ID, DB.PW);
            
            String query ="SELECT * FROM user WHERE uName = (?)";
            ps = con.prepareStatement(query);
            ps.setString(1, username);
            
            rs = ps.executeQuery();
            
            while(rs.next()) {
                user = new User(rs.getString("uName"), rs.getString("pWord"));
            }
            
            ps.close();
            con.close();
            rs.close();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        } finally {
            return user;
        }
    }

    public boolean addUser(User u) throws SQLException, ClassNotFoundException {
        
        Connection con = null;
        PreparedStatement ps = null;

        try {
            Class.forName(DB.driver);
            con = DriverManager.getConnection(DB.URL, DB.ID, DB.PW);
            
            if (this.getUserByUsername(u.getUserName()) != null) {
//                throw new SQLException("User already exists");
                  return false;
            }
            
            String query ="INSERT INTO user (uName, pWord) VALUES (?,?)";
            ps = con.prepareStatement(query);
            ps.setString(1, u.getUserName());
            ps.setString(2, u.getPassword());
            
            ps.executeUpdate();
            
            ps.close();
            con.close();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        } 
        return true;
    }
    
    public boolean validateUser(User user) throws SQLException, ClassNotFoundException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            Class.forName(DB.driver);
            con = DriverManager.getConnection(DB.URL, DB.ID, DB.PW);
            
            String query ="SELECT * FROM user WHERE uName = ? AND pWord = ?";
            ps = con.prepareStatement(query);
            ps.setString(1, user.getUserName());            
            ps.setString(2, user.getPassword());            
            rs = ps.executeQuery();
            
            if (rs.next()) {
               return true; 
            }
            
            ps.close();
            rs.close();
            con.close();
            
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        } 
        
        return false;
    }
}
