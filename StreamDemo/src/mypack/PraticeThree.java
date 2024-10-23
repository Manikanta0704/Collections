package mypack;

//@FunctionalInterface
//interface FirstInterface {
//	int m1(int a, int b);
//
//	default void m2() {
//		System.out.println("a");
//	}
//	public static void m3() {
//		System.out.println("b");
//	}
//}
//
//class FirstClass {
//	public static int demo(int i, int j) {
//		return i * j;
//	}
//}
//
//class SecondClass {
//	public static int demo(int i, int j) {
//		return i - j;
//	}
//}
//public class PraticeThree {
//	public static void main(String[] args) {
//		FirstInterface obj = FirstClass::demo;     // scope resolution operator
//		FirstInterface obj1 = SecondClass::demo;   // method reference operator
//		int k = obj.m1(34, 5);
//		System.out.println(k);
//		System.out.println(obj.m1(5, 3));
//		obj.m2();
//		obj1.m2();
//		FirstInterface.m3();
//	}
//}


//@FunctionalInterface
//interface FirstInterface {
//	int m1(int a, int b);
//
//	default void m2() {
//		System.out.println("a");
//	}
//	public static void m3() {
//		System.out.println("b");
//	}
//}
//
//class FirstClass {
//	public int demo(int i, int j) {
//		return i * j;
//	}
//	public static int show(int i, int j) {
//		return i - j;
//	}
//	public int test(int i, int j) {
//		return i + j;
//	}
//}
//
//public class PraticeThree {
//	public static void main(String[] args) {
//		FirstClass fc=new FirstClass();
//		FirstInterface obj = fc::demo; 
//		FirstInterface obj3 = fc::test;
//		FirstInterface obj2 = FirstClass::show; 
//		int k = obj.m1(34, 5);
//		System.out.println(k);
//		System.out.println(obj2.m1(5, 3));
//		System.out.println(obj2.m1(10, 30));
//		obj.m2();
//		FirstInterface.m3();
//	}
//}




import java.util.function.Predicate;
class StringDemoOne{
	public boolean isUpperCase(String s) {
		String str=s.toUpperCase();
		if(str.equals("VARSHIT"))
			return true;
		else
			return false;
	}
}
class StringDemo{
	public boolean isChecking(Integer i) {
		int check =Integer.valueOf(i);
		if(check>55)
			return true;
		else
			return false;
	}
}

public class PraticeThree {
	public static void main(String[] args) {
		StringDemo obj = new StringDemo();
		StringDemoOne obj1 = new StringDemoOne();
		Predicate<Integer> p = obj::isChecking;
		Predicate<String> p1 = obj1::isUpperCase;
		System.out.println(p1.test("VarshiT"));
		boolean result = p.test(78);
	}
}


















//import java.util.function.BiFunction;
//
//class Employee{
//	int empId;
//	String empName;
//	int empAge;
//	int empSalary;
//	public Employee() {
//		super();
//	}
//	public Employee(int empId, String empName, int empAge, int empSalary) {
//		super();
//		this.empId = empId;
//		this.empName = empName;
//		this.empAge = empAge;
//		this.empSalary = empSalary;
//	}
//	@Override
//	public String toString() {
//		return "Employee [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + ", empSalary=" + empSalary
//				+ "]";
//	}
//	public int getEmpId() {
//		return empId;
//	}
//	public void setEmpId(int empId) {
//		this.empId = empId;
//	}
//	public String getEmpName() {
//		return empName;
//	}
//	public void setEmpName(String empName) {
//		this.empName = empName;
//	}
//	public int getEmpAge() {
//		return empAge;
//	}
//	public void setEmpAge(int empAge) {
//		this.empAge = empAge;
//	}
//	public int getEmpSalary() {
//		return empSalary;
//	}
//	public void setEmpSalary(int empSalary) {
//		this.empSalary = empSalary;
//	}
//	public Employee(int empId, String empName) {
//		super();
//		this.empId = empId;
//		this.empName = empName;
//	}
//	public static int show(int a,int b) {
//		if(a+b>100)
//			return a;
//		else
//			return b;
//	}
//	
//}
//
//public class PraticeThree{
//	public static void main(String[] args) {
//		BiFunction<Integer,String,Employee> EmployeeConstructor=Employee::new;
//		BiFunction<Integer,Integer,Integer> i=Employee::show;
//		System.out.println(Integer.valueOf(i.apply(90, 45)));
//		
//	}
//}












//class Employee{
//	int id;
//	String name;
//	int age;
//	public Employee() {
//		super();
//	}
//	public Employee(int id, String name, int age) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.age = age;
//	}
//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
//	}
//	
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//}
//
//interface EmployeeInterface<T,T1,T2,R>{
//	R demo(T t,T1 t1,T2 t2);
//}
//public class PraticeThree{
//	public static void main(String[] args) {
//		EmployeeInterface<Integer,String,Integer,Employee> e=Employee::new;
//		Employee e1=e.demo(12,"SAI",21);
//		Employee e2=e.demo(21,"RAJ",24);
//		System.out.println(e2.getAge());
//		System.out.println(e1.getName());
//		System.out.println(e1);
//		System.out.println(e2);
//	}
//}





//class Employee{
//	int id;
//	String name;
//	int age;
//	public Employee() {
//		super();
//	}
//	public Employee(int id, String name, int age) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.age = age;
//	}
//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
//	}
//	
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//}
//
//interface EmployeeInterface{
//	public static final int a = 0;
//	public static final String b = "";
//	public static final int c = 0;
//	
//	Employee demo(int a,String b,int c);
//}
//
//public class PraticeThree{
//	public static void main(String[] args) {
//		EmployeeInterface e=Employee::new;
//		Employee e1=e.demo(12,"SAI",21);
//		Employee e2=e.demo(21,"RAJ",24);
//		System.out.println(e2.getAge());
//		System.out.println(e1.getName());
//		System.out.println(e1);
//		System.out.println(e2);
//	}
//}