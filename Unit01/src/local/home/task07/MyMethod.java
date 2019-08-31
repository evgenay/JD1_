package local.home.task07.main;

public class MyMethod {

// Метод генерации одномерного массива
	public static int[] inMas(int a, int b) {
		int mas[] = new int[a];
		for (int i = 0; i < a; i++) {
			mas[i] = (int) (Math.random() * b);
		}
		return mas;
	}

//	Метод генерации двухмерного массива
	public static int[][] inTwoMas(int n, int m, int c) {
		int[][] mas = new int[n][m];
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = (int) (Math.random() * c);
			}
		}
		return mas;
	}

//  Метод печати одномерного массива	
	public static void inPrint(int[] mas) {
		System.out.println("Исходный массив: ");
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + ",");
		}
	}

// Метод печати двухмерного массива
	public static void inPrintMat(int[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("mas[%d][%d]=%-6d ", i, j, mas[i][j]);
			}
			System.out.println();
		}
	}
}
