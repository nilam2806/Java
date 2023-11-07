package com.training.com;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Embeddable 
class Department {
	@Id
	private int dept_id;
	private String department_name;
	private int department_head;
	
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	public String getDepartment_name() {
		return department_name;
	}
	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}
	public int getDepartment_head() {
		return department_head;
	}
	public void setDepartment_head(int department_head) {
		this.department_head = department_head;
	}
	
	
	

}
