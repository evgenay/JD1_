package local.home.task01.main;

/* Найти площадь треугольника, две стороны которого равны
 * а и b, а угол между этими сторонами у
 */
public class Task26 {
	public static void main(String[] args) {
		double a = 8;
		double b = 6;
		double s;
		double y = 15;

		s = 0.5 * a * b * Math.asin(Math.PI * y / 180);
		System.out.println("Площадь равна = " + s);
	}

}
