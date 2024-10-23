package com.prblm;

import java.util.Scanner;

public class BinaryToDecimal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter binary number : ");
		int n=sc.nextInt();
		
		int placeValue=1;
		int sum=0;
		while(n != 0){
			int lastDigit=n%10;
			n=n/10;
			sum=sum+placeValue*lastDigit;
			placeValue=2*placeValue;
		}
		System.out.println(sum);
	}
}
