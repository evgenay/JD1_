package local.home10task02.main;

public class Main {
	public static void main(String[] args) {

		Payment pay = new Payment();
		Client balans = new Client("Василия", 200, Currency.BYN);

		pay.productAdd("Гвозди", 10, 1, Currency.BYN);
		pay.productAdd("Шурупы", 10, 1, Currency.BYN);
		pay.productAdd("Краска", 7, 1, Currency.BYN);
		pay.productAdd("Втулки", 2, 3, Currency.BYN);
		pay.productAdd("Стяжки", 10, 1, Currency.BYN);
		pay.productAdd("Винты ", 10, 6, Currency.BYN);
		pay.productAdd("Гайки ", 10, 6, Currency.BYN);

		PaymentLogic expenses = new PaymentLogic();
		System.out.println(balans);
		print(pay);
		System.out.println("Сумма покупок составила: " + expenses.SumPay(pay));
		System.out.println("На счету осталось у клиента " + balans.getClient() + " " + balans.getCurrency());
		System.out.println(balans.getMoney() - expenses.SumPay(pay));

	}

	public static void print(Payment payment) {
		for (Payment.Order orders : payment.getOrders()) {
			System.out.println(orders.toString());
		}
		System.out.println();
	}

}
