package local.home09task04.main;

public class Account implements Comparable<Account> {

	private int id;
	private int balance;
	private boolean blocked;
	private Currency currency;

	public Account() {
		id = 0;
		balance = 0;
		blocked = false;
	}

	public Account(int id, int balance, boolean blocked, Currency currency) {
		this.id = id;
		this.balance = balance;
		this.blocked = blocked;
		this.currency = currency;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public boolean isBlocked() {
		return blocked;
	}

	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public int compareTo(Account other) {
		if (this.balance == other.balance) {
			return 0;
		} else if (this.balance < other.balance) {
			return -1;
		} else {
			return 1;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + balance;
		result = prime * result + (blocked ? 1231 : 1237);
		result = prime * result + ((currency == null) ? 0 : currency.hashCode());
		result = prime * result + id;
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
		Account other = (Account) obj;
		if (balance != other.balance)
			return false;
		if (blocked != other.blocked)
			return false;
		if (currency != other.currency)
			return false;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Счёт [Номер = " + id + ", Баланс = " + balance + ", Блокирован счет " + blocked + ", Валюта " + currency
				+ "]";
	}

}
