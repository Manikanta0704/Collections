package mypack;

class DebitCardPayment implements Ipayment{
	@Override
	public String pay(double amount) {
		return "Payment successful through Debitcard";
	}
}
