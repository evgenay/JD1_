package local.home.task05.main;

/* Дана последовательность чисел а1 ,а2 ,..., ап.
 * Указать наименьшую длину числовой оси, содержащую все эти числа.
 */

public class Task06 {
	public static void main(String[] args) {

		int[] mas = MyMethod.inMas(10, 10);
		int a = mas[0];
		int b = mas[0];
		int min;

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] >= a) {
				a = mas[i];
			}
			if (mas[i] <= b) {
				b = mas[i];
			}
		}
		min = a - b;
		System.out.println("Наименьшая длина числовой оси = " + (min) + " для массива из: ");
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
	}

}
