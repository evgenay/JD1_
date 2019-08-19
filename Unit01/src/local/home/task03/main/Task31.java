package local.home.task03.main;

import java.util.Scanner;

/* Компьютер генерирует пять чисел в диапазоне от 1 до 15 включительно. Человек пытается их
 *угадать. Программа должна выводить угаданные и неугаданные числа из тех, что сгенерировала
 *программа, а также ошибочные числа пользователя.
 */

public class Task31 {
	public static void main(String[] args) {
		double a = 1;
		double b;
		double c = 1;

		do {
			a = Math.random() * 15;
			a = (int) a;

			//System.out.println(a); - покажет задуманное число

			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.print("Введите число от 1 до 15 ");
			System.out.print("> ");

			while (!sc.hasNextInt()) {
				sc.next();
				System.out.print("Неверное значение, повторите ещё раз>  ");
			}
			b = sc.nextInt();

			if (a == b) {
				System.out.println("Угаданная цифра " + b);
			} else if (a != b) {
				System.out.println("Цифру вы не угадали -  " + b);
				System.out.println("Цифра ПК - " + a);
			}
			c++;
		} while (c <= 5);
		System.out.println("---Конец игры--- ");
	}
}
