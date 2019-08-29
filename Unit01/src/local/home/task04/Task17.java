package local.home.task04.main;

import java.util.stream.IntStream;

/* Натуральное число, в записи которого n цифр, называется числом Армстронга,
 *  если сумма его цифр, возведенная в степень n, равна самому числу. k
 *  Найти все числа Армстронга от 1 до к. Для решения задачи использовать декомпозицию.
 */

public class Task17 {
	public static void main(String[] args) {
		int k = 1000;
		System.out.println("Числа Армстронга = ");
		inArm(k);

	}

	public static void inArm(int k) {
		IntStream.range(1, k)

				.filter((n) -> {
					final String number = Integer.toString(n);
					return number.chars().mapToDouble(v -> Math.pow(v - '0', number.length())).sum() == n;
				}).forEach(System.out::println);
	}
}