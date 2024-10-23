package mypack;

class CreditCardPayment implements Ipayment{
	@Override
	public String pay(double amount) {
		return "Payment successful through creditcard";
	}
}
