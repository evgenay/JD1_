package local.home.task03.main;

/*Получить все числа, не превышающие заданного числа N, 
 * которые делятся без остатка на все свои цифры.
 */

public class Task40 {
	public static void main(String args[]) {
		int n = 567;
		int a, b;

		for (int i = n; i > 0; i = i - 1) {
			int c = i;
			a = c % 10;
			b = c % 100 / 10;

			if ((a != 0) && (b != 0) && (c % a == 0) && (c % b == 0)) {

				System.out.println("Число = " + c + " делится");

			}
			c = c / 10;
		}

	}

}
