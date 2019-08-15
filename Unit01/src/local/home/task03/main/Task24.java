package local.home.task03.main;

/* Вводится натуральное число. Найти сумму четных цифр, входящих в его состав. Преобразовать
* его в другое число, цифры которого будут следовать в обратном порядке по сравнению с введенным
* числом.
*/

public class Task24 {
	public static void main(String[] args) {
		int a = 1234;
		int b;
		int inv = 0;
		double sum = 0;

		for (int i = 1; i < 4; i = i + 1) {
			int j = a % 10;
			a = a / 10;
			if (i % 2 == 0) {
				sum = j + j;
			}

			b = a % 10;
			inv = inv * 10 + b;
			a = a / 10;
		}
		System.out.println("Сумма = " + sum);
		System.out.println("Число = " + inv);

	}
}