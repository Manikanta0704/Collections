package mypack;

public class UPIPayment implements Ipayment{
	@Override
	public String pay(double amount) {
		return "Payment successful through UPI";
	}
}
