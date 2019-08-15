package local.home.task01.main;

/* Текущее показание электронных часов: т ч (0 ≤ т ≤23) п мин (0 ≤ п ≤59) к с (0 ≤к ≤59). 
 * Какое время будут показывать часы через р ч q мин r с?
 */

public class Task32 {
	public static void main(String[] args) {
		double m = 23;
		double n = 3;
		double k = 3;
		double p = 2;
		double q = 1;
		double r = 1;
		double x, y, z, h, b, d, e;

		x = m * 3600 + n * 60 + k;
		y = p * 3600 + q * 60 + r;
		z = x + y;
		h = (int) z / 3600;
		b = z % 3600;
		d = (int) b / 60;
		e = (int) b % 60;
		while (h > 24) {
			h = h - 24;
		}

		System.out.println("Часы " + h + " минуты " + d + " секунды " + e);

	}

}
