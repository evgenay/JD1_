package local.home.task01.main;

/* Дана величина А, выражающая объем информации в байтах. 
 * Перевести А в более крупные единицы измерения информации.
 */

public class Task34 {
	public static void main(String[] args) {
		int a = 1073741824;

		System.out.println("Объём в Килобайтах " + a);
		a = (a / 1024);
		System.out.println("Объём в Мегабайтах " + a);
		a = (a / 1024);
		System.out.println("Объём в Гигабайтах " + a);
		a = (a / 1024);
		System.out.println("Объём в Терабайтах " + a);

	}

}
