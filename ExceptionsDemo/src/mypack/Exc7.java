package mypack;

import org.omg.Messaging.SyncScopeHelper;

public class Exc7 {
	
	public static void main(String[] args) {
		/*int i=0;
		int j=0;
		try {
			int k=i/j;
			System.out.println("Exception");
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		}catch(NullPointerException e){
			System.out.println("NullPointerException");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException");
		}*/	
	
		
		int i=0;
		int j=0;
		try {
			int k=i/j;
			System.out.println("Exception");
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		}catch(Exception e) {
			System.out.println("exception");
		}
	}

}
