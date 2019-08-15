package local.home.task02.main;

/* Даны действительные числа х и у, не равные друг другу. 
 * Меньшее из этих двух чисел заменить половиной их суммы, а большее — их удвоенным произведением.
 */
public class Task15 {
	public static void main(String[] args) {
		double x = 16;
		double y = 2;
		double t;

		if (x > y) {
			t = y;
			y = (x + y) / 2;
			x = x * t * 2;

		} else {
			t = x;
			x = (x + y) / 2;
			y = x * t * 2;
		}
		System.out.println("X = " + x);
		System.out.println("Y = " + y);
	}

}
