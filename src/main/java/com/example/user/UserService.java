package com.example.user;

import java.util.List;


public interface UserService {
	
	public void save(UserModel user);
	
	public List<UserModel> fetchUser();	
	
	public List<UserModel> fetchUserById(String id);

}
