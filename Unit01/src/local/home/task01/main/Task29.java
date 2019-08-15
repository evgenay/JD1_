package local.home.task01.main;

/*
 *  Найти (в радианах в градусах) все углы треугольника со сторонами а, b, с.
 */
public class Task29 {
	public static void main(String[] args) {

		double a = 10;
		double b = 6;
		double c = 8;
		double a1, b1, c1;

		a1 = (Math.acos((b * b + c * c - a * a) / (2 * b * c)));
		b1 = (Math.acos((-b * b + c * c + a * a) / (2 * a * c)));
		c1 = (Math.acos((b * b - c * c + a * a) / (2 * b * a)));

		System.out.println("Угол а в радианах = " + a1);
		System.out.println("Угол b в радианах = " + b1);
		System.out.println("Угол c в радианах = " + c1);

		a1 = (a1 * (180 / Math.PI));
		b1 = (b1 * (180 / Math.PI));
		c1 = (c1 * (180 / Math.PI));

		System.out.println("Угол а в градусах = " + a1);
		System.out.println("Угол b в градусах = " + b1);
		System.out.println("Угол c в градусах = " + c1);
	}

}
