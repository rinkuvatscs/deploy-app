package com.mrll.md.processing.customer.dao;

import java.util.List;

import com.mrll.md.processing.pojo.Customer;

public interface CustomerDao {

	public Customer addCustomer(Customer customer);
	
	public Customer deleteCustomer(String custId);
	
	public Customer findCustomerByCustomerId(String custId);
	
	public List<Customer> findAllCustomers();
	
	public Customer modifyCustomer(Customer customer);
	
}
