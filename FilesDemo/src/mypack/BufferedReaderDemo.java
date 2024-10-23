package mypack;

import java.io.*;

public class BufferedReaderDemo {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 1st number :");
		String val1=br.readLine();
		System.out.println("Enter 2nd number :");
		String val2=br.readLine();
		System.out.println("Additiion : "+(val1+val2));
		
		int fval1=Integer.parseInt(val1);
		int fval2=Integer.parseInt(val2);
		
		System.out.println("Addition "+(fval1+fval2));
	}
}
