package com.shahid.model;

import java.util.ArrayList;
import java.util.Date;
import javax.validation.constraints.Size;


public class Employee {

  @Size(min=3,max=30)  
  private String ename;
  private String eaddress;

  private Long empMobile;
  private Date empDob;
   private ArrayList<String> skillTest;
   
   private Department department;
   
   

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

    public Long getEmpMobile() {
        return empMobile;
    }

    public void setEmpMobile(Long empMobile) {
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
