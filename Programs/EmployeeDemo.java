package com.srm;

import java.util.Scanner;

public class EmployeeDemo {

	public static void main(String[] args) {
		getEmployeeData();
	}
	
	public static void getEmployeeData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employee type- 1. Software Engineer  2. Designer 3. Accountant 4.Manager:");
		int employeeType = sc.nextInt();
		System.out.println("Enter the employee ID:");
		int empid = sc.nextInt();
		//to consume new line 
		sc.nextLine();
		System.out.println("Enter the employee Name:");
		String name = sc.nextLine();
		System.out.println("Enter the basic pay:");
		double basic = sc.nextDouble();
		switch(employeeType) {
		case 1: 
			Employee employee1 = new SoftwareEngineer(empid, name, basic, "SoftwareEngineer");
			employee1.computeSalary();
			generateSalarySlip(employee1.getEmployeeId(),employee1.getEmployeeName(),employee1.getBasicPay(),employee1.getDa(),employee1.getHra(),employee1.getAllowance(),employee1.getPf(),employee1.getSalary(),employee1.getDesignation());
			break;
		case 2:
			Employee employee2 = new Designer(empid, name, basic,"Designer");
			employee2.computeSalary();
			generateSalarySlip(employee2.getEmployeeId(),employee2.getEmployeeName(),employee2.getBasicPay(),employee2.getDa(),employee2.getHra(),employee2.getAllowance(),employee2.getPf(),employee2.getSalary(),employee2.getDesignation());
			break;
		case 3:
			Employee employee3 = new Accountant(empid, name, basic, "Accountant");
			employee3.computeSalary();
			generateSalarySlip(employee3.getEmployeeId(),employee3.getEmployeeName(),employee3.getBasicPay(),employee3.getDa(),employee3.getHra(),employee3.getAllowance(),employee3.getPf(),employee3.getSalary(),employee3.getDesignation());
			break;
		case 4:
			Employee employee4 = new Manager(empid, name, basic, "Manager");
			employee4.computeSalary();
			generateSalarySlip(employee4.getEmployeeId(),employee4.getEmployeeName(),employee4.getBasicPay(),employee4.getDa(),employee4.getHra(),employee4.getAllowance(),employee4.getPf(),employee4.getSalary(),employee4.getDesignation());
			break;
		default:
			System.out.println("Invalid Employee Type");
		}
	}
	
	public static void generateSalarySlip(int empid, String name, double basic, double da, double hra, double allow, double pf, double sal, String designation) {
		System.out.println("Salary Slip");
		System.out.println("Designation:"+designation);
		System.out.println("Employee ID:"+empid);
		System.out.println("Employee Name:"+name);
		System.out.println("Basic Pay:"+basic);
		System.out.println("Dearness Allowance:"+da);
		System.out.println("Other Allowances:"+allow);
		System.out.println("Provident Fund:"+pf);
		System.out.println("Net Salary:"+sal);
	}

}

abstract class  Employee{
	protected int employeeId;
	protected String employeeName;
	protected double basicPay;
	protected double da;
	protected double hra;
	protected double allowance;
	protected double pf;
	protected double salary;
	protected String designation ;
		
	public Employee(int employeeId, String employeeName, double basicPay, String designation) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicPay = basicPay;
		this.designation = designation;
	}

	
	public int getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public double getBasicPay() {
		return basicPay;
	}


	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}


	public double getDa() {
		return da;
	}


	public void setDa(double da) {
		this.da = da;
	}


	public double getHra() {
		return hra;
	}


	public void setHra(double hra) {
		this.hra = hra;
	}


	public double getAllowance() {
		return allowance;
	}


	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}


	public double getPf() {
		return pf;
	}


	public void setPf(double pf) {
		this.pf = pf;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public abstract double computeSalary();
}

class Accountant extends Employee{

	public Accountant(int employeeId, String employeeName, double basicPay, String designation) {
		super(employeeId, employeeName, basicPay, designation);
	}

	@Override
	public double computeSalary() {
		this.da = this.basicPay * 0.75;
		setDa(this.da);
		this.hra = this.basicPay * 0.30;
		setHra(this.hra);
		this.allowance = this.basicPay * 0.20;
		setAllowance(this.allowance);
		this.pf = (this.basicPay + this.da)*0.12;
		setPf(this.pf);
		this.salary = this.basicPay + this.da + this.hra + this.allowance - this.pf;
		setSalary(this.salary);
		return this.salary;
	}
	
}


class SoftwareEngineer extends Employee{

	public SoftwareEngineer(int employeeId, String employeeName, double basicPay, String designation) {
		super(employeeId, employeeName, basicPay, designation);
	}

	@Override
	public double computeSalary() {
		this.da = this.basicPay * 0.80;
		setDa(this.da);
		this.hra = this.basicPay * 0.35;
		setHra(this.hra);
		this.allowance = this.basicPay * 0.20;
		setAllowance(this.allowance);
		this.pf = (this.basicPay + this.da)*0.12;
		setPf(this.pf);
		this.salary = this.basicPay + this.da + this.hra + this.allowance - this.pf;
		setSalary(this.salary);
		return this.salary;
	}
	
}

class Manager extends Employee{

	public Manager(int employeeId, String employeeName, double basicPay,String designation) {
		super(employeeId, employeeName, basicPay, designation);
	}

	@Override
	public double computeSalary() {
		this.da = this.basicPay * 0.90;
		setDa(this.da);
		this.hra = this.basicPay * 0.40;
		setHra(this.hra);
		this.allowance = this.basicPay * 0.20;
		setAllowance(this.allowance);
		this.pf = (this.basicPay + this.da)*0.12;
		setPf(this.pf);
		this.salary = this.basicPay + this.da + this.hra + this.allowance - this.pf;
		setSalary(this.salary);
		return this.salary;
	}
	
}

class Designer extends Employee{

	public Designer(int employeeId, String employeeName, double basicPay, String designation) {
		super(employeeId, employeeName, basicPay, designation);
	}
	

	@Override
	public double computeSalary() {
		this.da = this.basicPay * 0.60;
		setDa(this.da);
		this.hra = this.basicPay * 0.30;
		setHra(this.hra);
		this.allowance = this.basicPay * 0.20;
		setAllowance(this.allowance);
		this.pf = (this.basicPay + this.da)*0.12;
		setPf(this.pf);
		this.salary = this.basicPay + this.da + this.hra + this.allowance - this.pf;
		setSalary(this.salary);
		return this.salary;
	}
	
}

