/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shahid.controller;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author Shahidul
 */
public class PhoneValidator implements ConstraintValidator<Phone, String>{

    @Override
    public void initialize(Phone a) {
        
    }

    @Override
    public boolean isValid(String t, ConstraintValidatorContext cvc) {
        
        
        if (t== null) {
            return false;
            
        }
        if (t.matches("\\d{10}")) {
            
            return true;
            
        }else{
            return false;
        }
    }
    
}
