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
public class Category {
    private int id;
    private String name;
    
    //full constructor

    public Category(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    //constructor for input

    public Category(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}