package local.home.task07.main;

//Дана матрица. Вывести на экран все четные строки, то есть с четными номерами.

public class Task05 {
	public static void main(String[] args) {
		int[][] mas = new int[5][4];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = (int) (Math.random() * 10);
			}
		}
		for (int i = 0; i < mas.length; i++) {
			if (i % 2 == 0)
				for (int j = 0; j < mas[i].length; j++) {
					System.out.printf("mas[%d][%d]=%-6d ", i, j, mas[i][j]);
				}
			System.out.println();
		}

	}

}
