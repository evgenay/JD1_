package local.home.task07.main;

/*Дан двухмерный массив n×m элементов. 
 * Определить, сколько раз встречается число 7 среди элементов массива.
 */

public class Task08 {

	public static void main(String[] args) {
		int n = 8;
		int m = 8;
		int c = 10;
		int count = 0;
		int[][] mas = MyMethod.inTwoMas(n, m, c);

		System.out.println("Исходный массив:");

		MyMethod.inPrintMat(mas);
		System.out.println();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] == 7)
					count++;
			}
		}
		System.out.println("Число 7 встречается = " + count + " раз(а)");

	}

}
