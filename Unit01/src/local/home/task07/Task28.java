package local.home.task07.main;

/* Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце.
 *  Определить, какой столбец содержит максимальную сумму. 
 */

public class Task28 {
	public static void main(String[] args) {

		int n = 4;
		int m = n;
		int c = 10;
		int max = 0;
		int index = 0;
		int[][] mas = MyMethod.inTwoMas(n, m, c);
		System.out.println("Исходный массив:");
		MyMethod.inPrintMat(mas);

		for (int i = 0; i < mas.length; i++) {
			System.out.println("Сумма столбца: " + i + " = " + sumColumn(mas, i));
		}

		for (int i = 0; i < mas.length; i++) {
			if (max < sumColumn(mas, i)) {
				max = sumColumn(mas, i);
				index = i;
			}
		}
		System.out.println("Столбец №: " + index + " содержит наибольшую сумму =  " + max);
	}

	public static int sumColumn(int[][] mas, int column) {
		int sum = 0;
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (j == column) {
					sum = sum + mas[i][j];
				}
			}
		}
		return sum;
	}

}
