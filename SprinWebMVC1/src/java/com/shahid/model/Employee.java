package com.shahid.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Employee {

    String ename;
    String eaddress;

  private Long empMobile;
  private Date empDob;
   private ArrayList<String> skillTest;

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
    
    

}
