package local.home09task04.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
 * счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
 * всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */

public class Main {

	public static void main(String[] args) {

		List<Account> account = new ArrayList<Account>();

		account.add(new Account(12345, 150, false, Currency.BYN));
		account.add(new Account(12364, 160, false, Currency.BYN));
		account.add(new Account(21365, -290, false, Currency.BYN));
		account.add(new Account(14785, 6540, false, Currency.BYN));
		account.add(new Account(98541, 715, false, Currency.BYN));

		System.out.println("Выписка счета :");
		Collections.sort(account);

		Client client = new Client("Бокша Е.В.", account);
		AccountLogic.setBlockedAccount(client, 21365);
		printClientAccounts(client);

		System.out.println("Заблокированный счет :");
		List<Account> searchIsBlocked = AccountLogic.searchIsBlocked(client);
		printAccounts(searchIsBlocked);

		System.out.println("Поиск по номеру:");
		List<Account> searchById = AccountLogic.searchById(client, 12345);
		printAccounts(searchById);

		int sumPos = AccountLogic.getPositiveSumAccounts(client);
		System.out.println("Клиент " + client.getName() + " Сумма положительного баланса = " + sumPos);

		int sumNeg = AccountLogic.getNegativeSumAccounts(client);
		System.out.println("Клиент " + client.getName() + " Сумма отрицательного баланса = " + sumNeg);

	}

	public static void printClientAccounts(Client client) {
		for (Account account : client.getAccounts()) {
			System.out.println("Имя клиента: " + client.getName() + "- " + account.toString());
		}
	}

	public static void printAccounts(List<Account> accounts) {
		for (Account account : accounts) {
			System.out.println(account.toString() + "\n");
		}
	}

}