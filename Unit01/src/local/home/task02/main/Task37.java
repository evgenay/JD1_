package local.home.task02.main;

//Вычислить значение функции:
public class Task37 {
	public static void main(String[] args) {
		double x = 3;

		if (x >= 3) {
			x = ((-Math.pow(x, 2) + (3 * x) + 9));
			System.out.println("F (x) = " + x);
		} else if (x < 3) {
			x = 1 / (Math.pow(x, 3) - 6);
			System.out.println("F (x) = " + x);
		}

	}
}
