package com.kplan.test;

public class Employee {
	
	private int eid; //employee id
	private String ename; // employee name
	private int mid;//manager id
	
	public Employee(int eid, String ename, int mid) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.mid = mid;
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
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	
	
	
	

}
