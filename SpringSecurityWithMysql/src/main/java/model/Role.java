package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Role {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private Integer id;
	private String role;
	private int activeStatus;
	
	public Role() {
		
	}

	public Role(int id, String role, int activeStatus) {
		
		this.id = id;
		this.role = role;
		this.activeStatus = activeStatus;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(int activeStatus) {
		this.activeStatus = activeStatus;
	}
	
	
	
	
	

}
