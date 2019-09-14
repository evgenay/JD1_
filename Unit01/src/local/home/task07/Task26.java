package local.home.task07.main;

/*. С клавиатуры вводится двумерный массив чисел размерностью nxm. Выполнить с массивом следующие действия:  
 * а) вычислить сумму отрицательных элементов в каждой строке;  
 * б) определить максимальный элемент в каждой строке;  
 * в) переставить местами максимальный и минимальный элементы матрицы.
 */

import java.util.Scanner;

public class Task26 {
	public static void main(String[] args) {

		int n = 2;
		int m = 2;
		int[][] mas = new int[n][m];

		readMas(mas);
		System.out.println("\nИсходный массив");
		MyMethod.inPrintMat(mas);
		sumMinus(mas);
		maxElemen(mas);

		int max = max(mas);
		int min = min(mas);
		int maxi = 0;
		int maxj = 0;
		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] == max) {
					maxi = i;
					maxj = j;
				}
				if (mas[i][j] == min) {
					mas[i][j] = max;
				}
			}
		}
		mas[maxi][maxj] = min;

		System.out.println("\nПереставленные элементы матрицы\n");
		MyMethod.inPrintMat(mas);

	}

	public static void readMas(int[][] mas) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Заполните массив количеством из " + mas.length * mas.length + " значений \n>");
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = sc.nextInt();
			}
		}
	}

	public static void sumMinus(int[][] mas) {

		int sum = 0;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] < 0) {
					sum = sum + mas[i][j];
				}
			}
			System.out.println("Сумма отрицательных элементов в  строке: " + i + " = " + sum);
			sum = 0;
		}
	}

	public static void maxElemen(int[][] mas) {

		int max;

		for (int i = 0; i < mas.length; i++) {
			max = mas[i][0];
			for (int j = 0; j < mas[i].length; j++) {
				if (max > mas[i][j]) {
				} else {
					max = mas[i][j];
				}
			}
			System.out.println("Максимальный элемент в строке: " + i + " = " + max);
		}

	}

	public static int max(int[][] mas) {
		int max = mas[0][0];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (max > mas[i][j]) {
				} else {
					max = mas[i][j];
				}
			}
		}
		return max;
	}

	public static int min(int[][] mas) {
		int min = mas[0][0];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (min < mas[i][j]) {
				} else {
					min = mas[i][j];
				}
			}
		}
		return min;
	}

}
