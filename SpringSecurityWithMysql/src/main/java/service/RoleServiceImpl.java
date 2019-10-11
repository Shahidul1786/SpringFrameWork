package service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Role;
import repository.RoleRepository;


@Service
public class RoleServiceImpl  implements RoleService{
	
	@Autowired
	RoleRepository roleRepositary;
	

	@Override
	public void addRole(Role role) {
		roleRepositary.save(role);
		
	}

}
