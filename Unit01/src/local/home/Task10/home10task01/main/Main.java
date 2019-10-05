package local.home10task01.main;

/* Создать объект класса Текстовый файл, используя классы Файл, Директория.
 * Методы: создать, переименовать, вывести на консоль содержимое, 
 * дополнить, удалить. 
 */

public class Main {
	public static void main(String[] args) {

		TextFile one = new TextFile("1","Тут начало текстового файла ", Extension.TXT);
		TextFile ten = new TextFile("10","Еще одно содержимое файла в директории ", Extension.TXT);

		one.setName("ONE");
		one.setType(Extension.TXT);
		print(one);

		one.setName("TWO");// переименование
		one.setType(Extension.TXT);
		one.setData("в месте с дополнением ");
		print(one);

		ten.setName("TEN");
		ten.setType(Extension.TXT);
		print(ten);

		one.deleteData();// стирание
		prinDel(one);

		ten.deleteData();// стирание
		prinDel(ten);
	}

	public static void print(TextFile file) {
		System.out.println("\nФайл с именем - " + file.getName() + " и расширением - " + file.getType() + " содержит:\n"
				+ file.getData());
	}

	public static void prinDel(TextFile file) {
		System.out.println(
				"\nФайл с именем - " + file.getName() + " и расширением - " + file.getType() + " ничего не содержит");
	}
}
