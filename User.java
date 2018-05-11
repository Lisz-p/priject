package com.bj.bean;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class User {

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Integer user_id, String user_account, String user_name, String emp, String position, Integer salary,
			Date createDate, String gender) {
		super();
		this.user_id = user_id;
		this.user_account = user_account;
		this.user_name = user_name;
		this.emp = emp;
		this.position = position;
		this.salary = salary;
		this.createDate = createDate;
		this.gender = gender;
	}
	private Integer user_id; 
	private String user_account;
	private String user_name; 
	private String emp;
	private String position;
	private Integer salary;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createDate;
	private String gender;
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getUser_account() {
		return user_account;
	}
	public void setUser_account(String user_account) {
		this.user_account = user_account;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getEmp() {
		return emp;
	}
	public void setEmp(String emp) {
		this.emp = emp;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
}
