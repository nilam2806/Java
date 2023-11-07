package com.training.com;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Employee {
	@Id
	private int e_id;
	private String e_name;

	@ElementCollection
	private List<Address> address = new ArrayList<Address>();
	private Department dept;
	
	public Department getDepartment() {
		return dept;
	}
	
	public void setDepartment(Department dept) {
		this.dept = dept;
	}
	
//	private int dept_id;
//	
//	public int getDepartment() {
//		return dept_id;
//	}
//	public void setDepartment(int dept_id) {
//		this.dept_id=dept_id;
//	}

	public int getE_id() {
		return e_id;
	}

	public void setE_id(int e_id) {
		this.e_id = e_id;
	}

	public String getE_name() {
		return e_name;
	}

	public void setE_name(String e_name) {
		this.e_name = e_name;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

}
