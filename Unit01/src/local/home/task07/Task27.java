package local.home.task07.main;

/* В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить на 
 * соответствующие  им  позиции  другого,  а  его  элементы  второго  переместить  в  первый.  Номера  столбцов  вводит 
 * пользователь с клавиатуры. 
 */

import java.util.Scanner;

public class Task27 {
	public static void main(String[] args) {
		int n = 4;
		int m = n;
		int c = 10;
		int newColumn1 = 0;
		int newColumn2 = 0;
		int[][] mas = MyMethod.inTwoMas(n, m, c);

		System.out.println("Исходный массив:");

		MyMethod.inPrintMat(mas);

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите номера столбцов >>");
		while ((!sc.hasNextInt()) || (mas.length - 1 < sc.nextInt())) {
			sc.next();
			System.out.print("Неверное значение, повторите ещё раз>  ");
		}

		int column1 = sc.nextInt();
		int column2 = sc.nextInt();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (j == column1) {
					newColumn1 = mas[i][j];
				}
				if (j == column2) {
					newColumn2 = mas[i][j];
				}
			}
			mas[i][column1] = newColumn2;
			mas[i][column2] = newColumn1;
		}
		System.out.println("Измененный массив:");
		MyMethod.inPrintMat(mas);
	}
}