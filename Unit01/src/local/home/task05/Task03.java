package local.home.task05.main;

/* Дана последовательность целых чисел а1 а2,..., аn .
 *  Выяснить, какое число встречается раньше - положительное или отрицательное.
 */

public class Task03 {
	public static void main(String[] args) {
		int[] mas = new int[] { 5, 2, 6, 7, 4, -5 };

		for (int i = 0; i < mas.length;) {
			if (mas[i] > 0) {
				System.out.println("Первое число положительное " + mas[i]);
				break;
			} else if (mas[i] < 0) {
				System.out.println("Первое число отрицательное " + mas[i]);
				;
			}
			break;
		}
	}
}
