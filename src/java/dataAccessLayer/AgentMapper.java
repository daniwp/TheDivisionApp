package dataAccessLayer;

import entity.Agent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AgentMapper {

    public void addAgent(Agent agent) throws ClassNotFoundException {
        Connection con = null;
        PreparedStatement ps = null;

        try {
            Class.forName(DB.driver);
            con = DriverManager.getConnection(DB.URL, DB.ID, DB.PW);

            String query = "INSERT INTO agent (agentName, agentLvl, agentDzLvl, userId) VALUES (?,?,?,?)";
            ps = con.prepareStatement(query);
            ps.setString(1, agent.getName());
            ps.setInt(2, agent.getLvl());
            ps.setInt(3, agent.getdZLvl());
            ps.setInt(4, agent.getUserId());

            ps.executeUpdate();

            ps.close();
            con.close();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }

    public List<Agent> getAllAgentsByUserId(int userId) throws ClassNotFoundException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Agent> agents = new ArrayList();

        try {
            Class.forName(DB.driver);
            con = DriverManager.getConnection(DB.URL, DB.ID, DB.PW);

            String query = "SELECT * FROM agent WHERE userId = ?";
            ps = con.prepareStatement(query);
            ps.setInt(1, userId);
            rs = ps.executeQuery();

            while (rs.next()) {
                String agentName = rs.getString(2);
                int agentLvl = rs.getInt(3);
                int agentDzLvl = rs.getInt(4);
                
                Agent agent = new Agent(agentName, agentLvl, agentDzLvl, userId);
                
                agents.add(agent);
            }

            ps.close();
            rs.close();
            con.close();

        } catch (SQLException sqle) {
            
        }
        return agents;
    }

}
