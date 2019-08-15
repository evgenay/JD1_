package local.home.task02.main;

//Вычислить значение функции:

public class Task39 {
	public static void main(String[] args) {
		double x = 4;

		if (x >= 8) {
			x = ((-Math.pow(x, 2) + x - 9));
			System.out.println("F (x) = " + x);
		} else if (x < 8) {
			x = 1 / (Math.pow(x, 4) - 6);
			System.out.println("F (x) = " + x);
		}
	}

}
