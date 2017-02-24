package com.mrll.md.processing.location.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.GeoResults;
import org.springframework.data.geo.Metrics;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mrll.md.processing.location.pojo.Doctor;
import com.mrll.md.processing.location.repository.LocationRepository;

@RestController
@RequestMapping(value = "/location")
public class LocationController {

    @Autowired
    private LocationRepository locationRepository;

    @RequestMapping(value = "/addDoctor", method = RequestMethod.POST)
    public Doctor addDoctor(@RequestBody Doctor doctor) {

        return locationRepository.save(doctor);
    }

    @RequestMapping(value = "/find", method = RequestMethod.POST)
    public GeoResults<Doctor> findDoctor(@RequestBody Doctor doctor) {

        Distance distance = new Distance(50, Metrics.KILOMETERS);
        return locationRepository.findByLocationNear(doctor.getLocation(), distance);
    }

}
