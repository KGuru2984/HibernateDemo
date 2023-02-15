package com.edubridge.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class UsersDetails 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int UserID;
	@Column(nullable = false)
	private String UserFirstName;
	@Column(nullable = false)
	private String UserLastName;
	@Column(nullable = false,unique = true,updatable = false)
	private String EmailID;
	@Column(nullable = false)
	private String UserPassword;
	@Column(nullable=false)
	private String Status;
	public int getUserID() {
		return UserID;
	}
	public void setUserID(int userID) {
		UserID = userID;
	}
	public String getUserFirstName() {
		return UserFirstName;
	}
	public void setUserFirstName(String userFirstName) {
		UserFirstName = userFirstName;
	}
	public String getUserLastName() {
		return UserLastName;
	}
	public void setUserLastName(String userLastName) {
		UserLastName = userLastName;
	}
	public String getEmailID() {
		return EmailID;
	}
	public void setEmailID(String emailID) {
		EmailID = emailID;
	}
	public String getUserPassword() {
		return UserPassword;
	}
	public void setUserPassword(String userPassword) {
		UserPassword = userPassword;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	
	
	
}
