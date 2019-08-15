package local.home.task02.main;

/*Составить программу, которая определит по трем введенным сторонам, является ли данный треугольник
 *равносторонним.
  */
public class Task09 {
	public static void main(String[] args) {
		int a = 2;
		int b = 2;
		int c = 2;

		if ((a == b) && (b == c)) {
			System.out.println("Треугольник является равносторонним");
		} else {
			System.out.println("Треугольник не является равносторонним");
		}

	}

}
