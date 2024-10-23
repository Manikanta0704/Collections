package project2;

import java.util.ArrayList;

abstract class Employee{
	private int id;
	private String name;
	
	public Employee() {
		
	}
	
	public Employee(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	public String getname() {
		return name;
	}
	public int getId() {
		return id;
	}
	
	abstract double calculatSalary();

	@Override
	public String toString() {
		return "Employee [id="+id+",name="+name+",calculatSalary()="+calculatSalary() + "]";
	}	
}

class FullTimeEmployee extends Employee{
	
	private double monthlySalary;

	public FullTimeEmployee() {
	
	}

	public FullTimeEmployee(int id, String name, double monthlySalary) {
		super(id, name);
		this.monthlySalary = monthlySalary;
	}
	@Override
	public double calculatSalary() {
		return monthlySalary;
	}	
}

class PartTimeEmployee extends Employee{
	
	private double hoursWorked;
	private double hoursRate;
	
	public PartTimeEmployee() {

	}

	public PartTimeEmployee(int id, String name, double hoursWorked, double hoursRate) {
		super(id, name);
		this.hoursWorked = hoursWorked;
		this.hoursRate = hoursRate;
	}

	@Override
	double calculatSalary() {	
		return hoursWorked*hoursRate;
	}
	
}

class PayRollSystem{
	private ArrayList<Employee> employeeList;

	public PayRollSystem() {
		employeeList=new ArrayList<>();
	}
	
	public void addEmployee(Employee employee) {
		employeeList.add(employee);
	}
	
	public void removeEmployee(int id) {
		Employee employeeToRemove=null;
		for(Employee employee:employeeList) {
			if(employee.getId()==id) {
				employeeToRemove=employee;
				break;
			}
		}
		if(employeeToRemove != null) {
			employeeList.remove(employeeToRemove);
		}
	}
	public void displayEmployees() {
		for(Employee employee:employeeList) {
			System.out.println(employee);
		}
	}
}


public class Main {
	public static void main(String[] args) {
		PayRollSystem payrollsystem=new PayRollSystem();
		FullTimeEmployee fte1=new FullTimeEmployee(1,"Mani",7000);
		PartTimeEmployee pte1=new PartTimeEmployee(11,"Lokesh",40,50);
		
		payrollsystem.addEmployee(fte1);
		payrollsystem.addEmployee(pte1);
		
		System.out.println("Initial Employee Details : ");
		payrollsystem.displayEmployees();
		System.out.println();
		System.out.println("Removing Employees ");
		payrollsystem.removeEmployee(5);
		System.out.println();
		System.out.println("Remaining Employees Details : ");
		payrollsystem.displayEmployees();
	}
}
