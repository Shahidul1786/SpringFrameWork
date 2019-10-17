package com.shahid.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity(name="TESTDB")
public class ModelTestdb {

	@Id @GenericGenerator(name = "custom_sequence", strategy = 
			"com.shahid.IdGenerator")
	@GeneratedValue(generator = "custom_sequence")
	@Column(name="ID")
	private int id;
	@Column(name="NAME")
	private String name;
	@Column(name="SALARY")
	private int salary;
	@Column(name="DESIGNATION")
	private String designation;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "ModelTestdb [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation + "]";
	}
	
	
}
