package com.mrll.md.processing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mrll.md.processing.customer.dao.CustomerDao;
import com.mrll.md.processing.pojo.Customer;
import com.mrll.md.processing.pojo.IntroResponse;

@RestController
@RequestMapping(value="/api/md/" , produces = MediaType.APPLICATION_JSON_VALUE)
public class MDController {

	static final String PROJECT_NAME = "MD" ;
	static final String DESCRIPTION = "Introduction to Hello World" ;
	
	
	@Autowired
	CustomerDao customerDaoImpl ;
	
	@RequestMapping("/intro")
	public IntroResponse intro() {
		
		return new IntroResponse(PROJECT_NAME , DESCRIPTION );
	}
	
	
	@RequestMapping(value = "/addcustomer" , method= RequestMethod.POST)
	public Customer addCustomer(@RequestBody Customer customer){
		
			return customerDaoImpl.addCustomer(customer);
	}
	
	
	@RequestMapping(value = "/findcustomerByCustomerId/{custId}")
	public Customer findCustomer(@PathVariable String custId) {
		return customerDaoImpl.findCustomerByCustomerId(custId); 
	}
	
	
	@RequestMapping(value = "/findcustomers")
	public List<Customer> findCustomers() {
		return customerDaoImpl.findAllCustomers(); 
	}
	
	
	@RequestMapping(value = "/deleteCustomerByCustomerId/{custId}")
	public Customer deleteCustomerByCustId(@PathVariable String custId) {
		return customerDaoImpl.deleteCustomer(custId); 
	}
	
	@RequestMapping(value = "/updateCustomer" , method= RequestMethod.POST)
	public Customer updateCustomer(@RequestBody Customer customer) {
		return customerDaoImpl.modifyCustomer(customer);
	}
	
	
	
	
	
}
