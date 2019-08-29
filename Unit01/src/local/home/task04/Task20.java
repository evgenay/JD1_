package local.home.task04.main;

/* Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. 
 * Сколько таких действий надо произвести, чтобы получился нуль?
 * Для решения задачи использовать декомпозицию.
 */
public class Task20 {

	public static void main(String[] args) {
		int n = 1234;
		outOper(n);
		System.out.println("Для  числа - " + n + " Необходимо - " + outOper(n) + " - операции");
	}

	public static int outSum(int n) {
		int sum = 0;
		for (int i = n; n > 0; i = i / 10) {
			i = n % 10;
			n = n / 10;
			sum = sum + i;
		}
		return sum;
	}

	public static int outOper(int n) {
		int m = 0;
		for (m = 0; n != 0; m++) {
			n = n - outSum(n);
		}
		return m;
	}
}
