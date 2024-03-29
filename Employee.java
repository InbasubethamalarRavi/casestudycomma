package com;

public class Employee {
	private String first_name;
	private String last_name;
	private String company_name;
	private String address;
	private String city;
	private String country;
	private String state;
	private String zip;
	private String phone_num1;
	private String phone_num2;
	private String email_id;
	private String web;
	public Employee(String first_name, String last_name, String company_name,
			String address, String city, String country, String state,
			String zip, String phone_num1, String phone_num2, String email_id,
			String web) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.company_name = company_name;
		this.address = address;
		this.city = city;
		this.country = country;
		this.state = state;
		this.zip = zip;
		this.phone_num1 = phone_num1;
		this.phone_num2 = phone_num2;
		this.email_id = email_id;
		this.web = web;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getPhone_num1() {
		return phone_num1;
	}
	public void setPhone_num1(String phone_num1) {
		this.phone_num1 = phone_num1;
	}
	public String getPhone_num2() {
		return phone_num2;
	}
	public void setPhone_num2(String phone_num2) {
		this.phone_num2 = phone_num2;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	}
