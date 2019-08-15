package local.home.task02.main;

//Вычислить значение функции:

public class Task40 {
	public static void main(String[] args) {
		double x = 14;

		if (x <= 13) {
			x = ((-Math.pow(x, 3) + 9));
			System.out.println("F (x) = " + x);
		} else if (x > 13) {
			x = -3 / (x + 1);
			System.out.println("F (x) = " + x);
		}
	}

}
