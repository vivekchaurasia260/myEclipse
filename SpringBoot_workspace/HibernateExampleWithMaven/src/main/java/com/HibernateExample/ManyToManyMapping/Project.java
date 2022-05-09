package com.HibernateExample.ManyToManyMapping;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	
	@Id
	private int pid;
	
	@Column(name = "project_name")
	private String projectName;
	
	@ManyToMany(mappedBy = "projects", fetch = FetchType.EAGER)
	private List<Employee> employees;

	public Project() {
		super();
	}
	
	public Project(int pid, String projectName, List<Employee> employees) {
		super();
		this.pid = pid;
		this.projectName = projectName;
		this.employees = employees;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Project [pid=" + pid + ", projectName=" + projectName + ", employees=" + employees + "]";
	}
	
}
