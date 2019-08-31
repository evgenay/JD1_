package local.home.task05.main;

/* Задана последовательность N вещественных чисел.Вычислить сумму чисел, 
 *  порядковые номера которых являются простыми числами.
 */

public class Task12 {

	public static void main(String[] args) {
		double sum = 0;
		double[] mas = new double[] { -8.5, -5, 4, 3, 1, 115, 289, 37.1 };
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + ",");
		}
		System.out.println("\nПростые числа: ");

		for (int i = 0; i < mas.length; i++) {
			if ((i == 2) || (i % 2 != 0)) {
				sum = sum + mas[i];
				System.out.print(mas[i] + ",");
			}
		}
		System.out.println("\nСумма простых чисел = " + sum);
	}
}
