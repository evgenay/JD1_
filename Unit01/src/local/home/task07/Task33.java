package local.home.task07.main;

//Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов

public class Task33 {
	public static void main(String[] args) {
		int n = 4;
		int m = n;
		int c = 10;
		int elem = 0;
		int temp = 0;
		int[][] mas = MyMethod.inTwoMas(n, m, c);

		System.out.println("Исходный массив:");

		MyMethod.inPrintMat(mas);
		System.out.println("\nCтолбцы по возрастанию:");

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				for (elem = 0; elem < mas[i].length - 1; elem++) {
					if (mas[elem][j] > mas[elem + 1][j]) {
						temp = mas[elem][j];
						mas[elem][j] = mas[elem + 1][j];
						mas[elem + 1][j] = temp;
					}
				}
			}
		}
		MyMethod.inPrintMat(mas);
		System.out.println("\nCтолбцы по убыванию:");

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				for (elem = 0; elem < mas[i].length - 1; elem++) {
					if (mas[elem][j] < mas[elem + 1][j]) {
						temp = mas[elem][j];
						mas[elem][j] = mas[elem + 1][j];
						mas[elem + 1][j] = temp;
					}
				}
			}
		}
		MyMethod.inPrintMat(mas);
	}

}
