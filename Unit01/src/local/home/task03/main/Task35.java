package local.home.task03.main;

//Найдите количество четных цифр данного натурального числа.

public class Task35 {
	public static void main(String[] args) {

		int a = 2563844;
		int b = 0;
		int x = 0;

		x = a;
		while (a > 0) {

			b = a % 10;
			a = (a - b) / 10;

			if (x % 2 == 0)
				b = b + 1;
			b++;
		}
		System.out.println("Количество четных цифр числа " + x + " = " + b);
	}

}
