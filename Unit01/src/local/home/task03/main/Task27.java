package local.home.task03.main;

import java.util.Scanner;

/*Для каждого натурального числа в промежутке от m до n вывести все делители,
 * кроме единицы и самого числа. m и n вводятся с клавиатуры.
 */

public class Task27 {
	public static void main(String[] args) {
		int m;
		int n;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите число m и через пробел число n > ");

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("Неверное значение, повторите ещё раз ");
		}
		m = sc.nextInt();
		n = sc.nextInt();

		for (int j = 2; j < n; j++) {

			for (int i = 2; i < m - 1; i++) {
				if (m % i == 0) {
					System.out.println("Число =  " + m + "  Делитель = " + i);
				}
			}
			m = m + 1;

		}
	}
}
