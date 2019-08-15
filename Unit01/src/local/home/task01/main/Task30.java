package local.home.task01.main;

/*Три сопротивления R1 R2, и R3 соединены параллельно.
 * Найдите сопротивление соединения.
 */
public class Task30 {
	public static void main(String[] args) {
		double R1 = 15;
		double R2 = 8;
		double R3 = 17;

		double r = 1 / ((1 / R1) + (1 / R2) + (1 / R3));

		System.out.println("Сопротивление соеденения = " + r);

	}

}
