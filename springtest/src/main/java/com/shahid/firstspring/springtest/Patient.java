package com.shahid.firstspring.springtest;

public class Patient {
	
	
	//private int id=10;
	//private String name="shahidul";
	
	private int id;
	private String name;
	
	public Patient() {
		
	}



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


	

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + "]";
	}



	public void Speak() {
		
		System.out.println("Help me");
	}

}
