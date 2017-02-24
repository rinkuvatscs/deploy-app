package com.mrll.md.processing.pojo;
import org.springframework.data.annotation.Id;
public class Customer  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String mobNum;
	private String email;
	private String custId ;
	
	
	public Customer(){
		
	}
	
	@Id
	private String id ;
	public Customer(String id , String name, String mobNum, String email, String custId ) {
		super();
		this.name = name;
		this.mobNum = mobNum;
		this.email = email;
		this.custId = custId;
		this.id = id;
	}
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
	public String getMobNum() {
		return mobNum;
	}
	public void setMobNum(String mobNum) {
		this.mobNum = mobNum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	
}
