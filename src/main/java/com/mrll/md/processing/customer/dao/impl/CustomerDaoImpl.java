package com.mrll.md.processing.customer.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import com.mrll.md.processing.customer.dao.CustomerDao;
import com.mrll.md.processing.pojo.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	@Value("${collectionName}")
	private String collectionName;

	@Value("${customerAddedSucess}")
	private String customerAddedSucess;
	@Autowired
	MongoTemplate mongoTemplate;

	@Override
	public Customer addCustomer(Customer customer) {

		mongoTemplate.insert(customer, collectionName);
		return customer;
	}

	@Override
	public Customer deleteCustomer(String custId) {
		return mongoTemplate.findAndRemove(new Query(Criteria.where("custId").is(custId)), Customer.class);
	}

	@Override
	public Customer findCustomerByCustomerId(String custId) {
		return mongoTemplate.findOne(new Query(Criteria.where("custId").is(custId)), Customer.class);
	}

	@Override
	public List<Customer> findAllCustomers() {
		return mongoTemplate.find(new Query(), Customer.class);
	}

	@Override
	public Customer modifyCustomer(Customer customer) {
		Update update = null;
		if (StringUtils.isEmpty(customer)) {
			update = new Update();
			if (!StringUtils.isEmpty(customer.getName())) {
				update.set("name", customer.getName());
			}
			if (!StringUtils.isEmpty(customer.getMobNum())) {
				update.set("mobNum", customer.getMobNum());
			}
			if (!StringUtils.isEmpty(customer.getEmail())) {
				update.set("email", customer.getEmail());
			}

		}
		return mongoTemplate.findAndModify(new Query(Criteria.where("custId").is(customer.getCustId())), update, Customer.class);
	}

}
