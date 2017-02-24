package com.mrll.md.processing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mrll.md.processing.customer.dao.impl.UniqueTaskRepository;
import com.mrll.md.processing.pojo.UniqueTask;

@RestController
public class UniqueTaskController {

    @Autowired
    UniqueTaskRepository uniqueTaskRepository;

    @Autowired
    MongoTemplate mongoTemplate;

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public UniqueTask uniqueTaskId(@RequestBody UniqueTask uniqueTask) {

        return uniqueTaskRepository.save(uniqueTask);

    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public UniqueTask updateUniqueTaskId(@PathVariable String id) {

        UniqueTask uniqueTask = uniqueTaskRepository.findById(id);
        uniqueTask.setUniqueTaskId(1);
        return uniqueTaskRepository.save(uniqueTask);
    }

    @RequestMapping(value = "/update/name/{id}", method = RequestMethod.GET)
    public UniqueTask updateUniqueTaskIdForName(@PathVariable String id) {

        UniqueTask uniqueTask = uniqueTaskRepository.findById(id);
        uniqueTask.setName("UpdateRinku");
        return uniqueTaskRepository.save(uniqueTask);
    }

    @RequestMapping(value = "/max", method = RequestMethod.GET)
    public UniqueTask maxUniqueTask() {

        Query query = new Query();
        query.limit(1);
        query.with(new Sort(Sort.Direction.DESC, "uniqueTaskId"));
        
      return   mongoTemplate.find(query, UniqueTask.class).get(0);

    }

}
