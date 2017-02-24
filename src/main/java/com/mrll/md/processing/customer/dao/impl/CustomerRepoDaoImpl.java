package com.mrll.md.processing.customer.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mrll.md.processing.customer.dao.CustomerDao;
import com.mrll.md.processing.pojo.Customer;

@Repository
public class CustomerRepoDaoImpl implements CustomerDao{

	@Autowired
	CustomerRepository customerRepository;
	
	
	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer deleteCustomer(String custId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer findCustomerByCustomerId(String custId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> findAllCustomers() {
		return customerRepository.findAll();
	}

	@Override
	public Customer modifyCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
