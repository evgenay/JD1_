package local.home.task07.main;

/*  Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так, чтобы
 *  в одной строке была ровно одна единица, и вывести на экран.
 */

public class Task01 {

	public static void main(String[] args) {
		int[][] mas = new int[3][4];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = 0;
			}
		}
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][0] = 1;
			}

		}
		MyMethod.inPrintMat(mas);
	}

}
