package local.home.task03.main;

// Составить таблицу значений функции y = 5 - x2 / 2 на отрезке [-5; 5] с шагом 0.5

public class Task13 {
	public static void main(String[] args) {
		double x = -5;
		double y;

		System.out.println("__X__" + "__" + "___Y____");
		while (x <= 5) {
			y = 5 - ((Math.pow(x, 2) / 2));
			System.out.println(x + "  |  " + y);
			x = x + 0.5;
		}
	}
}
