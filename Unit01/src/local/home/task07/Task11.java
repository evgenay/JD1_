package local.home.task07.main;

/* Дана матрица размера m x n. Вывести ее элементы в следующем порядке:
 * первая строка справа налево, вторая строка слева направо, 
 * третья строка справа налево и так далее (по змейке).
 */

public class Task11 {

	public static void main(String[] args) {
		int n = 4;
		int m = 4;
		int c = 10;
		int[][] mas = MyMethod.inTwoMas(n, m, c);

		System.out.println("Исходный массив:");

		MyMethod.inPrintMat(mas);
		System.out.println("\n" + "Элементы по змейке:" + "\n");

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i % 2 != 0) {
					System.out.printf("mas[%d][%d]=%-6d ", i, j, mas[i][j]);
				} else {
					System.out.printf("mas[%d][%d]=%-6d ", i, j, mas[i][m - j - 1]);
				}
			}
			System.out.println();
		}

	}

}
