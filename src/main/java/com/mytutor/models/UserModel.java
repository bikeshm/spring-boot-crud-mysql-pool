package com.mytutor.models;


//@JsonIgnoreProperties(ignoreUnknown = true)

public class UserModel {
	private long id;
	
	//@JsonProperty("VendorId")
	private String name;
	private String email;
	
	public UserModel() {
		super();
	}

	public UserModel(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	@Override
	public String toString() {
		return "UserModel [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
	
}
