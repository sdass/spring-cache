package com.subra.springcache;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User implements Serializable {


	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue
	private Long id;
	private String name;
	private String teamName;
	private Double salary;
	public User(){}
	public User(String name, String teamName, Double salary) {
		this.name = name;
		this.teamName = teamName;
		this.salary = salary;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", teamName=" + teamName
				+ ", salary=" + salary + "]";
	}
	
	
}
