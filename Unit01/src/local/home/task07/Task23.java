package local.home.task07.main;

/* Сформировать квадратную матрицу порядка N по правилу: 
 * и подсчитать количество положительных элементов в ней. 
 */

public class Task23 {

	public static void main(String[] args) {

		int n = 4;
		double[][] mas = new double[n][n];

		inMas(mas, n);

		printMas(mas);

		int plus = plusElem(mas);
		System.out.println("Количество положительных элементов = " + plus);

	}

	public static double[][] inMas(double[][] mas, int n) {

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {

				mas[i][j] = Math.sin((i * i - j * j) / n);
			}
		}
		return mas;

	}

	public static int plusElem(double[][] mas) {

		int plus = 0;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] > 0) {
					plus++;
				}
			}
		}
		return plus;

	}

	public static void printMas(double[][] mas) {

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("%.1f   ", mas[i][j]);
			}
			System.out.println();
		}

	}

}
