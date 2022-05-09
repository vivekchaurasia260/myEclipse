package com.HibernateExample.ManyToManyMapping;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Employee {
	
	@Id
	@Column(name = "eid")
	private int empId;
	
	private String name;
	 
	@ManyToMany
	@JoinTable
	(
			name = "emp_learn", 
			joinColumns = {@JoinColumn(name = "eid")},
			inverseJoinColumns = {@JoinColumn(name = "pid")}
	)
	private List<Project> projects;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String name, List<Project> projects) {
		super();
		this.empId = empId;
		this.name = name;
		this.projects = projects;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", projects=" + projects + "]";
	}
	

}
