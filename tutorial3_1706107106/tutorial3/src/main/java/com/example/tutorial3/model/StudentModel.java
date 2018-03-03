package com.example.tutorial3.model;

public class StudentModel {
	private String name;
	private String npm;
	private double gpa;
	
	public StudentModel(String name, String npm, double gpa) {
		this.name = name;
		this.npm = npm;
		this.gpa = gpa;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getNpm() {
		return this.npm;
	}
	public void setNpm(String npm) {
		this.npm = npm;
	}
	
	public double getGpa() {
		return this.gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
}
