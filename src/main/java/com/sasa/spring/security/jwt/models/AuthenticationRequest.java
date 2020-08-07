package com.sasa.spring.security.jwt.models;

import java.io.Serializable;

public class AuthenticationRequest implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7409791549387469849L;

	private String username;
	private String password;

	/**
	 * need default constructor for JSON Parsing
	 */
	public AuthenticationRequest() {
		super();
	}

	protected AuthenticationRequest(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
