package com.mrll.md.processing.location.repository;

import org.bson.types.ObjectId;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.GeoResults;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.mrll.md.processing.location.pojo.Doctor;

public interface LocationRepository extends MongoRepository<Doctor, ObjectId>{

    
    public GeoResults<Doctor> findByLocationNear(Point point, Distance distance);
    
}
