package local.home.task02.main;

/* Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник,
 *  и если да, то будет ли он прямоугольным.
 */
public class Task14 {
	public static void main(String[] args) {
		int a1 = 45;
		int a2 = 45;

		if ((a1 + a2) < 180 && (a1 > 0) && (a2 > 0)) {
			System.out.println("Треугольник с указанными углами существует");
		} else {
			System.out.println("Треугольник с указанными углами не существует");
		}
		if ((a1 + a2 == 90) && (a1 > 0) && (a2 > 0)) {
			System.out.println("Этот треугольник будет прямоугольным");

		}
	}

}
