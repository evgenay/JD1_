package local.home.task07.main;

//Дан линейный массив  x1, x2,, xn−1, xn . Получить действительную квадратную матрицу порядка n:

public class Task24 {
	public static void main(String[] args) {
		int n = 6;
		int m = n;
		int c = 2;
		int[][] mas = MyMethod.inTwoMas(n, m, c);

		MyMethod.inPrintMat(mas);
		System.out.println("\n" + "Линейный массив порядка n: " + n + "\n");

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = (int) Math.pow(c, i + 1);
			}
		}
		MyMethod.inPrintMat(mas);

	}
}
