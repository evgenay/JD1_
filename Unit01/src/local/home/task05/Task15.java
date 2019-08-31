package local.home.task05.main;

/*. Дана последовательность действительных чисел a a an , , , 1 2.
 *Указать те ее элементы, которые принадлежат отрезку [с, d].
 */

public class Task15 {

	public static void main(String[] args) {
		int[] mas = MyMethod.inMas(10, 20);
		int c = 4;
		int d = 14;

		MyMethod.inPrint(mas);

		System.out.print("\nЭлементы отрезка [с, d] = ");
		for (int i = 0; i < mas.length; i++) {
			if ((mas[i] >= c) && (mas[i]) <= d) {
				System.out.print(mas[i] + ",");
			}
		}

	}

}
