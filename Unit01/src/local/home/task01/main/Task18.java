package local.home.task01.main;

/*Дана длина ребра куба. Найти площадь грани,
 * площадь полной поверхности и объем этого куба.
 */
public class Task18 {
	public static void main(String[] agrs) {
		int a = 5;
		int b;
		int c;
		int d;

		b = a * a;
		c = 6 * b;
		d = a * a * a;

		System.out.println("Площадь грани = " + b + "\nПлощадь полной поверхности = " + c + "\nОбъем = " + d);

	}

}
