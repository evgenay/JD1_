package local.home.task01.main;

/*Вычислить расстояние между двумя точками
 *с данными координатами (х1, у1)и (x2, у2) 
 */

public class Task12 {
	public static void main(String[] agrs) {
		double x1 = 10;
		double x2 = 20;
		double y1 = 1;
		double y2 = 5;
		double s;

		s = Math.sqrt((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));

		System.out.println("Расстояние между двумя точками = " + s);

	}

}
