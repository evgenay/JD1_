package local.home.task07.main;

//Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

public class Task09 {

	public static void main(String[] args) {
		int n = 4;
		int m = 4;
		int c = 10;
		int[][] mas = MyMethod.inTwoMas(n, m, c);

		System.out.println("Исходный массив:");

		MyMethod.inPrintMat(mas);
		System.out.println("\n" + "Элементы по диагонали:" + "\n");

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i == j)
					System.out.printf("mas[%d][%d]=%-6d ", i, j, mas[i][j]);
			}
			System.out.println();
		}

	}

}
