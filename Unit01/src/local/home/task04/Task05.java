package local.home.task04.main;

import java.util.stream.IntStream;

/* Написать метод(методы) для нахождения суммы
 *  большего и меньшего из трех чисел.
 */

public class Task05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 5, 6 };
		sum(a);

	}

	public static void sum(int[] a) {
		int max = IntStream.of(a).max().orElse(Integer.MIN_VALUE);
		int min = IntStream.of(a).min().orElse(Integer.MAX_VALUE);

		System.out.println("Сумма = " + (min + max));

	}
}
