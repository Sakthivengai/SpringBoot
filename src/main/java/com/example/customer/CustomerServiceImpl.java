package com.example.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerRepository custRep;
	
	@Override
	public void save(CustomerModel customer) {
		custRep.save(customer);		
	}

}
