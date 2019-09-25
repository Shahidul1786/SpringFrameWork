/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shahid;

import java.util.List;
import org.springframework.beans.factory.annotation.Required;



/**
 *
 * @author Shahidul
 */
public class Employee {
    
    private Address address;

    public Address getAddress() {
        return address;
    }

    @Required
    public void setAddress(Address address) {
        this.address = address;
    }
    
    
    
    
    /*private List<Address> address1;

    public List<Address> getAddress1() {
        return address1;
    }

    public void setAddress1(List<Address> address1) {
        this.address1 = address1;
    }
    
    */
    
   // after list<> collection;
    
    /* private Address address2;

   public Address getAddress1() {
        return address1;
    }

    public void setAddress1(Address address1) {
        this.address1 = address1;
    }

    public Address getAddress2() {
        return address2;
    }

    public void setAddress2(Address address2) {
        this.address2 = address2;
    }
    
   */ 
    
    
    
  /*  private int id;
    private String name;
    
    private List<Address> addresses;
    
   // private Address address;
    
    public Employee() {
    }
    
    public Employee(int id) {
        this.id = id;
    }
    
    public Employee(String name) {
        this.name = name;
    }
    
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Employee(int id, String name, List<Address> addresses) {
        this(id, name);
        this.addresses = addresses;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
    
    
    public Employee(int id, String name, Address address) {
        this(id, name);
        this.address = address;
    }
    */
    
    
    public void show() {
        
        System.out.println(address.toString());
        //System.out.println(address2);
        
        
        
        
       /* System.out.print(id + " : " + name+" ");
        
        Iterator<Address> iterator = addresses.iterator();
        
        while (iterator.hasNext()) {
            
            System.out.println(iterator.next());
            
        }
*/
       
    }
    
}
