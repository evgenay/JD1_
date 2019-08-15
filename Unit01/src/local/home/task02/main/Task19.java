package local.home.task02.main;

/*Подсчитать количество положительных
 * среди чисел а, b, с.
 */

public class Task19 {
	public static void main(String args[]) {
		int a = 8;
		int b = 5;
		int c = -1;

		if (a >= 0) {
			a = 1;
		} else {
			a = 0;
		}
		if (b >= 0) {
			b = 1;
		} else {
			b = 0;
		}
		if (c >= 0) {
			c = 1;
		} else {
			c = 0;
		}
		System.out.println("Количество положительных чисел  = " + (a + b + c));
	}

}
