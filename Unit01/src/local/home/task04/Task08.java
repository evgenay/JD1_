package local.home.task04.main;

/* Составить программу, которая в массиве A[N] находит второе
 * по величине число (вывести на печать число,которое меньше 
 * максимального элемента массива,но больше всех других элементов).
 */

public class Task08 {
	public static void main(String[] args) {
		int w = 4;
		int x = 5;
		int y = 13;
		int z = 15;
		int a[] = { w, x, y, z };

		System.out.println("Сумма =  " + max2(a));

	}

	public static int max2(int[] a) {

		int max = a[0];
		int max2 = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		int i = 1;

		do {
			if ((a[i]) < max) {
				max2 = a[i];
			}
		} while (i++ < a.length - 1);
		return max2;
	}
}
