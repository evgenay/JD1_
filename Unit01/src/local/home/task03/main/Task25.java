package local.home.task03.main;

import java.util.Scanner;

// Требуется определить факториал числа, которое ввел пользователь.

public class Task25 {
	public static void main(String[] args) {
		int a = 5;
		double f = 1;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите число > ");

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("Неверное значение, повторите ещё раз ");
		}
		a = sc.nextInt();

		for (int i = 1; i <= a; i = i + 1) {
			f = (f * i);

		}
		System.out.println("Факториал числа " + a + " = " + f);
	}

}
