package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="stud")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int o;
	private int id;
	public int getO() {
		return o;
	}
	public void setO(int o) {
		this.o = o;
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
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	private String name;
	private String dep;
}
