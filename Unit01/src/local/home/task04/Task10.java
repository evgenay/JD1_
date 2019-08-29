package local.home.task04.main;

//Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.

public class Task10 {
	public static void main(String[] args) {
		int fsum = 0;

		for (int j = 1; j <= 9; j = j + 2) {
			fsum = fsum + sum(j);
		}
		System.out.println("Факториал " + " = " + fsum);
	}

	public static int sum(int a) {
		int fact = 1;

		for (int i = 1; i <= a; i = i + 1) {
			fact = (fact * i);
		}
		return fact;
	}
}
