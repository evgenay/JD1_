package local.home.task07.main;

// Получить квадратную матрицу порядка n: 

public class Task25 {
	public static void main(String[] args) {
		int n = 6;
		int m = n;
		int c = 1;
		int[][] mas = MyMethod.inTwoMas(n, m, c);

		System.out.println("Исходный массив:");

		MyMethod.inPrintMat(mas);
		System.out.println("\n" + "Квадратная матрица порядка n: " + n + "\n");

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = i * n + j + 1;
			}
		}
		MyMethod.inPrintMat(mas);

	}
}
