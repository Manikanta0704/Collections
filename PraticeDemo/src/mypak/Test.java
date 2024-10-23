package mypak;

import java.util.Scanner;
import java.util.Vector;

/*
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;

class Employee implements Serializable{
	int empId;
	String empName;
	int age;
	public Employee() {
		super();
	}
	public Employee(int empId, String empName, int age) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", age=" + age + "]";
	}
}

class ProjectManager extends Employee{
	int teamsize;
	String domain;
	public ProjectManager() {
		super();
	}
	public ProjectManager(int empId, String empName, int age, int teamsize, String domain) {
		super(empId, empName, age);
		this.teamsize = teamsize;
		this.domain = domain;
	}
	@Override
	public String toString() {
		return "ProjectManager [teamsize=" + teamsize + ", domain=" + domain + ", empId=" + empId + ", empName="
				+ empName + ", age=" + age + "]";
	}
}
public class Test extends ProjectManager{
	public static void main(String[] args) throws Exception {
		ProjectManager p1=new ProjectManager(10,"raj",21,7,"java");
		ProjectManager p2=new ProjectManager(17,"vinay",21,7,"java");
		ProjectManager p3=new ProjectManager(14,"ajay",21,7,"java");
		
		LinkedList<ProjectManager> list=new LinkedList();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("mani.txt")));
		oos.writeObject(list);
		
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream(new File("mani.txt")));
		LinkedList<ProjectManager> li=(LinkedList)ois.readObject();
		
		Iterator<ProjectManager> itr=li.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
	}	
}
*/
//
//public class Test{
//	public static void main(String[] args) {
//		System.out.println("simple message");
//		System.err.println("simple message");
////		System.in.println("simple message");
//	}
//}





//class Employee{
//	int empId;
//	int sal;
//	public Employee() {
//		super();
//	}
//	public Employee(int empId, int sal) {
//		super();
//		this.empId = empId;
//		this.sal = sal;
//	}
//	@Override
//	public String toString() {
//		return "Employee [empId=" + empId + ", sal=" + sal + "]";
//	}
//}
//
//
//class Test{
//	public static void main(String[] args) {
//		Employee e1=new Employee(1,100000);
//		Employee e2=new Employee(1,200000);
//		Employee e3=new Employee(1,200000);
//		Employee e4=new Employee(1,198000);
//		Employee e5=new Employee(1,150000);
//		Employee e6=new Employee(1,148000);
//		Employee e7=new Employee(1,175000);
//		
//		Vector<Employee> v=new Vector();
//		v.add(e1);
//		v.add(e2);
//		v.add(e3);
//		v.add(e4);
//		v.add(e5);
//		v.add(e6);
//		v.add(e7);
//		
//		Vector<Employee> v1=new Vector();
//        for (Employee e : v) {
//            if (e.sal > 100000 && e.sal < 200000) {
//                v.add(e);
////            	System.out.println(e);
//            }
//        }
//		
//        for (Employee emp : v1) {
//            System.out.println(emp);
//        }	
//	}
//}


//public class Test {
//	public static void main(String[] args) {
//		int arr[]= {3,2,5,6,9,6,7,1,8};
//		int N=2;
//		int size=arr.length-1;
//		for(int i=size-N+1;i<=size;i++){
//			System.out.print(arr[i]+" ");
//		}
//		for(int i=0;i<size-N+1;i++){
//			System.out.print(arr[i]+" ");
//		}
//	}
//}

class Test{
	public static void main(String[] args) {
		int arr[]= {3,2,5,6,9,6,7,1,8};
		System.out.println("Enter a number :");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int size=arr.length;
		
		for(int i=size-a;i<size;i++) {
			System.out.println(arr[i]);
		}
		for(int i=0;i<size-a;i++) {
			System.out.println(arr[i]);
		}
	}
}