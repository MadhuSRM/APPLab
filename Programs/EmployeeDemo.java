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
		Employee employee = null;
		switch(employeeType) {
		case 1: 
			employee = new SoftwareEngineer(empid, name, basic, "SoftwareEngineer");
			break;
		case 2:
			employee = new Designer(empid, name, basic,"Designer");
			break;
		case 3:
			employee = new Accountant(empid, name, basic, "Accountant");
			break;
		case 4:
			employee = new Manager(empid, name, basic, "Manager");
			break;
		default:
			System.out.println("Invalid Employee Type");
		}
		
		employee.computeSalary();
		generateSalarySlip(employee.getEmployeeId(),employee.getEmployeeName(),employee.getBasicPay(),employee.getDa(),employee.getHra(),employee.getAllowance(),employee.getPf(),employee.getSalary(),employee.getDesignation());
		sc.close();
	}
	
	public static void generateSalarySlip(int empid, String name, double basic, double da, double hra, double allow, double pf, double sal, String designation) {
		System.out.println("\nSalary Slip");
		System.out.println("***********");
		System.out.println("Designation:"+designation);
		System.out.println("Employee ID:"+empid);
		System.out.println("Employee Name:"+name);
		System.out.println("Basic Pay:"+basic);
		System.out.println("Dearness Allowance:"+da);
		System.out.println("House Rent Allowance:"+hra);
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
		setDa(this.getBasicPay() * 0.75);
		setHra(this.getBasicPay() * 0.30);
		setAllowance(this.getBasicPay() * 0.20);
		setPf((this.getBasicPay() + this.getDa())*0.12);
		setSalary(this.getBasicPay() + this.getDa() + this.getHra() + this.getAllowance() - this.getPf());
		return this.getSalary();
	}
	
}


class SoftwareEngineer extends Employee{

	public SoftwareEngineer(int employeeId, String employeeName, double basicPay, String designation) {
		super(employeeId, employeeName, basicPay, designation);
	}

	@Override
	public double computeSalary() {
		setDa(this.getBasicPay() * 0.80);
		setHra(this.getBasicPay() * 0.35);
		setAllowance(this.getBasicPay() * 0.20);
		setPf((this.getBasicPay() + this.getDa())*0.12);
		setSalary(this.getBasicPay() + this.getDa() + this.getHra() + this.getAllowance() - this.getPf());
		return this.getSalary();
	}
	
}

class Manager extends Employee{

	public Manager(int employeeId, String employeeName, double basicPay,String designation) {
		super(employeeId, employeeName, basicPay, designation);
	}

	@Override
	public double computeSalary() {
		setDa(this.getBasicPay() * 0.90);
		setHra(this.getBasicPay() * 0.40);
		setAllowance(this.getBasicPay() * 0.20);
		setPf((this.getBasicPay() + this.getDa())*0.12);
		setSalary(this.getBasicPay() + this.getDa() + this.getHra() + this.getAllowance() - this.getPf());
		return this.getSalary();
	}
	
}

class Designer extends Employee{

	public Designer(int employeeId, String employeeName, double basicPay, String designation) {
		super(employeeId, employeeName, basicPay, designation);
	}
	

	@Override
	public double computeSalary() {
		setDa(this.getBasicPay() * 0.60);
		setHra(this.getBasicPay() * 0.30);
		setAllowance(this.getBasicPay() * 0.20);
		setPf((this.getBasicPay() + this.getDa())*0.12);
		setSalary(this.getBasicPay() + this.getDa() + this.getHra() + this.getAllowance() - this.getPf());
		return this.getSalary();
	}
	
}

