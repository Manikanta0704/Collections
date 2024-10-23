package mypack;

public class Employee {
	int empId;
	String name;
	int age;
	int salary;
	public Employee() {
		super();
	}
	public Employee(int empId, String name, int age, int salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	

}
