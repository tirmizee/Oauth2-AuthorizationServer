package com.tirmizee.api.data;

public class UserData {
	
	private String name;
	private String email;
	
	public UserData(String name, String email) {
		super();
		this.name = name;
		this.email = email;
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
		return "UserData [name=" + name + ", email=" + email + "]";
	}

}
