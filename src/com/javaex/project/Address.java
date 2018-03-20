package com.javaex.project;

public class Address {
	
	private String name;
	private String ph;
	private String company;
	
	public Address() {
	}
	public Address(String name, String ph, String company) {
		this.name = name;
		this.ph = ph;
		this.company = company;	
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPh() {
		return ph;
	}
	public void setPh(String ph) {
		this.ph = ph;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	@Override
	public String toString() {
		
		return name + " " + ph + " " + company ;
	
	
	}
	
	

}

