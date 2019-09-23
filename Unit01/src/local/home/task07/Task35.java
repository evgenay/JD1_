package local.home.task07.main;

//Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

public class Task35 {
	public static void main(String[] args) {
		int n = 4;
		int m = n;
		int c = 10;
		int[][] mas = MyMethod.inTwoMas(n, m, c);

		System.out.println("\nИсходный массив:");
		MyMethod.inPrintMat(mas);
		int max = maxElement(mas);

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] % 2 != 0) {
					mas[i][j] = max;
				}
			}
		}

		System.out.println("\nИзмененный массив:");
		MyMethod.inPrintMat(mas);
	}

	public static int maxElement(int[][] mas) {
		int max = mas[0][0];
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (max > mas[i][j]) {
				} else {
					max = mas[i][j];
				}
			}
		}
		return max;
	}
}
