package local.home.task03.main;

//Найдите все четырехзначные числа, сумма цифр каждого из которых равна 15

public class Task34 {
	public static void main(String[] args) {

		int a = 1000;
		int b = 10000;

		for (int i = a; i <= b; i = i + 1) {
			int x = i;
			int y = 0;
			for (int j = a; j < b; j++) {
				y = y + x % 10;
				x = x / 10;
			}
			if (y == 15) {
				System.out.println("Сумма цифр числа равная 15 = " + i);
			}
		}
	}

}
