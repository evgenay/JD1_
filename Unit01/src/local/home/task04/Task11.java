package local.home.task04.main;

/* Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5];
 * D[4] +D[5] +D[6].Пояснение. Составить метод(методы) для вычисления суммы
 * трех последовательно расположенных элементов
 * массива с номерами от k до m
 */

public class Task11 {

	public static void main(String[] args) {
		int mas[] = MyMethod.inMas(10, 10);
		int k = 7;
		int sum = 0;
		System.out.println("Сумма D[l] + D[2] + D[3] = " + inSum(mas, 0, sum));
		System.out.println("Сумма D[3] + D[4] + D[5] = " + inSum(mas, 2, sum));
		System.out.println("Сумма D[4] + D[5] + D[6] = " + inSum(mas, 3, sum));

		System.out.println("Сумма от номера К = " + inSum(mas, k, sum));

	}

	public static int inSum(int[] mas, int j, int sum) {
		for (int i = j; i < (j + 3); i++) {
			sum = sum + mas[i];
		}
		return sum;
	}
}
