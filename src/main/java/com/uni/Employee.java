package com.uni;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Employee {
	@Id
	int id;
	@Column(name="Ename")
	String Empname;
	int sal;
	@Transient
	int x;
	@Override
	public String toString() {
		return "Employee [id=" + id + ", Empname=" + Empname + ", sal=" + sal + ", x=" + x + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpname() {
		return Empname;
	}
	public void setEmpname(String empname) {
		Empname = empname;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public Employee(int id, String empname, int sal, int x) {
		super();
		this.id = id;
		Empname = empname;
		this.sal = sal;
		this.x = x;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	
}
