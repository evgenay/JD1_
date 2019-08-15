package local.home.task02.main;

/*Составить программу, которая определит 
 * площадь какого треугольника больше.
 */
public class Task11 {
	public static void main(String[] args) {
		int a1 = 5;
		int a2 = 12;
		int h1 = 7;
		int h2 = 14;
		double s1, s2;

		s1 = (0.5) * a1 * h1;
		s2 = (0.5) * a2 * h2;

		if (s1 > s2) {
			System.out.println("Площадь  треугольника больше s1= " + s1);
		} else {
			System.out.println("Площадь  треугольника больше s2= " + s2);
		}

	}

}
