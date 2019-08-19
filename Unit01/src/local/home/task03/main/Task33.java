package local.home.task03.main;

//Найдите наибольшую цифру данного натурального числа.

public class Task33 {
	public static void main(String[] args) {

		int a = 876954321;
		int b = 0;

		for (int i = 0; i < 10; i++) {
			a = a / 10;
			int x = (a % 10);
			if (x > b)
				b = x;
		}
		System.out.println("Наибольшая цифра натурального числа: " + b);
	}
}
