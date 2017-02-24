package com.mrll.md.processing.customer.dao.impl;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mrll.md.processing.pojo.UniqueTask;

public interface UniqueTaskRepository extends MongoRepository<UniqueTask, String>{

    
    public UniqueTask findById(String id) ;
}
