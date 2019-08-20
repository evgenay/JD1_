package local.home.task03.main;

/*В трехзначном числе зачеркнули старшую цифру. Когда полученное число умножили на 7, то
 *получили исходное число. Найти это число.
 */

public class Task39 {
	public static void main(String[] args) {

		int a, b;
		int c = 7;
		int d = 0;

		for (a = 100; a < 1000; a = a + 1) {
			b = (a / 100) * 100;
			d = a - b;
			if (d * c == a) {
				System.out.println("Число = " + a);
			}
		}

	}
}
