package local.home.task07.main;

//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class Task20 {
	public static void main(String[] args) {
		int n = 4;
		int m = n;
		int c = 1;
		int[][] mas = MyMethod.inTwoMas(n, m, c);

		System.out.println("Исходный массив:");

		MyMethod.inPrintMat(mas);
		System.out.println("\n" + "Квадратная матрица порядка n: " + n + "\n");
		boolean flag = false;
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[0].length; j++) {
				flag = (j >= i && j + i < mas[0].length) || (j <= i && j + i >= mas[0].length - 1);
				if (flag != false)
					mas[i][j] = 0;
				else
					mas[i][j] = 1;
				if (i == j)
					mas[i][j] = 1;
			}
		}
		for (int j = 0; j < mas.length; j++) {
			mas[j][mas[0].length - 1 - j] = 1;
		}
		MyMethod.inPrintMat(mas);
	}

}
