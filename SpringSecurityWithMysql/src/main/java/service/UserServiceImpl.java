package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.User;
import repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
	UserRepository userRepositary;
	
	@Override
	public void addUser(User user) {
		userRepositary.save(user);
		
	}

}
