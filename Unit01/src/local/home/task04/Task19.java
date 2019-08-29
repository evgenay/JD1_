package local.home.task04.main;

/*Написать программу, определяющую сумму n - значных чисел, 
 * содержащих только нечетные цифры. Определить также, сколько
 * четных цифр в найденной сумме. 
 * Для решения задачи использовать декомпозицию
 *  
 */

import java.util.Scanner;

public class Task19 {
	public static void main(String[] args) {
		int n = 0;
		long outDig = 0;
		int num = 0;
		n = intNum(n);
		outDig = sumDig(n);
		num = MyMethod.numOutDig(outDig);
		outPrint(outDig, num);
	}

	public static int intNum(int n) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите число n (от 1 до 9) > ");

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("Неверное значение, повторите ещё раз ");
		}
		n = sc.nextInt();
		return n;
	}

	public static long sumDig(int n) {
		int begin = (int) Math.pow(10, (n - 1));
		int end = 0;
		long sum = 0l;
		int t = (n - 1);
		do {
			end = end + (int) Math.pow(10, t) * 9;
			t--;
		} while (t >= 0);

		for (int i = begin; i <= end; i++) {
			int test = i;
			boolean flag = true;
			int j = (n - 1);
			do {
				if (((test % 10) % 2) != 0) {
					test = test / 10;
				} else {
					flag = false;
					break;
				}
				j--;
			} while (j >= 0);
			if (flag == true) {
				sum = sum + i;
			}

		}
		return sum;
	}

	public static void outPrint(long num, int sum) {
		System.out.println("Сумма нечетных чисел = " + num);
		System.out.println("Количество чётных цифр = " + sum);

	}

}
