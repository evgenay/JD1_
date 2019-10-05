package local.home10task02.main;

public class Client {
	private String client;
	private int money;
	private Currency currency;
	
	public Client(String client, int money,Currency currency) {
		this.client = client;
		this.money = money;
		this.currency =currency;
	
}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
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
		result = prime * result + ((client == null) ? 0 : client.hashCode());
		result = prime * result + ((currency == null) ? 0 : currency.hashCode());
		result = prime * result + money;
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
		Client other = (Client) obj;
		if (client == null) {
			if (other.client != null)
				return false;
		} else if (!client.equals(other.client))
			return false;
		if (currency != other.currency)
			return false;
		if (money != other.money)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "На счете клента " + client + " было " + money + " в " + currency + " он закупил в магазине: ";
	}
}
