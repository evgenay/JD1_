package local.home.task01.main;

/*Найти площадь кольца, внутренний радиус которого равен r,
 *  а внешний — R (R> r).
 */

public class Task23 {
	public static void main(String[] args) {
		int R = 5;
		int r2 = 3;
		double s = 1;
		if (R > r2) {

			s = Math.PI * ((R * R) - (r2 * r2));
			System.out.println("Площадь кольца = " + s);
		} else {
			System.out.println("Неправильно задан радиус");
		}

	}

}
