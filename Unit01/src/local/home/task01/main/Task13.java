package local.home.task01.main;

/*Заданы координаты трех вершин треугольника (х1 у2),(х2, у2) ),(х3, у3).
 *  Найти его периметр и площадь
 */

public class Task13 {
	public static void main(String[] args) {
		int x1 = 7;
		int x2 = 5;
		int x3 = 6;
		int y1 = 3;
		int y2 = -1;
		int y3 = -5;
		double a;
		double b;
		double c;
		double p;
		double s;

		a = Math.sqrt(Math.pow((x1 - x2), 2) + (Math.pow((y1 - y2), 2)));
		b = Math.sqrt(Math.pow((x3 - x2), 2) + (Math.pow((y3 - y2), 2)));
		c = Math.sqrt(Math.pow((x1 - x3), 2) + (Math.pow(y1 - y3, 2)));
		p = (a + b + c);
		s = Math.sqrt((p / 2 * (p / 2 - a) * (p / 2 - b) * (p / 2 - c)));

		System.out.println("Периметр треугольника = " + p);
		System.out.println("Площадь треугольника = " + s);

	}

}
