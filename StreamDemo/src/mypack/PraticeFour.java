package mypack;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.Comparator;

//import java.util.ArrayList;
//class PraticeFour {
// public static void main(String[] args) {
//     ArrayList<Integer> al=new ArrayList<Integer>();
//     for(int i=1;i<=100;i++)
//     {
//         int count=1;
//         for(int k=1;k<=i/2;k++)
//         {
//             if(i%k==0)
//             {
//               count++;  
//             }
//         }
//         if(count==2)
//         {
//             al.add(i);
//         }
//         
//     }
//     System.out.println(al);
//     for(int i=0;i<al.size()-1;i++)
//     {
//         int n=al.get(i);
//         int m=al.get(i+1);
//         if((m-n)==2)
//         {
//             System.out.println("("+n+","+m+")");
//         }
//     }
// }
//}



//public class PraticeFour {
//	  public static void main(String[] args) {
//	   Predicate<Integer> p=num-> num % 2 ==0;
//	   System.out.println(p.test(9));
//	   
//	   Function<Integer,Integer> f=num->num*2;
//	   Function<Integer,Integer> f1=num->num*num*2*num;
//	   System.out.println(f.apply(5));
//	   System.out.println(f1.apply(5));
//	   
//	   Supplier<Integer> s=()->10*2; 
//	   System.out.println(s.get());
//	} 
//}


//import java.util.LinkedList;
//class Employee implements Comparable<Employee>{
//	int id;
//	String name;
//	int age;
//	int salary;
//	public Employee(int id, String name, int age, int salary) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.age = age;
//		this.salary = salary;
//	}
//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
//	}
//	@Override
//	public int compareTo(Employee o) {
//		return this.name.compareTo(o.name);
//	}
//	
//}
//public class PraticeFour {
//	public static void main(String[] args) {
//		Employee e1=new Employee(34,"RAj",23,90000);
//		Employee e2=new Employee(34,"Sai",19,90000);
//		Employee e3=new Employee(34,"SAm",21,90000);
//		Employee e4=new Employee(34,"RAvi",20,90000);
//		
//		LinkedList<Employee> list=new LinkedList();
//		list.add(e1);
//		list.add(e2);
//		list.add(e3);
//		list.add(e4);
//		list.stream()
//		.filter(s->s.age>20)
//		.sorted()
////		.filter(s->s.name=="Sai")
////		.filter(s->s.name.startsWith("S"))
////		.forEach(System.out::println);
//		.forEach(a->System.out.println(a));
//		
//	}
//}







import java.util.LinkedList;
class Employee implements Comparator<Employee>{
	int id;
	String name;
	int age;
	int salary;
	
	public Employee() {
		super();
	}
	public Employee(int id, String name, int age, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	@Override
	public int compare(Employee o1, Employee o2) {
		return Integer.compare(o1.age, o2.age);
//		return Integer.o1.age.compareTo(o2.age);
//		return o1.name.compareTo(o2.name);
	}
	
}
//class AgeCompare implements Comparator<Employee>{
//
//	@Override
//	public int compare(Employee o1, Employee o2) {
//		return Integer.compare(o1.age, o2.age);
//	}
//	
//}
public class PraticeFour {
	public static void main(String[] args) {
		Employee e1=new Employee(34,"RAj",23,90000);
		Employee e2=new Employee(34,"Sai",19,90000);
		Employee e3=new Employee(34,"SAm",21,90000);
		Employee e4=new Employee(34,"RAvi",20,90000);
		
		LinkedList<Employee> list=new LinkedList();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.stream()
		.filter(s->s.age>20)
		.sorted(new Employee())
		.forEach(a->System.out.println(a));
		
	}
}