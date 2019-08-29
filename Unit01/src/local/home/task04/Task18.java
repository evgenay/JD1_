package local.home.task04.main;

/* Найти все натуральные n-значные числа, цифры в которых образуют
 * строго возрастающую последовательность (например, 1234, 5789). 
 * Для решения задачи использовать декомпозицию.
 */

public class Task18 {
	public static void main(String[] args) {
		int n = 4;

		if (n <= 9 && n >= 2) {
			count(n - 1);
		} else {
			System.out.println("Неверное значение");
		}
	}

	public static void count(int n) {
		int i = 1;
		while (i <= 9) {
			int sum = 0;
			int j = n;
			while (j >= 0) {
				int perm = i + n - j;
				sum = sum + (int) Math.pow(10, j) * perm;
				j--;
			}
			int set = sum % 10;
			if (set == 9) {
				i = 9;
			}
			i++;
			System.out.println(sum);
		}
	}
}
