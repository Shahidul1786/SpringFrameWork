/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shahid.service;

import com.shahid.model.Accountant;
import com.shahid.model.Manager;

/**
 *
 * @author Shahidul
 */
public class EmpService {
    
    private Manager manager;
    private Accountant accountant;

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Accountant getAccountant() {
        return accountant;
    }

    public void setAccountant(Accountant accountant) {
        this.accountant = accountant;
    }
    
    
    
    
}
