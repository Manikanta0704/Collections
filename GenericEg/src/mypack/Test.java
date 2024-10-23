package mypack;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.stream.Collectors;


class Employee implements Comparable<Employee>
{
	int empid;
	String empname;
	int age;
	int salary;
	
	public Employee() {
		super();
	}

	public Employee(int empid, String empname, int age, int salary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", age=" + age + ", salary=" + salary + "]";
	}

	
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee o) {
//		if(this.empid>o.empid)
//			return 10;
//		else if(this.empid<o.empid)
//			return -12;
//		else
//			return 0;
		return this.empname.compareTo(o.empname);
	}
}

class ProjectManager extends Employee{
	int yearsOfExp;
	String domain;
	public ProjectManager() {
		super();
	}
	
	public ProjectManager(int empid, String empname, int age, int salary, int yearsOfExp, String domain) {
		super(empid, empname, age, salary);
		this.yearsOfExp = yearsOfExp;
		this.domain = domain;
	}

	@Override
	public String toString() {
		return "ProjectManager [yearsOfExp=" + yearsOfExp + ", domain=" + domain + ", empid=" + empid + ", empname="
				+ empname + ", age=" + age + ", salary=" + salary + "]";
	}
	public int compareTo(ProjectManager o) {
		return this.empname.compareTo(o.empname);	
	}
}

//class empname implements Comparator<ProjectManager>{
//
//	@Override
//	public int compare(ProjectManager o1, ProjectManager o2) {
//		return o1.empname.compareTo(o2.empname);
//	}
//	
//}

class TeamLead extends Employee{
	int teamsize;
	String module;
	public TeamLead() {
		super();
	}
	
	public TeamLead(int empid, String empname, int age, int salary, int teamsize, String module, int i, String string) {
		super(empid, empname, age, salary);
		this.teamsize = teamsize;
		this.module = module;
	}

	@Override
	public String toString() {
		return "TeamLead [teamsize=" + teamsize + ", module=" + module + ", empid=" + empid + ", empname=" + empname
				+ ", age=" + age + ", salary=" + salary + "]";
	}
//	public int compareTo(TeamLead o) { 
//		return teamsize;
//	}
}
public class Test {
	public static void main(String[] args) {
		Test t=new Test();
		Employee e1=new Employee(345,"Raj",23,90000);
		Employee e2=new Employee(145,"Srini",23,100000);
		Employee e3=new Employee(575,"Chandu",23,80000);
		
		ProjectManager p1=new ProjectManager(3,"Anas",23,90000,2,"Java");
		ProjectManager p2=new ProjectManager(1,"Ram",23,100000,2,"Python");
		ProjectManager p3=new ProjectManager(5,"Vinay",23,80000,2,"ABC");
		
		TeamLead t1=new TeamLead(11,"Rupeesh",23,90000,3,"mern",20,"Lead");
		TeamLead t2=new TeamLead(15,"Gapi",23,100000,3,"mern",20,"MAnager");
		TeamLead t3=new TeamLead(57,"Vineel",23,80000,3,"mern",20,"hr");
	
		LinkedList<Employee> list = new LinkedList();		
//
		list.add(e1);
		list.add(e2);
		list.add(e3);
//		
		LinkedList<ProjectManager> pm = new LinkedList();
		
		pm.add(p1);
		pm.add(p2);
		pm.add(p3);
		
		list.addAll(pm);
		
		LinkedList<TeamLead> tl=new LinkedList();
	
		tl.add(t1);
		tl.add(t2);
		tl.add(t3);
		list.addAll(tl);
		
//		Collections.sort(list,new domain());
		Collections.sort(list);
//		for(Employee e:list)
//			System.out.println(e);
		
//		list.stream().map(Employee::getEmpid).forEach(System.out::println);
		list.stream().map(Employee::getEmpname).forEach(System.out::println);

		
	}
}
