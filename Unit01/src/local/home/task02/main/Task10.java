package local.home.task02.main;

/* Составить программу, 
 * которая определит площадь какого круга меньше.
 */
public class Task10 {
	public static void main(String[] args) {

		double r1 = 2;
		double r2 = 4;
		double s1, s2;

		s1 = Math.PI * (Math.pow(r1, 2));
		s2 = Math.PI * (Math.pow(r2, 2));

		if (s1 < s2) {
			System.out.println("Наименьшая площадь круга s1 = " + s1);
		} else {
			System.out.println("Наименьшая площадь круга s2 = " + s2);
		}

	}

}
