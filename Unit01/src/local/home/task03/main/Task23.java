package local.home.task03.main;

/*Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат
* представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие
* значения функции:
* F(x) = ctg(x/3)+1/2*sin(x)
 */

public class Task23 {
	public static void main(String[] args) {
		double a = 1;
		double b = 10;
		double h = 2;
		double x;
		x = a;

		System.out.println("_X__|_____F(X)_________");
		do {
			System.out.println(x + " | " + (1 / Math.tan(x / 3) + 1 / 2 * Math.sin(x)));
			x = x + h;
		} while (x <= b);

	}

}
