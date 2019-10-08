package com.shahid.model;

import com.shahid.controller.Phone;
import java.util.ArrayList;
import java.util.Date;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;


public class Employee {

  @Size(min=3,max=30)  
  private String ename;
  @NotEmpty
  private String eaddress;
  
  @Phone
  private String empMobile;
  @Past
  private Date empDob;
  
   private ArrayList<String> skillTest;
   
   private Department department;
   
   @Email
   private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
   
   

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEaddress() {
        return eaddress;
    }

    public void setEaddress(String eaddress) {
        this.eaddress = eaddress;
    }

    public String getEmpMobile() {
        return empMobile;
    }

    public void setEmpMobile(String empMobile) {
        this.empMobile = empMobile;
    }

    public Date getEmpDob() {
        return empDob;
    }

    public void setEmpDob(Date empDob) {
        this.empDob = empDob;
    }

  

    public void setSkillTest(ArrayList<String> skillTest) {
        this.skillTest = skillTest;
    }

    public ArrayList<String> getSkillTest() {
        return skillTest;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
    
    

}
