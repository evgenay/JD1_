package local.home.task02.main;

/* Перераспределить значения переменных х и у так, чтобы в х оказалось
 *  большее из этих значений, а в y - меньшее.
 */
public class Task22 {
	public static void main(String[] args) {
		int x = 7;
		int y = 8;

		if (x > y) {
			x = x + y;
			y = x - y;
			x = x - y;
		}
		System.out.println("x = " + x + " y = " + y);
	}

}
