package local.home.task03.main;

/*Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат
* представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие
* значения функции:
* F(x) = sin2(x)
 */

public class Task22 {
	public static void main(String[] args) {
		double a = 1;
		double b = 10;
		double h = 2;
		double x;
		x = a;

		System.out.println("_X__|_______F(X)_________");
		do {
			System.out.println(x + " | " + (Math.pow((Math.sin(x)), 2)));
			x = x + h;
		} while (x <= b);

	}

}
