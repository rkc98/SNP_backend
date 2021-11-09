package com.shopnpay.admin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class Admin {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer id;

	@Column
	private String username;
	
	@Column
	private String empid;
	
	@Column
	private String email;
	
	@Column
	private String mobile;
	
	
	
	

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(String username, String empid, String email, String mobile) {
		super();
		this.username = username;
		this.empid = empid;
		this.email = email;
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", username=" + username + ", empid=" + empid + ", email=" + email + ", mobile="
				+ mobile + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
}
