package local.home.task07.main;

// Получить квадратную матрицу порядка n:

public class Task12 {

	public static void main(String[] args) {
		int n = 5;
		int m = n;
		int c = 0;
		int[][] mas = MyMethod.inTwoMas(n, m, c);

		System.out.println("Исходный массив:");

		MyMethod.inPrintMat(mas);
		System.out.println("\n" + "Квадратная матрица порядка n:" + "\n");

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i == j)
					mas[i][j] = j;
			}
		}
		MyMethod.inPrintMat(mas);
	}
}
