package com.solanki.functionaInterface;

public class Employee {
	
	int eid;
	String ename;
	String location;
	public Employee(int eid, String ename, String location) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.location = location;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	

}
