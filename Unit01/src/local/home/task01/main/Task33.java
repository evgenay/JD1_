package local.home.task01.main;

/*Ввести любой символ и определить его порядковый номер, а также
 *  указать предыдущий и последующий символы.
 */
public class Task33 {
	public static void main(String[] args) {
		char a = 'u';

		int b = (int) a;

		char c = (char) (b - 1);
		char d = (char) (b + 1);

		System.out.println("Порядковый номер символа " + a + " будет = " + b);
		System.out.println("Предыдущий символ = " + c);
		System.out.println("Последующий символ = " + d);

	}

}
