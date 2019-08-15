package local.home.task01.main;

/* Составить программу для вычисления пути, пройденного лодкой, если ее скорость в стоячей воде v км/ч,
 *  скорость течения реки v1 км/ч, время движения по озеру t1 ч, а против течения реки — t2 ч.
 */
public class Task31 {
	public static void main(String[] args) {
		int v = 20;
		int v1 = 10;
		int t1 = 2;
		int t2 = 1;
		double s1;

		s1 = t1 * v + t2 * (v - v1);

		System.out.println("Пройденый путь = " + s1);

	}

}
