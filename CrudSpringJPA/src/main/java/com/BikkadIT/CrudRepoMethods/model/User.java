package com.BikkadIT.CrudRepoMethods.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="USER_DETAILES")
public class User {


	@Id
	@Column(name = "USER_ID")
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int userId;
	
	@Column(name = "USER_NAME")
	private String userName;
	
	@Column(name = "USER_ADDRESS")
	private String userAddress;
	
	@Column(name = "USER_AGE")
	private int userAge;
	
	@Column(name = "USER_EMAIL")
	private String userEmail;
	
	@Column(name = "USER_PASS")
	private String  userPass;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public int getUserage() {
		return userAge;
	}

	public void setUserage(int i) {
		this.userAge = i;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userAddress=" + userAddress + ", userage="
				+ userAge + ", userEmail=" + userEmail + ", userPass=" + userPass + "]";
	}
	
	
	
}
