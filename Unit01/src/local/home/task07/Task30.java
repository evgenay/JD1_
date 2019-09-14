package local.home.task07.main;

/* Матрицу 10x20 заполнить случайными числами от 0 до 15. 
 * Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз. 
 */

public class Task30 {
	public static void main(String[] args) {
		int n = 10;
		int m = 20;
		int c = 15;
		int elem = 5;
		int replay = 3;
		int count = 0;
		int flag = 0;

		int[][] mas = MyMethod.inTwoMas(n, m, c);

		System.out.println("Исходный массив:");

		MyMethod.inPrintMat(mas);
		System.out.println();
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] == elem)
					count++;
			}
			if (count >= replay) {
				System.out.println("Число " + elem + " встречается  " + count + " раз(а) " + " в строке " + i);
				flag = count;
			}
			count = 0;
		}
		if (flag < 3)
			System.out.println("Число " + elem + " не встречается больше чем " + replay + " раза ");
	}
}
