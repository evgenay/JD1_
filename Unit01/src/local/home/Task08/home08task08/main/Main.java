package local.home08task08.main;

import java.util.List;

/* Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
 * метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и
 * методами. Задать критерии выбора данных и вывести эти данные на консоль.
 * Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
 * Найти и вывести:
 * a) список покупателей в алфавитном порядке;
 * b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */

public class Main {
	public static void main(String[] args) {

		CustomerInfo customer = new CustomerInfo(5);

		customer.add(new Customer(1234, "Сергеев А.Е.", "Минск, Кирова,2  ", 175890, 1234567));
		customer.add(new Customer(1235, "Андреев Г.В.", "Москва, 8-Марта,7", 178890, 1234568));
		customer.add(new Customer(1236, "Егоров С.М. ", "Гродно, 9-Мая,8  ", 178891, 1234569));
		customer.add(new Customer(1237, "Петров Т.В. ", "Лида, Зеленая,15 ", 178893, 1234566));
		customer.add(new Customer(1238, "Сидор Л.В., ", "Брест, Мира,16   ", 175890, 1234565));

		System.out.println("Список клиентов:");
		List<Customer> getAll = CustomerLogic.allCustomerInfo(customer);
		print(getAll);

		System.out.println("\nСписок клиентов по алфавиту:");
		List<Customer> getSort = CustomerLogic.findCustomerInfo(customer);
		print(getSort);

		System.out.println("\nСписок клиентов, у которых номер кредитной карточки находится в заданном интервале:");
		List<Customer> getSortCard = CustomerLogic.findCardNumber(customer, 178890, 178999);
		print(getSortCard);

	}

	public static void print(List<Customer> cust) {
		for (Customer ct : cust) {
			System.out.printf("Id: %d: ", ct.getId());
			System.out.printf("ФИО: %s ", ct.getName());
			System.out.printf("Адресс: %s ", ct.getAddress());
			System.out.printf("Номер карты: %d\n", ct.getCreditCard());
		}
	}
}
