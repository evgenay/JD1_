package local.home.task07.main;

// Отсортировать строки матрицы по возрастанию и убыванию значений элементов

public class Task32 {
	public static void main(String[] args) {
		int n = 4;
		int m = n;
		int c = 10;
		int elem = 0;
		int temp = 0;
		int[][] mas = MyMethod.inTwoMas(n, m, c);

		System.out.println("Исходный массив:");

		MyMethod.inPrintMat(mas);
		System.out.println("\nCтроки по возрастанию:");

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				for (elem = 0; elem < mas[i].length - 1; elem++) {
					if (mas[i][elem] > mas[i][elem + 1]) {
						temp = mas[i][elem];
						mas[i][elem] = mas[i][elem + 1];
						mas[i][elem + 1] = temp;
					}
				}
			}
		}
		MyMethod.inPrintMat(mas);
		System.out.println("\nCтроки по убыванию:");

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				for (elem = 0; elem < mas[i].length - 1; elem++) {
					if (mas[i][elem] < mas[i][elem + 1]) {
						temp = mas[i][elem];
						mas[i][elem] = mas[i][elem + 1];
						mas[i][elem + 1] = temp;
					}
				}
			}
		}
		MyMethod.inPrintMat(mas);
	}

}
