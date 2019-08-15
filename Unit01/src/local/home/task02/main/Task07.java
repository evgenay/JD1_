package local.home.task02.main;

/*Составить программу нахождения модуля выражения a*x*x + b*x + c
 * при заданных значениях a, b, c и х
 */
public class Task07 {
	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		int c = 2;
		int x = 9;
		int z;

		z = Math.abs(a * x * x + b * x + c);

		System.out.println("Модуль выражения = " + z);

	}

}
