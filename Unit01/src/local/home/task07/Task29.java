package local.home.task07.main;

//Найти положительные элементы главной диагонали квадратной матрицы. 

public class Task29 {
	public static void main(String[] args) {
		int n = 6;
		int m = n;
		int c = 10;
		int elem = 0;
		int sum = 0;
		int[][] mas = MyMethod.inTwoMas(n, m, c);

		System.out.println("Исходный массив:");

		MyMethod.inPrintMat(mas);
		System.out.println("\nПоложительные элементы диагонали\n");

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if ((i == j) && (mas[i][j] > 0))
					elem = mas[i][j];
			}
			System.out.print(elem + " ");
			sum = sum + elem;

		}
		System.out.println("\nСумма элементов диагонали = " + sum);
	}
}
