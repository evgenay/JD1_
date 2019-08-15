package local.home.task03.main;

// Даны два числа. Определить цифры, входящие в запись как первого так и второго числа

public class Task29 {
	public static void main(String[] args) {
		int a = 7834;
		int b = 3827;
		int c;
		int d;

		while (a > 0) {
			d = a % 10;
			a = a / 10;
			a = (int) a;
			c = b;

			do {
				if (c % 10 == d)
					System.out.println("Общая цифра в двух числах = " + d);
				c = c / 10;
				c = (int) c;

			} while (c > 0);
		}

	}

}
