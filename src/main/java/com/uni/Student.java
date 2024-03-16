package com.uni;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;


@Entity
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class Student {
	@Id
	int id;
	String asname;
	String sadd;
	int fees;
	
	

	public Student() {
		super();
		
	}



	public Student(int id, String asname, String sadd, int fees) {
		super();
		this.id = id;
		this.asname = asname;
		this.sadd = sadd;
		this.fees = fees;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getAsname() {
		return asname;
	}



	public void setAsname(String asname) {
		this.asname = asname;
	}



	public String getSadd() {
		return sadd;
	}



	public void setSadd(String sadd) {
		this.sadd = sadd;
	}



	public int getFees() {
		return fees;
	}



	public void setFees(int fees) {
		this.fees = fees;
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", asname=" + asname + ", sadd=" + sadd + ", fees=" + fees + "]";
	}



	
}
