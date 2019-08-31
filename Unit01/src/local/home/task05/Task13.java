package local.home.task05.main;

/*Определить количество элементов последовательности натуральных чисел,
 *  кратных числу М и заключенных в промежутке от L до N.
 */

public class Task13 {
	public static void main(String[] args) {
		int[] mas = MyMethod.inMas(10, 10);
		int t = 0;
		int m = 2;
		int l = 3;
		int n = 8;

		MyMethod.inPrint(mas);

		System.out.println("\nСформированный массив ");
		for (int i = 0; i < mas.length; i++) {
			if ((mas[i] % m == 0) && (mas[i] > l) && (mas[i] < n)) {
				System.out.print("  " + mas[i]);
				t++;
			}
		}
		System.out.println("\nВсего элеметов = " + t);
	}
}
