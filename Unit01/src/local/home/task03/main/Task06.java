package local.home.task03.main;

import java.util.Scanner;

/*Напишите программу, где пользователь вводит любое целое положительное число. А программа
* суммирует все числа от 1 до введенного пользователем числа.
*/

public class Task06 {
	public static void main(String[] args) {
		int j = 0;
		int i = 1;
		int sum = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Введит любое целое положительное число > ");

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("Неверное значение, повторите ещё раз ");
		}

		j = sc.nextInt();

		for (i = 1; i <= j; i++) {
			sum = sum + i;
			System.out.println("Сумма = " + sum + "  ");

		}

	}

}
