/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordfrequency.dao;

import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import wordfrequency.model.User;

/**
 *this class deals with all DB calls for the user
 * @author david Le Luron
 */
public class UserDAO {
    
    //CREATE a USER
    
    /**
     * this method will create a user in the DB based on the object created at sign up
     * @param user: an instance of the object user that will be use to get the data needed for an injection DB
     * @throws SQLException 
     */
    
    public static void create(User user) throws SQLException{
        
        Connection c = DBConnect.getConnection();
        PreparedStatement stm;
        stm = c.prepareStatement("INSERT INTO user(name,userId,pwd,age,sex) VALUES (?,?,?,?,?)");
        stm.setString(1,user.getName());
        stm.setString(2,user.getUserId());
        stm.setString(3,user.getPwd());// the password will  eventually be hashed
        stm.setInt(4,user.getAge());
        stm.setString(5,user.getSex());
        stm.execute();
        stm.close();
        
        
    }
    
    //READ
    
    /**
     * this method will read the DB for the credentials of all users signed up
     * @return: will return a ArrayList of users
     * @throws SQLException 
     */
    
    public static ArrayList<User>  findall() throws SQLException{
        ArrayList<User> users=new ArrayList();// initialize the Array list of users
        Statement stm; // initialize the stm
        Connection c = DBConnect.getConnection();// open connection to DB
        String sql = "SELECT * From user";// SQL search
        stm=c.createStatement();// creation of the statement
        ResultSet rs = stm.executeQuery(sql);// getting the results
        // loop to get the data that will be use to create the object user, creation of the objet
        // and adding it to the ArrayList.
        while(rs.next()){
        int id = rs.getInt("id");
        String name = rs.getString("name");
        String userId = rs.getString("userId");
        String pwd = rs.getString("pwd");
        int score = rs.getInt("score");
        int level = rs.getInt("level");
        int age = rs.getInt("age");
        String sex = rs.getString("sex");
        boolean admin = rs.getBoolean("admin");
        
        User user = new User(id, score, level, age, name, userId,  pwd, sex, admin);// creation of an object user with the infos from the DB
        users.add(user);// add this object in the ArrayList
        
    }
        stm.close(); //closing the connection
        
       
        return users;// return a list of all the users that can be used later
    }
    
}
