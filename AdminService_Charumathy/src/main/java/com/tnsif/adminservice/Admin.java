package com.tnsif.adminservice;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Admin {
	@Id
	@Column(name="Cid")
private int id;
	@Column(name="Cname")
private String name;
	@Column(name="Ccontactno")
private int contactno;
	@Column(name="Cdept")
private String dept;
	@Column(name="Cyear")
private int year;
	
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(int id, String name, int contactno, String dept, int year) {
		super();
		this.id = id;
		this.name = name;
		this.contactno = contactno;
		this.dept = dept;
		this.year = year;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getContactno() {
		return contactno;
	}

	public void setContactno(int contactno) {
		this.contactno = contactno;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", name=" + name + ", contactno=" + contactno + ", dept=" + dept + ", year=" + year
				+ "]";
	}
	
}

