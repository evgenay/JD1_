package local.home.task07.main;

// Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего

public class Task06 {
	public static void main(String[] args) {
		int[][] mas = new int[5][5];
		System.out.println("�������� ������:");

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = (int) (Math.random() * 10);
			}
		}
		MyMethod.inPrintMat(mas);
		System.out.println();
		System.out.println("������ ������� ��������� ������� = " + mas[0][1] + "\n");

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if ((j % 2 != 0) && (mas[0][1] > mas[mas[i].length - 1][j]))
					System.out.printf("mas[%d][%d]=%-6d ", i, j, mas[i][j]);
			}
			System.out.println();
		}

	}

}
