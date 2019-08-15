package local.home.task02.main;

/*Написать программу нахождения суммы большего и
 *  меньшего из трех чисел.
 */
public class Task26 {
	public static void main(String[] args) {
		int a = 8;
		int b = 7;
		int c = 3;
		int min = 0;
		int max = 0;
		int sum;

		if ((a <= b) && (a <= c)) {
			min = a;
		}

		if ((b <= a) && (b <= c)) {
			min = b;
		}

		if ((c <= a) && (c <= b)) {
			min = c;
		}

		if ((a >= b) && (a >= c)) {
			max = a;
		}

		if ((b >= a) && (b >= c)) {
			max = b;
		}

		if ((c >= a) && (c >= b)) {
			max = c;
		}
		sum = (min + max);

		System.out.println("Сумма a,b,c = " + sum);

	}

}
