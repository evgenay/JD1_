package local.home.task07.main;

// Создать и вывести на экран матрицу 2 x 3, заполненную случайными числами из [0, 9].

public class Task02 {

	public static void main(String[] args) {
		int[][] mas = new int[2][3];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = (int) (Math.random() * 10);
			}
		}
		MyMethod.inPrintMat(mas);
	}
}
