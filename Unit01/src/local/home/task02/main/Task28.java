package local.home.task02.main;

/*Даны три числа a, b, с. Определить, какое из них равно d.
 *  Если ни одно не равно d, то найти max(d — a, d — b, d —c).
 */

public class Task28 {
	public static void main(String[] args) {
		int a = 2;
		int b = 5;
		int c = 5;
		int d = 6;
		int max = 0;

		if (a == d) {
			System.out.println("A = " + a);
		}
		if (b == d) {
			System.out.println("B = " + b);
		}
		if (c == d) {
			System.out.println("C = " + c);
		} else {
			max = a;
			if ((d != a) && (d != b) && (d != c)) {

				if ((b > a) && (b > c) && (b > d)) {
					max = b;
				}

				if ((c > a) && (c > b) && (c > d)) {
					max = c;
				}

				if ((d > a) && (d > b) && (d > c)) {
					max = d;
				}
				System.out.println("Max = " + max);
			}

		}
	}
}
