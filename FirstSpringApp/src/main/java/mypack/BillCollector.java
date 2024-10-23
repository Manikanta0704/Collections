package mypack;

public class BillCollector{
	public Ipayment payment;
	
	public void setPayment(Ipayment payment) {
		this.payment = payment;
	}

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
