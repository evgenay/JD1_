package local.home.task01.main;

/* Составить программу перевода радианной меры угла 
 * в градусы, минуты и секунды.
 */
public class Task28 {
	public static void main(String[] args) {
		double Rd = 30;
		double Gr;
		double M;
		double S;

		Gr = Rd * (180 / Math.PI);
		M = ((Gr % 1) * 60);
		S = ((Gr % 1) * 60) % 1;

		System.out.println("Градусы = " + Gr);
		System.out.println("Минуты = " + M);
		System.out.println("Секунды = " + S);

	}

}
