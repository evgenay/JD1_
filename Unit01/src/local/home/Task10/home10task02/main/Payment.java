package local.home10task02.main;

import java.util.ArrayList;
import java.util.List;

public class Payment {

	private List<Order> orders;

	public Payment() {
		orders = new ArrayList<Order>();
	}

	public Payment(List<Order> orders) {
		this.orders = orders;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public void add(Order order) {
		this.getOrders().add(order);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((orders == null) ? 0 : orders.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Payment other = (Payment) obj;
		if (orders == null) {
			if (other.orders != null)
				return false;
		} else if (!orders.equals(other.orders))
			return false;
		return true;
	}

	class Order {

		private String name;
		private int quantity;
		private int price;
		private Currency currency;

		public Order(String name, int quantity, int price, Currency currency) {
			this.name = name;
			this.quantity = quantity;
			this.price = price;
			this.currency = currency;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setCount(int quantity) {
			this.quantity = quantity;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public Currency getCurrency() {
			return currency;
		}

		public void setCurrency(Currency currency) {
			this.currency = currency;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + quantity;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + price;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Order other = (Order) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			if (quantity != other.quantity)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (price != other.price)
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Материал " + name + ", в количестве " + quantity + ", с ценой за 1 ед. - " + price + "";
		}

		private Payment getEnclosingInstance() {
			return Payment.this;
		}

	}

	public void productAdd(String name, int quantity, int price, Currency currency) {
		orders.add(new Order(name, quantity, price, currency));
	}

}
