package local.home.task04.main;

/*Дано натуральное число N. Написать метод(методы) для формирования массива,
 *  элементами которого являются цифры числа N.
 */

public class Task13 {
	public static void main(String[] args) {
		int n = 987321245;
		int[] mass = inMass(n);
		System.out.println(" Значение n - " + n);
		outMass(mass);
	}

	public static void outMass(int[] mass) {
		for (int i = mass.length - 1; i >= 0; i--) {

			System.out.println(" Значение -  " + mass[i]);
		}
	}

	public static int[] inMass(int n) {
		int m = 0;
		int i = n;
		int[] mass;

		for (int j = n; j >= 1; j = j / 10) {
			m++;
		}
		mass = new int[m];

		for (int j = 0; j < m; j++) {
			mass[j] = (i % 10);
			i = (i / 10);
		}
		return mass;
	}
}
