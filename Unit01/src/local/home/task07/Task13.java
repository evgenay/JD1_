package local.home.task07.main;

//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class Task13 {

	public static void main(String[] args) {
		int n = 4;
		int m = n;
		int c = 1;
		int[][] mas = MyMethod.inTwoMas(n, m, c);

		System.out.println("Исходный массив:");

		MyMethod.inPrintMat(mas);
		System.out.println("\n" + "Квадратная матрица порядка n: " +n+ "\n");

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i % 2 == 0) {
					mas[i][j] = j + c;
				} else {
					mas[i][j] = m - j;
				}
			}
		}
		MyMethod.inPrintMat(mas);
	}
}
