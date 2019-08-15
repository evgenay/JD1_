package local.home.task01.main;

/*Даны два числа. Найти среднее арифметическое кубов этих чисел
 * и среднее геометрическое модулей этих чисел. 
 */
public class Task17 {
	public static void main(String[] args) {
		int x = 2;
		int y = 2;
		double a;
		double b;

		a = (Math.pow(x, 3) + Math.pow(y, 3)) / 2;
		b = Math.sqrt((Math.abs(x) * Math.abs(y)));

		System.out.println("Cреднее арифметическое = " + a + "\nCреднее геометрическое модулей = " + b);

	}

}
