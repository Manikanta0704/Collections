package mypack;

class ManikantaException extends RuntimeException//Exception 
{
	/*public ManikantaException(String string) {
		super(string);
	}*/	
}

/*public class Exc6 {

	public static void main(String[] args) {
	 int i=20;
	 int j=0;
	 try {
		 j=18/i;
		 if(j==0) 
			 throw new ArithmeticException(" I dont want to print zero");
//			 throw new ManikantaException(" I dont want to print zero");
		 
	 		}catch(ArithmeticException e) {
//	 }catch(ManikantaException e) {
		 j=18/1;
		 System.out.println("that is default output "+e);
		 
	 }
	 catch(Exception e) {
		 System.out.println("Something went wrong");
	 }
	 System.out.println(j);
	 System.out.println("Bye");
	}

}*/


public class Exc6{
	public static void main(String[] args) {
		int i=90; 
		int j=i/0;
		try {
			System.out.println("try block");
		}catch(ArithmeticException e) {
			System.out.println("Exception");
			try {
				System.out.println("try inside catch");
			}catch(RuntimeException e1) {
				System.out.println("catch inside catch");			}
		}
		System.out.println("manikanta");
	}
}
