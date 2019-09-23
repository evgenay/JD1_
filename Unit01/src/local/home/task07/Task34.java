package local.home.task07.main;

/*Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
 *  причем в каждом столбце число единиц равно номеру столбца.
 */

public class Task34 {

	public static void main(String[] args) {
		int n = 4;
		int m = n;
		int c = 2;
		int zero = 0;
		int[][] mas = MyMethod.inTwoMas(n, m, c);

		System.out.println("\nИсходный массив:");
		MyMethod.inPrintMat(mas);

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = 0;
				zero = j;
				for (int k = 0; k < mas.length; k++) {

					if (zero == 0) {
						mas[i][j] = 0;
					} else {
						mas[k][j] = 1;
						zero--;
					}
				}
			}
		}
		System.out.println("\nИзмененный массив:");
		MyMethod.inPrintMat(mas);
	}
}
