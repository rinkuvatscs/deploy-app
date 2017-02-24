package com.mrll.md.processing.location.pojo;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.core.index.GeoSpatialIndexType;
import org.springframework.data.mongodb.core.index.GeoSpatialIndexed;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "doctor")
public class Doctor {

    @Id
    private ObjectId  id;
    private String name;
    @Indexed(sparse = true, unique = true)
    private String mobile;
    private String homeAddress;
    @Indexed(sparse = true, unique = true)
    private String aadhaarNumber;
    private String highestDegree;
    private String expertized;
    private Boolean isGovernmentServent;
    private String oneTimeFee;
    private Integer daysCheckFree;
    private String clinicAddress;
    @Indexed(sparse = true, unique = true)
    private String email;
    private String gender;
    private int age;
    @GeoSpatialIndexed(type = GeoSpatialIndexType.GEO_2DSPHERE)
    private Point location ;
    
    
   

    
    public Point getLocation() {
    
        return location;
    }

    
    public void setLocation(Point location) {
    
        this.location = location;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public String getGender() {

        return gender;
    }

    public void setGender(String gender) {

        this.gender = gender;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public ObjectId getId() {

        return id;
    }

    public void setId(ObjectId id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getMobile() {

        return mobile;
    }

    public void setMobile(String mobile) {

        this.mobile = mobile;
    }

    public String getHomeAddress() {

        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {

        this.homeAddress = homeAddress;
    }

    public String getAadhaarNumber() {

        return aadhaarNumber;
    }

    public void setAadhaarNumber(String aadhaarNumber) {

        this.aadhaarNumber = aadhaarNumber;
    }

    public String getHighestDegree() {

        return highestDegree;
    }

    public void setHighestDegree(String highestDegree) {

        this.highestDegree = highestDegree;
    }

    public String getExpertized() {

        return expertized;
    }

    public void setExpertized(String expertized) {

        this.expertized = expertized;
    }

    public Boolean getIsGovernmentServent() {

        return isGovernmentServent;
    }

    public void setIsGovernmentServent(Boolean isGovernmentServent) {

        this.isGovernmentServent = isGovernmentServent;
    }

    public String getOneTimeFee() {

        return oneTimeFee;
    }

    public void setOneTimeFee(String oneTimeFee) {

        this.oneTimeFee = oneTimeFee;
    }

    public Integer getDaysCheckFree() {

        return daysCheckFree;
    }

    public void setDaysCheckFree(Integer daysCheckFree) {

        this.daysCheckFree = daysCheckFree;
    }

    public String getClinicAddress() {

        return clinicAddress;
    }

    public void setClinicAddress(String clinicAddress) {

        this.clinicAddress = clinicAddress;
    }

    @Override
    public String toString() {

        return "Doctor [Id=" + id + ", name=" + name + ", mobile=" + mobile + ", homeAddress=" + homeAddress
                + ", aadhaarNumber=" + aadhaarNumber + ", highestDegree=" + highestDegree + ", expertized=" + expertized
                + ", isGovernmentServent=" + isGovernmentServent + ", oneTimeFee=" + oneTimeFee + ", daysCheckFree="
                + daysCheckFree + ", clinicAddress=" + clinicAddress + "]";
    }

}
