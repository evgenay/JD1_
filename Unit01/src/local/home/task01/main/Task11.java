package local.home.task01.main;

/*Вычислить периметр и площадь прямоугольного 
 *треугольника по длинам а и b двух катетов
 */

public class Task11 {

	public static void main(String[] args) {
		double a = 3;
		double b = 2;
		double c;
		double p;
		double s;

		c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		p = a + b + c;
		s = (a * b) / 2;

		System.out.println("Длина гипотенузы треугольника = " + c);
		System.out.println("Периметр треугольника = " + p);
		System.out.println("Площадь треугольника = " + s);

	}

}
