package com.example.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	CustomerService custService;
	
	@RequestMapping(value="/save",method = RequestMethod.POST)
	public ResponseEntity<CustomerModel> save(@RequestBody CustomerModel customer){
		custService.save(customer);
		return new ResponseEntity<CustomerModel>(HttpStatus.OK);
		
	}

}
