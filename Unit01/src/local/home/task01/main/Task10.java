package local.home.task01.main;

/*Вычислить значение выражения по формуле 
 * (все переменные принимают действительные значения):
 */

public class Task10 {
	public static void main(String[] args) {
		double x = 0.5;
		double y = 0.1;

		System.out.println("Значение выражения = "
				+ (Math.asin(x) + Math.acos(y)) / ((Math.acos(x) - (Math.sin(y))) * (Math.tan(x * y))));

	}

}
