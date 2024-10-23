package mypack;

import java.util.function.Predicate;   

//interface I {
//	public static void m1() {
//		System.out.println("m1-I");
//	}
//
//	public static void m2() {
//		System.out.println("m2-I");
//	}
//
//	public static void m3() {
//		System.out.println("m3-I");
//	}
//}
//
//public class PraticeTwo implements I {
//	public static void main(String[] args) {
////		I.m1();
////		I.m2();
////		I.m3();
////
////		I i = new PraticeTwo();
//////		 i.m1();
//////		 PraticeTwo.m1();
//		
//		PraticeTwo pt=new PraticeTwo();
//		pt.m1();
//
//	}
//}

//interface I1 {
//	default void m1() {
//		System.out.println("m1-I1");
//	}
//}
//
//interface I2 {
//	default void m1() {
//		System.out.println("m1-I2");
//	}
//}
//
//interface I3 extends I1, I2 {
//
//	@Override
//	default void m1() {
//		System.out.println("m1-I3");
//	}
//}
//public class PraticeTwo implements I3 {
//	public static void main(String[] args) {
//		I1 pt = new PraticeTwo();
//		pt.m1();
//	}
//}


//interface I1 {
//	default void m1() {
//		System.out.println("m1-I1");
//	}
//}
//
//interface I2 {
//	default void m1() {
//		System.out.println("m1-I2");
//	}
//}
//
//class A implements I1,I2{
//
//	@Override
//	public void m1() {
//		System.out.println("A-m1");
//	}
//}
//public class PraticeTwo extends A{
//	public static void main(String[] args) {
//		PraticeTwo pt=new PraticeTwo();
//		pt.m1();
//		
//		A pt1=new PraticeTwo();
//		pt1.m1();
//		
//		I1 pt2=new PraticeTwo();
//		pt2.m1();
//		
//		I2 pt3=new PraticeTwo();
//		pt3.m1();
//	}
//}

//interface FirstInterface{
//	int m1(int a,int b);
//	default void m2() {
//		System.out.println("a");
//	}
//}
//class FirstClass{
//	public static int demo(int i,int j) {
//		return i*j;
//	}
////	public static void show() {
////		System.out.println("mani");
////	}
//	public static int show(int i,int j) {
//		return i-j;
//	}
//}
//public class PraticeTwo{
//	public static void main(String[] args) {
//		FirstInterface obj=FirstClass::demo;
//		FirstInterface obj1=FirstClass::show;
//		int k=obj.m1(34,5);
//		System.out.println(k);
//		System.out.println(obj.m1(5,3));
//		
//		
////		System.out.println(FirstClass.demo(10, 50));
//		
//		
////		FirstClass obj=new FirstClass();
////		System.out.println(obj.demo(10, 20));
////		System.out.println(obj.demo(10, 30));
//		
//		
//	}
//}


// text conversions are possible in lamada expressions

//interface TextConverter {
//	public String convert(String text);
//}
//
//public class PraticeTwo {
//	public static void main(String[] args) {
//		TextConverter converter = text -> text.toUpperCase();
//
//		String result = converter.convert("Durga Software Solutions");
//		System.out.println(result);
//	}
//}


//interface Math {
//	public int add(int a, int b);
//}
//
//public class PraticeTwo {
//	public static void main(String[] args) {
//		Math math = (a, b) -> a + b;
//
//		int result = math.add(10, 20);
//		System.out.println(result);
//	}
//}




//class StringDemo{
//	public boolean isUpperCase(String s) {
//		if(s.equals("Raj"))
//		return true;
//		else
//		return false;
//	}
//}
//
//public class PraticeTwo{
//	public static void main(String[] args) {
//		StringDemo obj=new StringDemo();
//		Predicate<String> p=obj::isUpperCase;
//			boolean result=p.test("Mani");
//			System.out.println(result);
//	}
//}


//class StringDemo{
//	public boolean isUpperCase(String s) {
////		String s1=s.toUpperCase();
////		if(s.equals("Raj"))
//		if(s.equalsIgnoreCase("Raj"))
//		return true;
//		else
//		return false;
//	}
//}
//
//public class PraticeTwo{
//	public static void main(String[] args) {
//		
//		StringDemo obj=new StringDemo();
//		Predicate<String> p=obj::isUpperCase;
//			boolean result=p.test("RAJ");
//			System.out.println(result);
//	}
//}



//class StringDemo{
//	public boolean isUpperCase(Integer i) {

//		int check =Integer.valueOf(17);
//		
//		return true;
//		else
//		return false;
//	}
//}
//
//public class PraticeTwo{
//	public static void main(String[] args) {
//		
//		StringDemo obj=new StringDemo();
//		Predicate<Integer> p=obj::isUpperCase;
//			boolean result=p.test(78);
//			System.out.println(result);
//	}
//}

public class PraticeTwo{
	public static void main(String[] args) {
		
	}
}




