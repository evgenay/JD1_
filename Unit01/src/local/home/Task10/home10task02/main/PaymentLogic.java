package local.home10task02.main;

public class PaymentLogic {
	public int SumPay(Payment payment) {
		int sum = 0;
		for (Payment.Order orders : payment.getOrders()) {
			sum = sum + (orders.getQuantity() * orders.getPrice());
		}
		return sum;
	}
}
