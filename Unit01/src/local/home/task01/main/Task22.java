package local.home.task01.main;

/* Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
 * Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc
 */
public class Task22 {
	public static void main(String[] args) {
		int t = 9600;
		double h;
		double m;
		double s;

		h = t / 3600 % 100;
		int h1 = (int) h;
		m = (t % 1000) * 36 / 60;
		int m1 = (int) m;
		s = (t % 1000) * 36;
		int s1 = (int) s;

		// m= t/60;

		System.out.println(
				"Длительность в часах " + h1 + "\nДлительность в минутах " + m1 + "\nДлительность в секундах " + s1);

	}

}
