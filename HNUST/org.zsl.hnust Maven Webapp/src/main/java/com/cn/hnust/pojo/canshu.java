package com.cn.hnust.pojo;

public class canshu {
	public Integer id;
	public String password;
	public canshu(Integer id, String password) {
		super();
		this.id = id;
		this.password = password;
	}
	public canshu() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
