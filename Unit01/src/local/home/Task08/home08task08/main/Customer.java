package local.home08task08.main;

public class Customer {
	private int id;
	private String name;
	private String address;
	private int creditCard;
	private int bankAccount;
	
	public Customer(int id, String name, String address, int creditCard, int bankAccount) {
		
		this.id = id;
		this.name = name;
		this.address = address;
		this.creditCard = creditCard;
		this.bankAccount = bankAccount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getCreditCard() {
		return creditCard;
	}
	
	public void setCreditCard(int creditCard) {
		this.creditCard = creditCard;
	}
	
	
	public int getbankAccount() {	
		return bankAccount;
	}
	public void setbankAccount(int bankAccount) {
		this.bankAccount = bankAccount;
	}
	
	@Override
	public String toString() {
		return "Customer: id = " + id + ", Name = " + name + ", address = " + address + ", creditCardNumber = " + creditCard
				+ ", bankAccountNumber = " + bankAccount;
	}
	

}
