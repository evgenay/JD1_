package local.home.task07.main;

// Дан двухмерный массив 5×5. Найти сумму модулей отрицательных нечетных элементов.

public class Task07 {

	public static void main(String[] args) {
		int[][] mas = new int[5][5];
		int sum = 0;
		System.out.println("Исходный массив:");

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = (int) (Math.random() * -10);
			}
		}
		MyMethod.inPrintMat(mas);
		System.out.println();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] % 2 != 0)
					sum = sum + Math.abs(mas[i][j]);
			}
		}
		System.out.println("Сумма по модулю отрицательных нечетных элементов = " + sum);
	}
}
