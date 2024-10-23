package mypack;
/* abstract class BankAccount{
	double deposit;
	double withdraw;
	abstract void deposit(double deposit);
	abstract void withdraw(double withdraw);
	//CurrentAccount ca=new CurrentAccount();
}
class SavingsAccount extends BankAccount {
	double currentbalance=1000;
	
	void deposit(double deposit) {
		//deposit=deposit;
		deposit=deposit+currentbalance;
		System.out.println("Deposit: "+deposit);
	}
	void withdraw(double withdraw) {
		//withdraw=withdraw;
		withdraw=currentbalance-withdraw;
		System.out.println("Withdraw: "+withdraw);
	}
	 
}
class CurrentAccount extends BankAccount {
	double currentbalance=2000;
	
	void deposit(double deposit) {
		//deposit=deposit;
		deposit=deposit+currentbalance;
		System.out.println("Deposit: "+deposit);
	}
	void withdraw(double withdraw) {
		withdraw=withdraw;
		withdraw=currentbalance-withdraw;
		System.out.println("Withdraw: "+withdraw);
	}	
}

public class Exc5{
	public static void main(String[] args) {
		SavingsAccount sa=new SavingsAccount();
		System.out.println("Savings Acoount");
		System.out.println("================");
		sa.deposit(500);
		sa.withdraw(500);
		System.out.println();
		CurrentAccount ca=new CurrentAccount();
		System.out.println("Current Acoount");
		System.out.println("================");
		ca.deposit(500);
		ca.withdraw(500);
	}
}*/


public class Exc5{
	public static void main(String[] args) {
		int rows=4;
		int n=0;
		
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(n);
			}
			n=+2;
		}
	}
}











