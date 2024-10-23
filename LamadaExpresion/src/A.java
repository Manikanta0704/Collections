/*@FunctionalInterface
 interface I1 {
	void m1();
	default void m2(){
		System.out.println("I1 m1");
	}
}

@FunctionalInterface
interface I2 extends I1{
	default void m1(){
		System.out.println("I2 m1");
	}
	void m3();
}
public  class A implements I2
{
	public static void main(String[] args) {
		A obj=new A();
		obj.m1();
		obj.m2();
		obj.m3();
	}

	public void m3() {
		System.out.println("manikanta");		
	}
}*/


/*
interface I{
	int number(int i);
}
public class A{
	public static void main(String [] args) {
		I obj= (i)->{
			System.out.println(2);
			return i;
		
		};
		System.out.println(obj.number(10));
	}
}*/

/*
@FunctionalInterface
interface I1 {
	void m1();
	default void m2(){
		System.out.println("I1 m1");
	}
}

@FunctionalInterface
interface I2 extends I1{
	default void m1(){
		System.out.println("I2 m1");
	}
	void m3();

}

public  class A
{
	public static void main(String[] args) {

		I2 obj=()->{System.out.println("hello");};
		obj.m1();
		obj.m2();
		obj.m3();
	}
}
*/
/*I1 obj=(i,j)->{
			System.out.println("mani");
			
			return i+j;
		};*/




















