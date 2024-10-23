/*
@FunctionalInterface
interface K{
	void m1();
}
class L1{
	public static void ma0in(String[] args) {
		K k=()->System.out.println("Mani");
		k.m1();
	}
}
*/
/*
interface Y {
	int calculate(int i, int j);
}

public class L1 {
	public static void main(String[] args) {
 
		Y add = (a, b) -> a + b;
		Y sub = (a, b) -> a - b;
 		Y mul = (a, b) -> a * b;
 		Y div = (a, b) -> {
 			if (b == 0) {
 				throw new ArithmeticException("Division by zero is not allowed.");
 			}
 			return a / b;
 		};
 		System.out.println("Addition : " +add.calculate(10, 5));
 		System.out.println("Subtraction : " +sub.calculate(10, 5));
 		System.out.println("Multiplication : " +mul.calculate(10, 5));
 		System.out.println("Division : " +div.calculate(10, 5));
	}
}
*/

interface N {
	boolean test(int number);
}

public class L1 {
	public static void main(String[] args) {

		N Positive = number -> number > 0;
		N Negative = number -> number < 0;
		N Even = number -> number % 2 == 0;
		
		int[] numbers = { 10, -5, 0, 15, -8 };
		
		for (int n : numbers) {
			System.out.println("Number: " + n);
			System.out.println("Number is Positive :" + Positive.test(n));
			System.out.println("Number is Negative :" + Negative.test(n));
			System.out.println("Number is Even :" + Even.test(n));
			System.out.println("---------------------------");
		}
	}
}





