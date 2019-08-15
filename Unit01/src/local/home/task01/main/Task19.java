package local.home.task01.main;

/*Дана сторона равностороннего треугольника. 
 * Найти площадь этого треугольника, его высоту, радиусы вписанной
 * и описанной окружностей.
 */

public class Task19 {
	public static void main(String[] agrs) {
		double a = 4;
		double s;
		double h;
		double r1;
		double R;

		s = (a * a) * Math.sqrt(3) / 4;
		h = a * Math.sqrt(3) / 2;
		r1 = a * Math.sqrt(3) / 6;
		R = a * Math.sqrt(3) / 3;

		System.out.println("Площадь треугольника= " + s + "\nВысота треугольника= " + h + "\nРадиус вписанной окружности= "
				+ r1 + "\nРадиус описанной окружности= " + R);

	}

}
