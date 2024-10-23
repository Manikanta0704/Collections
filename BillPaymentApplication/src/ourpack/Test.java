package ourpack;

import java.lang.reflect.Field;

interface Ipayment{
	public String pay(double amount);
}
class CreditCardPayment implements Ipayment{
	@Override
	public String pay(double amount) {
		return "Payment successful through creditcard";
	}
}
class DebitCardPayment implements Ipayment{
	@Override
	public String pay(double amount) {
		return "Payment successful through Debitcard";
	}
}
class UPIPayment implements Ipayment{
	@Override
	public String pay(double amount) {
		return "Payment successful through UPI";
	}
}

class BillCollector{
	public Ipayment payment;
	
//	public void setPayment(Ipayment payment) {
//		this.payment = payment;
//	}

	public BillCollector() {
		super();
	}

	public BillCollector(Ipayment payment) {
		super();
		this.payment = payment;
	}

	public void collectPayment(double amount) {
		String status=payment.pay(amount);
		System.out.println(status);
	}
}
public class Test{
	public static void main(String[] args) throws Exception {
//		BillCollector bc=new BillCollector();
//		bc.setPayment(new CreditCardPayment());                         //setter method injection
//		bc.collectPayment(1500);
		
//		BillCollector bc1=new BillCollector(new CreditCardPayment());   //constructor injection
//		bc1.collectPayment(1500);                                        
		
		Class<?> clz=Class.forName("ourpack.BillCollector");
		Object obj=clz.newInstance();
		
		BillCollector bc=(BillCollector) obj;
		Field field=clz.getDeclaredField("payment");                    //field injection
		field.setAccessible(true);
		
		field.set(obj, new DebitCardPayment());        
		bc.collectPayment(2000);
		
	                                           		
	}
}
