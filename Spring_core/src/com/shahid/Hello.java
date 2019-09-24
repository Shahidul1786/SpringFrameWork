/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shahid;

/**
 *
 * @author Shahidul
 */
public class Hello {
    
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    public void init(){
        System.out.println("Before initialize bean");
    }
    
    
    public void destroy(){
        System.out.println("before destroying bean");
    }
    
}
