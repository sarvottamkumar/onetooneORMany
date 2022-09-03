package com.studentapp.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Student {
	
	@Column(length=20)
	private String name;
	
	@Id
	@GeneratedValue(generator="stud_gen",strategy = GenerationType.AUTO)
	@SequenceGenerator(name="stud_gen", sequenceName = "student_seq",initialValue = 1,allocationSize = 1)
	private Integer studentId;
	@Column(length=20)
	private String department;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="address_id") //to give a different column name
	private Address address;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, String department, Address address) {
		super();
		this.name = name;
		this.department = department;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", studentId=" + studentId + ", department=" + department + "]";
	}
	
	
	
	

}
