package local.home.task02.main;

/*Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий,
 *  которая из точек находится ближе к началу координат
 */

public class Task13 {
	public static void main(String[] args) {
		int x1 = 15;
		int y1 = 15;
		int x2 = 6;
		int y2 = 6;

		double l1, l2;

		l1 = Math.sqrt((x1 * x1) + (y1 * y1));
		l2 = Math.sqrt((x2 * x2) + (y2 * y2));

		if (l1 < l2) {
			System.out.println("Точка А ближе = " + l1);
		} else {
			System.out.println("Точка B ближе = " + l2);
		}
	}

}
