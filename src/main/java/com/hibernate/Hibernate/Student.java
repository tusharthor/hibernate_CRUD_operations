package com.hibernate.Hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
//want another table name
//@Table(name="table_name")
public class Student {
	
	//variable name = column name///////////////////////
	@Id
	private int id;
	//(1)if want another name for column/////////////////////////
		//@Column(name="col_name")
	private String name;
	//(2)want to drop column (that variable will not be get stored)
		//@Transient
	
	public String getStudentName() {
		return name;
	}
	public void setStudentName(String studentName) {
		this.name = studentName;
	}
	public int getStudentId() {
		return id;
	}
	public void setStudentId(int studentId) {
		this.id = studentId;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id is\t"+id+"\nname is\t"+name;
	}
}
