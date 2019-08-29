package local.home.task04.main;

/* Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
 *если угол между сторонами длиной X и Y— прямой.
 */

public class Task12 {

	public static void main(String[] args) {
		double x = 5;
		double y = 5;
		double z = 5;
		double t = 5;
		double s = 0;

		System.out.println("Площадь четырехугольника = " + inQuadrangleS(x, y, z, t, s));

	}

	public static double inQuadrangleS(double x, double y, double z, double t, double s) {
		double p = (x + y + z + t) / 2;
		s = Math.sqrt((p - x) * (p - y) * (p - z) * (p - t));
		return s;
	}

}
