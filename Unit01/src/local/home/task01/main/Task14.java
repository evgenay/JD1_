package local.home.task01.main;

/*Вычислить длину окружности и площадь круга
 *одного и того же заданного радиуса R
 */

public class Task14 {
	public static void main(String[] agrs) {
		double r = 8;
		double l;
		double s;
		double pi = (Math.PI);

		s = pi * r * r;
		l = 2 * pi * r;

		System.out.println("Площадь равна = " + s + "\nДлина равна = " + l);

	}

}
