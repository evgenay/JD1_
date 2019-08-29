package local.home.task04.main;

/*Даны натуральные числа К и N. Написать метод(методы) формирования массива А,
 *элементами которого являются числа, сумма цифр которых равна К и которые не большее N
 */

public class Task15 {
	public static void main(String[] args) {

		int n = 10;
		int k = 60;
		int length;

		length = (inMass(n, k));
		int[] mas = new int[length];
		outMass(mas, n, k);

		System.out.println("Длина массива = " + mas.length);
		for (int i = 0; i < mas.length; i++) {
			System.out.print("\n№ - " + i + "-значение - " + mas[i] + " ");
		}
	}

	public static int inMass(int n, int k) {
		int i = 1;
		int j = 0;
		int x = 0;
		int step = 0;

		while (i < k) {
			j = i;
			int sum = 0;
			i++;

			while (j > 0) {
				x = j % 10;
				j = (j - x) / 10;
				sum = sum + x;
			}
			if (sum == n) {
				step++;
			}
		}
		return step;
	}

	public static void outMass(int[] mas, int n, int k) {
		int i = 1;
		int j = 0;
		int x = 0;
		int step = 0;

		while (i < k) {
			i++;
			j = i;
			int sum = 0;

			while (j > 0) {
				x = j % 10;
				j = (j - x) / 10;
				sum = sum + x;
			}
			if (sum == n) {
				mas[step] = i;
				step++;
			}
		}
	}
}
