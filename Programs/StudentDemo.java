package com.srm;

public class StudentDemo {

	public static void main(String[] args) {
		Student student1 = new Student();
		Student student2 = new Student(1001,"Rahul Dravid",9.84,"CSE");
		System.out.println("Register Number of Student-1:"+student1.getRegisterNumber());
		System.out.println("Register Number of Student-2:"+student2.getRegisterNumber());
		student1.setRegisterNumber(4001);
		System.out.println("Register Number of Student-1:"+student1.getRegisterNumber());
		student2.setRegisterNumber(3001);
		System.out.println("Register Number of Student-2:"+student2.getRegisterNumber());
	}

}

class Student{
	private int registerNumber;
	private String name;
	private double cgpa;
	private String departmentName;
	
	public Student(int registerNumber, String name, double cgpa, String departmentName) {
		super();
		this.registerNumber = registerNumber;
		this.name = name;
		this.cgpa = cgpa;
		this.departmentName = departmentName;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public int getRegisterNumber() {
		return registerNumber;
	}
	public void setRegisterNumber(int registerNumber) {
		this.registerNumber = registerNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
}
