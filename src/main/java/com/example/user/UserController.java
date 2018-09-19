package com.example.user;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ResponseEntity<UserModel> save(HttpServletRequest request,@RequestBody UserModel user){
		System.out.println("=====> Model "+ user);
		userService.save(user);
		return new ResponseEntity<UserModel>(user,HttpStatus.OK);
		
	}
	
	@RequestMapping(value="fetchAll", method = RequestMethod.GET)
	public ResponseEntity<List<UserModel>> fetch(HttpServletRequest request){
		List<UserModel> list = (List<UserModel>) userService.fetchUser();
		return new ResponseEntity<List<UserModel>>(list,HttpStatus.OK);
		
	}
	
	@RequestMapping(value="/fetchOne/{id}", method = RequestMethod.GET)
	public ResponseEntity<List<UserModel>> one(@PathVariable("id") String id,HttpServletRequest request){
		System.out.println(id);
		System.out.println("SRRRS");		
		List<UserModel> user = userService.fetchUserById(id);
		System.out.println("AAA AA "+user);
		return new ResponseEntity<List<UserModel>>(user,HttpStatus.OK);
		
	}
	
	
	

}
