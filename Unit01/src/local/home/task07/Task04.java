package local.home.task07.main;

//Дана матрица. Вывести на экран первую и последнюю строки.

public class Task04 {

	public static void main(String[] args) {
		int[][] mas = new int[3][4];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = (int) (Math.random() * 10);
			}
		}
		for (int i = 0; i < mas.length; i = i + 2) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("mas[%d][%d]=%-6d ", i, j, mas[i][j]);
			}
			System.out.println();
		}

	}

}
