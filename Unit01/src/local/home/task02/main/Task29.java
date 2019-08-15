package local.home.task02.main;

/*Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3).
 * Определить, будут ли они расположены на одной прямой. 
 */
public class Task29 {
	public static void main(String[] args) {
		int x1 = 2;
		int x2 = 3;
		int x3 = 4;
		int y1 = 1;
		int y2 = 6;
		int y3 = 9;
		double sc, ab, bc, u;

		if (((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3) == 0)) {
			System.out.println("Точки лежат на 1 прямой");
		} else {
			sc = (x2 - x1) * (y3 - y2) + (x3 - x2) * (y2 - y1);
			ab = Math.sqrt((Math.pow(x1 - x2, 2) + Math.pow(y2 - y1, 2)));
			bc = Math.sqrt((Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2)));
			u = Math.acos(sc / ab / bc) * 180 / Math.PI;
			System.out.println("Угол ABC= " + u);
		}
	}

}
