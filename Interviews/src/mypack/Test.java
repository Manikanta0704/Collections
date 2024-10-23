package mypack;

//   PRIME NUMBERS
//public class Test {
//	public static void main(String[] args) {		
//		for(int i=0;i<100;i++){
//			int count=0;
//			for(int j=1;j<=i;j++) {
//				if(i%j==0) {
//					count++;
//				}
//			}
//			if(count==2) {
//				System.out.println(i);
//			}
//		}
//	}
//}

//public class Test {
//	public static void main(String[] args) {
//		int a=10;
//		int b=20;
//		
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		System.out.println(a);
//		System.out.println(b);
//		
//		int temp=a;
//		a=b;
//		b=temp;
//		System.out.println(a);
//		System.out.println(b);
//		
//	}
//}

//public class Test {
//	public static void main(String[] args) {
//		for(int i=0;i<30;i++) {
//			int count =0;
//			for(int j=1;j<=i;j++) {
//				if(i%j==0) {
//					count++;
//				}
//			}
//			if(count==2) {
//			System.out.println(i);
//			}
//		}
//	}
//}


public class Test {
    public static void main(String[] args) {
        int previousPrime = -1;
        
        for(int i = 2; i < 100; i++) { 
            if (isPrime(i)) { 
                if (previousPrime != -1 && i - previousPrime == 2) { 
                    System.out.println(previousPrime + " " + i + " are twin primes");
                }
                previousPrime = i;
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) { 
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

