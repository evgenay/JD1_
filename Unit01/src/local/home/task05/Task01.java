package local.home.task05.main;

/*В массив A [N] занесены натуральные числа.
 *Найти сумму тех элементов, которые кратны данному К.
 */

public class Task01 {
	public static void main(String[] args) {
		int[] mass = { 1, 2, 3, 4, 5, 6, 7 };
		int s = 0;
		int k = 2;

		for (int i = 0; i < 6; i = i + 1) {
			if (mass[i] % k == 0) {
				s = s + mass[i];
				System.out.println(s);
			}
		}

	}

}
