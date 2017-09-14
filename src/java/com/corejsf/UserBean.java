/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.corejsf;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
//import javax.inject.Named;
//import javax.enterprise.context.Dependent;
//import javax.enterprise.context.SessionScoped;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author 14034305
 */
@ManagedBean(name="user")
@SessionScoped
public class UserBean implements Serializable {
    private String name;
    private String password;
    private String gender;
    private String value;
    
    public UserBean() {
    }


    public String getName() { return name; }
    public void setName(String newValue) { name = newValue; }

   public String getPassword() { return password; }
   public void setPassword(String newValue) { password = newValue; } 

 /**
     * @return the gender
     */
    public String getGender() {                
        return gender;
    }

   
    public void setGender(String newValue) {    
        gender = newValue;
    }

    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(String value) {
        if ("male".equals(value)){
            value = "Mr.";
        }else if ("female".equals(value)){
            value = "Mrs.";
        }
        setGender(value);
    }
    
}
