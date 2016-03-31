package util;

import dataAccessLayer.UserMapper;
import entity.User;
import java.sql.SQLException;

public class Test {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        User u = new User("Luke", "Skywalker");
        User u1 = new User("Luke", "Gaywalker");
        UserMapper userMapper = new UserMapper();
        
        userMapper.addUser(u); 
        userMapper.addUser(u1);
    }
}

