package local.home.task05.main;

/* Даны натуральные числа а1 ,а2 ,..., аn . 
 * Указать те из них, у которых остаток от деления на М равен L (0 < L < М-1).
 */

public class Task11 {
	public static void main(String[] args) {
		int[] mas = MyMethod.inMas(10, 10);
		int l = 5;
		int m = 8;

		MyMethod.inPrint(mas);
		System.out.print("\n" + "---(0 < L < �-1)---\n");

		for (int i = 0; i < mas.length; i++) {
			if ((0 < l) && (l < (m - 1)) && ((mas[i] % m) == 1)) {
				System.out.print(mas[i] + ",");
			}
		}

	}

}
