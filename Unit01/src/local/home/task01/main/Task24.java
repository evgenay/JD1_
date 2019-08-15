package local.home.task01.main;

/*Найти площадь равнобедренной трапеции с основаниями а и b
 *  и углом α при большем основании а.
 */
public class Task24 {
	public static void main(String[] args) {
		int a = 16;
		int b = 14;
		double q = 30;
		double h;
		double s;

		if ((b > 0) && (a > b)) {
			if ((q > 0) && (q < 90)) {
				q = (q * Math.PI) / 180;
				h = ((a - b) * Math.sin(q)) / (2 * Math.cos(q));
				s = (a + b) * h / 2;
				System.out.println("Площадь = " + s);
			} else {
				System.out.println("Угол меньше 0 или больше 90 градусов");

			}
			;
		} else {
			System.out.println("Основание b больше основания a");
		}

	}

}
