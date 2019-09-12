package local.home08task09.main;

import java.util.List;

/* Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод
 * toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами.
 * Задать критерии выбора данных и вывести эти данные на консоль.
 * Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
 * Найти и вывести:
 * a) список книг заданного автора;
 * b) список книг, выпущенных заданным издательством;
 * c) список книг, выпущенных после заданного года.
 */

public class Main {
	public static void main(String[] args) {

		Library library = new Library(5);

		library.add(new Book(2043, "Алгоритмы", "Иванов В.И.", "Piter", 1986, 1500, 50, "Твердый"));
		library.add(new Book(2044, "Прграммирование для детей", "Петров П.П.", "Piter", 1988, 1200, 45, "Твердый"));
		library.add(new Book(2045, "ЛВС", "Tanenbaum", "Piter", 2001, 700, 85, "Мягкий"));
		library.add(new Book(2046, "Современные ОС", "Tanenbaum", "О рейли", 2005, 800, 90, "Мягкий"));
		library.add(new Book(2047, "Windows 10", "Василий Т.В.", "Москва", 2007, 450, 29, "Твердый"));

		System.out.println("Общий список книг:");
		List<Book> getAll = LibraryLogic.allBookInfo(library);
		print(getAll);

		System.out.println("\nПоиск книг с сортировкой по автору:");
		List<Book> getAut = LibraryLogic.findByAuthor(library, "Tanenbaum");
		print(getAut);

		System.out.println("\nПоиск книг с сортировкой по издательству:");
		List<Book> getPub = LibraryLogic.findByPublishingOffice(library, "Piter");
		print(getPub);

		System.out.println("\nПоиск книг с сортировкой поcле заданного года:");
		List<Book> getYear = LibraryLogic.findByYear(library, 2000);
		print(getYear);

	}

	public static void print(List<Book> lib) {
		for (Book b : lib) {
			System.out.printf("Id: %d: ", b.getId());
			System.out.printf("Название: %s - ", b.getTitle());
			System.out.printf("Автор: %s:", b.getAuthor());
			System.out.printf("Издательство: %s ", b.getPublishingOffice());
			System.out.printf("Год: %s\n", b.getYear());
		}

	}

}
