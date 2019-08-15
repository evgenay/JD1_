package local.home.task01.main;

/*Вычислить значение выражения по формуле (Задача 8 - Линейные программы)
 *(все переменные принимают действительные значения):
 */

public class Task08 {
	public static void main(String[] arvg) {
		double a = 1;
		double b = 2;
		double c = 1;

		System.out.println("Значение выражения = ");
		System.out.println(
				b + Math.sqrt((Math.pow(b, 2)) + 4 * (a * c)) / (2 * a) - ((Math.pow(a, 3)) * c) + (Math.pow(b, -2)));
	}

}
