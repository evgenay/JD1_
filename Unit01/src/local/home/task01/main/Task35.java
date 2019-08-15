package local.home.task01.main;

/* Даны натуральные числа М и N. 
 * Вывести старшую цифру дробной части и младшую цифру целой части числа M/N.
 */
public class Task35 {
	public static void main(String args[]) {
		double m = 58;
		double n = 75;

		int a = (int) (((m / n) * 10) % 10);
		System.out.println("Cтаршая цифра дробной части = " + a);
		int b = (int) (((m / n) * 1) % 10);
		System.out.println("Младшая цифра целой части = " + b);

	}

}
