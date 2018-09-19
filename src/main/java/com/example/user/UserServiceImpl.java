package com.example.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRep;	
	

	@Override
	public void save(UserModel user) {
		userRep.save(user);	
	}

	public List<UserModel> fetchUser() {
		List<UserModel> userList = (List<UserModel>) userRep.findAll();
		return userList;
	}

	@Override
	public List<UserModel> fetchUserById(String id) {
		System.out.println(id);
		System.err.println("SSSSSSSSSSSS");
		List<UserModel> userList = (List<UserModel>) userRep.findBySearchTerm(id);
		System.err.println("SSSSSSSSSSSS"+userList);
		return userList;
	}



	

}
