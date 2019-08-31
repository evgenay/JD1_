package local.home.task06.main;

import local.home.task05.main.MyMethod;

/*. Даны две последовательности a1, a2 ,an и b1 , b2 , bm.
 *  Образовать из них новую последовательность чисел так, чтобы она тоже была неубывающей.
 *  Примечание. Дополнительный массив не использовать.
 */

public class Task02 {
	public static void main(String[] args) {

		int a = 0;
		int b = 0;
		int i = 0;
		int[] mas1 = new int[] { 1, 3, 5, 8, 12, 30, 50 };
		int[] mas2 = new int[] { 2, 4, 6, 11, 21, 40, 60 };

		int leng = mas1.length + mas2.length;
		int[] mas3 = new int[leng];

		MyMethod.inPrint(mas1);
		System.out.println("\n");
		System.out.println("Второй ");
		MyMethod.inPrint(mas2);
		System.out.println();
		System.out.println("\nИтоговый ");

		do {
			if (a > mas1.length - 1) {
				mas3[i] = mas2[b];
				b++;
			} else if (b > mas2.length - 1) {
				mas3[i] = mas1[a];
				a++;
			} else if (mas1[a] < mas2[b]) {
				mas3[i] = mas1[a];
				a++;
			} else {
				mas3[i] = mas2[b];
				if (b < mas2.length - 1) {
					b++;
				}
			}
			i++;

		} while (i < mas3.length);

		MyMethod.inPrint(mas3);
	}
}
