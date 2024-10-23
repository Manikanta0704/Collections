/*
d33@FunctionalInterface
interface Car{
	public void drive();
}

class L4{
	public void drive() {
		System.out.println("driving audi car");
	}
	public static void main(String[] args) {
		L4 c1=new L4();
	c1.drive();
	}
}*/
/*
@FunctionalInterface
interface Car{
	public void drive();
}
class L4{
	
	public static void main(String[] args) {
		Car c1=new Car() {
			public void drive() {
			System.out.println("driving audi car");
			}
		};
		c1.drive();		
	}
}*/

/*
@FunctionalInterface
interface Car{
	public void drive();
}
class Audi implements Car {

	public void drive() {
		System.out.println("Driving Audi");
	}
}

public class L4{	
	public static void main(String[] args) {
		Car c1=new Car() {
			public void drive() {
			System.out.println("driving audi car");
			}
		};
		
		c1.drive();
		
		Audi a=new Audi();
		a.drive();
	}
}
/*
@FunctionalInterface
interface Car{
	public void drive();
}
class Audi implements Car {

	public void drive() {
		System.out.println("Driving Audi");
	}
}
public class L4 extends Audi{	
	public static void main(String[] args) {
		Car c1=new Car() {
			public void drive() {
			System.out.println("driving audi car");
			}
		};
		
		c1.drive();
		
		Audi a=new Audi();
		a.drive();
		
		Audi f=new L4();
		f.drive();
		
		L4 l=new L4();
		l.drive();
	}
}*/
/*
@FunctionalInterface
interface Car{
	public void drive();
}
class Audi implements Car {

	public void drive() {
		System.out.println("Driving Audi");
	}
}
public class L4 extends Audi{
	public void drive() {
		System.out.println("driving audi car");
		}
	public static void main(String[] args) {
		
		L4 l1=new L4();
		Car l2=new L4();
		Audi l3=new L4();
		l1.drive();
		l2.drive();
		l3.drive();
		Audi a=new Audi();
		a.drive();
	}
}*/