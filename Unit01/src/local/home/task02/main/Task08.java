package local.home.task02.main;

/* Составить программу нахождения наименьшего из квадратов 
 * двух чисел а и b.
 */
public class Task08 {
	public static void main(String[] args) {
		int a = 4;
		int b = 2;

		if (Math.pow(a, 2) < (Math.pow(b, 2)))
			System.out.println("Наименьшее число a = " + a);
		else
			System.out.println("Наименьшее число b = " + b);

	}
}
