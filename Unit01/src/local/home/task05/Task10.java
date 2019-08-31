package local.home.task05.main;

/* Даны целые числа а1 ,а2 ,..., аn . 
 * Вывести на печать только те числа, для которых аi > i.
 */

public class Task10 {

	public static void main(String[] args) {
		int[] mas = MyMethod.inMas(10, 10);
		int t = 5;

		MyMethod.inPrint(mas);
		System.out.print("\n" + "---Больше числа--- " + t + "\n");

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > t) {
				System.out.print(mas[i] + ",");
			}
		}

	}

}
