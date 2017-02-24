package com.mrll.md.processing.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "unique")
public class UniqueTask {

    @Id
    private String id;

    private String name ;
    
    private String mobileNumber ;
    
    @Indexed(sparse = true , unique = true)
    Integer uniqueTaskId;
    
    public String getId() {
    
        return id;
    }


    
    public void setId(String id) {
    
        this.id = id;
    }


    
    public String getName() {
    
        return name;
    }


    
    public void setName(String name) {
    
        this.name = name;
    }


    
    public String getMobileNumber() {
    
        return mobileNumber;
    }


    
    public void setMobileNumber(String mobileNumber) {
    
        this.mobileNumber = mobileNumber;
    }


    
    public Integer getUniqueTaskId() {
    
        return uniqueTaskId;
    }


    
    public void setUniqueTaskId(Integer uniqueTaskId) {
    
        this.uniqueTaskId = uniqueTaskId;
    }


}
