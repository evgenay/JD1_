package local.home.task04.main;

/* Два простых числа называются «близнецами», если они отличаются друг от
 * друга на 2 (например, 41 и 43).Найти и напечатать все пары «близнецов» из отрезка [n,2n],
 * где n - заданное натуральное число больше 2.Для решения задачи использовать декомпозицию.
 * 
 */

public class Task16 {
	public static void main(String[] args) {
		int n = 10;
		int a = 1;
		int z = 1;
		int i = n;

		do {
			if (MyMethod.testDig(i)) {
				a = i;
			}
			if (a - z == 2) {
				printLn(a, z);
			}
			z = a;
			i++;
		} while (i <= 2 * n);
	}

	public static void printLn(int a, int z) {
		System.out.println("Числа близнецы = " + z + " - " + a);
	}

}
