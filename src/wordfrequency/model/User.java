/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordfrequency.model;

/**
 *
 * @author david
 */
public class User {
    private int id,score,level,age;
    private String name,userId,pwd,sex;
    private boolean admin;

    
    //Full Constructor
    public User(int id, int score, int level, int age, String name, String userId, String pwd, String sex, boolean admin) {
        this.id = id;
        this.score = score;
        this.level = level;
        this.age = age;
        this.name = name;
        this.userId = userId;
        this.pwd = pwd;
        this.sex = sex;
        this.admin = admin;
    }
//Constructor for Signing up
    public User(int age, String name, String userId, String pwd, String sex) {
        this.age = age;
        this.name = name;
        this.userId = userId;
        this.pwd = pwd;
        this.sex = sex;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public int getId() {
        return id;
    }
    
    
    
    
}
