package local.home09task04.main;

import java.util.ArrayList;
import java.util.List;

public class AccountLogic {

	public static void setBlockedAccount(Client client, int id) {
		for (Account account : client.getAccounts()) {
			if (account.getId() == id) {
				account.setBlocked(true);
			}
		}
	}

	public static void unBlockedAccount(Client client, int id) {
		for (Account account : client.getAccounts()) {
			if (account.getId() == id) {
				account.setBlocked(false);
			}
		}
	}

	public static List<Account> searchIsBlocked(Client client) {
		List<Account> searchIsBlocked = new ArrayList<Account>();

		for (Account account : client.getAccounts()) {
			if (account.isBlocked()) {
				searchIsBlocked.add(account);
			}
		}
		return searchIsBlocked;
	}

	public static List<Account> searchById(Client client, int id) {
		List<Account> searchById = new ArrayList<Account>();

		for (Account account : client.getAccounts()) {
			if (account.getId() == id) {
				searchById.add(account);
			}
		}
		return searchById;
	}

	public static int getSumClientsAccounts(Client client) {
		int sum = 0;

		for (Account account : client.getAccounts()) {
			sum += account.getBalance();
		}
		return sum;
	}

	public static int getPositiveSumAccounts(Client client) {
		int sum = 0;

		for (Account account : client.getAccounts()) {
			if (account.getBalance() > 0) {
				sum += account.getBalance();
			}
		}
		return sum;
	}

	public static int getNegativeSumAccounts(Client client) {
		int sum = 0;

		for (Account account : client.getAccounts()) {
			if (account.getBalance() < 0) {
				sum += account.getBalance();
			}
		}
		return sum;
	}

}
