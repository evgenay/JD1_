package local.home.task01.main;

/*Дано значение a. Не используя никаких функций и никаких операций, кроме умножения, получить значение а
* 8-ой степени   за три операции и а 10 -ой степени за четыре операции.
 */
public class Task27 {
	public static void main(String[] args) {
		int a = 2;

		System.out.println("Значение а 8 - ой степени " + (a * a * a) * (a * a * a) * (a * a));
		System.out.println("Значение а 10 - ой степени " + (a * a * a) * (a * a * a) * (a * a * a) * a);

	}

}
