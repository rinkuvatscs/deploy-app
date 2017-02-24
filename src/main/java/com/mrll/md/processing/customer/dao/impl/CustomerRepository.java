package com.mrll.md.processing.customer.dao.impl;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mrll.md.processing.pojo.Customer;

public interface CustomerRepository extends MongoRepository<Customer , String>{

	public Customer findByCustId(String custId);
	
}
