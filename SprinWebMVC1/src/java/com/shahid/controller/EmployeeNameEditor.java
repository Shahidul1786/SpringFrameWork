/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shahid.controller;

import java.beans.PropertyEditorSupport;

/**
 *
 * @author Shahidul
 */
public class EmployeeNameEditor extends PropertyEditorSupport{

    @Override
    public void setAsText(String ename) throws IllegalArgumentException {
     
        if (ename.contains("Mr.") || ename.contains("Mrs.")) {
            
            setValue(ename);
            
        }else{
            
            setValue("Mr. "+ename);
        }
    }
    
    
    
}
