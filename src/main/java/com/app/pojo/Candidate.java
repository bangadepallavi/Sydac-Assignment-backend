package com.app.pojo;

public class Candidate {
	private int id=0;
	private String name;
	private String email;
	private String city;
	private String state;
	private long mobile;
	private int age;
	private String dob;
	private int postalCode;
	public Candidate(int id,String name, String email, String city, String state, long mobile, int age, String dob,
			int postalCode) {
		super();
		this.id=id;
		System.out.println("id---------------------"+id);
		this.name = name;
		this.email = email;
		this.city = city;
		this.state = state;
		this.mobile = mobile;
		this.age = age;
		this.dob = dob;
		this.postalCode = postalCode;
	}
	public Candidate() {
		super();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	@Override
	public String toString() {
		return "Candidate [id="  +id+", name=" + name + ", email=" + email + ", city=" + city + ", state=" + state + ", mobile="
				+ mobile + ", age=" + age + ", dob=" + dob + ", postalCode=" + postalCode + "]";
	}
	
	
	
	
}
