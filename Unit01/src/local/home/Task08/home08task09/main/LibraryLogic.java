package local.home08task09.main;

import java.util.ArrayList;
import java.util.List;

public class LibraryLogic {
	public static List<Book> allBookInfo(Library lib) {

		Book[] book = lib.getBooks();
		List<Book> result = new ArrayList<Book>();
		for (Book bk : book) {
			result.add(bk);
		}

		return result;
	}

	public static List<Book> findByAuthor(Library lib, String aut) {

		Book[] book = lib.getBooks();
		List<Book> result = new ArrayList<Book>();

		for (int i = 0; i < book.length; i++) {

			if (book[i].getAuthor().compareTo(aut) == 0) {
				result.add(book[i]);
			}
		}

		return result;
	}
	
	
	public static List<Book> findByPublishingOffice(Library lib, String publishingOffice) {

		Book[] book = lib.getBooks();
		List<Book> result = new ArrayList<Book>();

		for (int i = 0; i < book.length; i++) {

			if (book[i].getPublishingOffice().compareTo(publishingOffice) == 0) {
				result.add(book[i]);
			}
		}

		return result;
	}
	

	public static List<Book> findByYear(Library lib, int currentYear) {

		Book[] book = lib.getBooks();
		List<Book> result = new ArrayList<Book>();

		for (int i = 0; i < book.length; i++) {

			if (book[i].getYear() >= currentYear) {
				result.add(book[i]);
			}
		}

		return result;
	}

}
