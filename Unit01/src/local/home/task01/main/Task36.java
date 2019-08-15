package local.home.task01.main;

/*Найти частное произведений четных и нечетных 
 * цифр четырехзначного числа
 */
public class Task36 {
	public static void main(String[] args) {
		int a = 1234;
		int b = 1;
		int c = 1;
		int d;
		while (a > 0) {
			d = a % 10;
			if (d != 0) {
				if (d % 2 != 0) {
					c = d * c;
				} else {
					b = d * b;
				}
			}
			a /= 10;
		}
		System.out.println(b == 1 ? Double.NaN : b * 1.0 / c);
	}
}