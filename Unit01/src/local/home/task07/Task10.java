package local.home.task07.main;

//Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

public class Task10 {

	public static void main(String[] args) {
		int n = 4;
		int m = 4;
		int c = 10;
		int k = 2;
		int p = 2;
		int[][] mas = MyMethod.inTwoMas(n, m, c);

		System.out.println("Исходный массив:");

		MyMethod.inPrintMat(mas);

		System.out.print("\n Строка " + k + "\n");
		for (int i = 0; i < mas[k].length; i++) {
			System.out.print(" " + mas[k][i]);
		}
		System.out.println("\n-------------");

		System.out.print(" Столбец " + p + "\n");
		for (int j = 0; j < mas[p].length; j++) {
			System.out.print(" " + mas[j][p]);
		}
	}

}
