package local.home.task01.main;

/* Известна длина окружности. Найти площадь круга,
 * ограниченного этой окружностью
 */
public class Task20 {
	public static void main(String[] args) {
		double l = 4;
		double r;
		double s;

		r = l / (2 * (Math.PI));
		s = (Math.PI) * r * r;

		System.out.println("Площадь круга = " + s);

	}

}
