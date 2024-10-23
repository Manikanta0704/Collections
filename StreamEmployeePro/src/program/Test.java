package program;

import java.util.*;
import java.util.stream.Collectors;

class Employee{
	int empId;
	String empName;
	String empLoc;
	Double Salary;
	public Employee() {
		super();
	}
	
	public Employee(int empId, String empName, String empLoc, Double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empLoc = empLoc;
		Salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpLoc() {
		return empLoc;
	}

	public void setEmpLoc(String empLoc) {
		this.empLoc = empLoc;
	}

	public Double getSalary() {
		return Salary;
	}

	public void setSalary(Double salary) {
		Salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empLoc=" + empLoc + ", Salary=" + Salary + "]";
	}
}
public class Test {
	public static void main(String[] args) {
		Employee emp1=new Employee(100,"Srinivas","Hyderabad",250000.0);
		Employee emp2=new Employee(101,"Sasi","Hyderabad",220000.0);
		Employee emp3=new Employee(102,"Vinay","Chennai",205000.0);
		Employee emp4=new Employee(103,"Swarna","Delhi",255000.0);
		Employee emp5=new Employee(105,"Chandu","Mumbai",300000.0);
		Employee emp6=new Employee(106,"Vineel","Trivendram",210000.0);
		Employee emp7=new Employee(107,"Ram","Vizag",240000.0);
		
		LinkedList<Employee> list=new LinkedList();
		list.add(emp1);
		list.add(emp2);
		list.add(emp7);
		list.add(emp6);
		list.add(emp4);
		list.add(emp5);
		list.add(emp3);
	
		
		
//		list.stream()
//		.forEach(a->System.out.println(a));
		
		
		
//		Employee maxSalaryEmp = list.stream()
//                .max(Comparator.comparing(Employee::getSalary))
//                .orElse(null);
//
//        Employee minSalaryEmp = list.stream()
//                .min(Comparator.comparing(Employee::getSalary))
//                .orElse(null);
//
//        System.out.println("Employee with Maximum Salary: " + maxSalaryEmp);
//        System.out.println("Employee with Minimum Salary: " + minSalaryEmp);
        
		
		
		
		
		//Intermediate Methods
		
		//limit
		//skip
		//filter
		//sorted
		//distinct
		//map
		//flatMap
		
		//to remove duplicate Employees
        System.out.println(list.stream().distinct().toList());
        System.out.println();
        
        
        //Employee list who lives in each city
		System.out.println(list.stream().collect(Collectors.groupingBy(Employee::getEmpLoc)));
		System.out.println(list.stream().collect(Collectors.groupingBy(e->e.getEmpLoc())));
		System.out.println();
        //min Salary
        System.out.println(list.stream().sorted((a,b)->a.getSalary().compareTo(b.getSalary())).findFirst().get());
        
        //max Salary
        System.out.println(list.stream().sorted((a,b)->b.getSalary().compareTo(a.getSalary())).findFirst().get());
       
        //second max
        System.out.println(list.stream().sorted((a,b)->b.getSalary().compareTo(a.getSalary())).skip(1).findFirst().get());
    	
        
        //to get top 3 Salaries
        System.out.println(list.stream().sorted((a,b)->b.getSalary().compareTo(a.getSalary())).limit(3).toList());
    	System.out.println();
    	
    	//to get only names and Salaries
        System.out.println(list.stream().collect(Collectors.toMap(Employee::getEmpName, Employee::getSalary)));
	
        
        List<List<String>> lists=new ArrayList<List<String>>();
        List<String> li=Arrays.asList("Srinivas","Chandu","Chandu");
        List<String> li1=Arrays.asList("Swaraj","Vinay");
        
        Set<String> set=new HashSet<String>();
        set.addAll(li);
        System.out.println("Set "+set);
        
        for(String string:set) {
        	
        }
        lists.add(li1);
        lists.add(li);
        
        lists.stream().flatMap(List::stream).toList();
        
        Map<Double,String> map=new HashMap<Double,String>();
        
        map.put(23.0, "Chandu");
        map.put(23.2, "Swaraj");
        map.put(23.3, "Vineel");
        
        Iterator<Double> itr=map.keySet().iterator();
        while(itr.hasNext()) {
        	Double age=itr.next();
        	System.out.println(age+" "+map.get(age));
        }
        
        for(Map.Entry<Double, String> entry:map.entrySet()) {
        	System.out.println(entry.getKey()+" "+entry.getValue());
        }
        
        Iterator<Map.Entry<Double, String>> itr1=map.entrySet().iterator();
        while(itr1.hasNext()) {
        	Map.Entry<Double,String> entr=itr1.next();
        	System.out.println(entr.getKey()+" "+entr.getValue());
        }
	}
}
