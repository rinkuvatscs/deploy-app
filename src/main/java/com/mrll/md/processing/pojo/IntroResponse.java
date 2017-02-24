package com.mrll.md.processing.pojo;

public class IntroResponse {

	private String projectName ;
	
	private String description ;
	
	public IntroResponse() {
		
	}
	
	public IntroResponse(String projectName , String description){
		this.projectName = projectName ;
		this.description = description ;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
