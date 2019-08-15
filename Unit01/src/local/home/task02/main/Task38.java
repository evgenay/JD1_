package local.home.task02.main;

//Вычислить значение функции:

public class Task38 {
	public static void main(String[] args) {
		double x = -5;

		if ((0 <= x) && (x <= 3)) {
			x = (Math.pow(x, 2));
			System.out.println("F (x) = " + x);
		} else if ((x > 3) || (x < 0)) {
			x = 4;
			System.out.println("F (x) = " + x);
		}
	}
}
