package local.home.task05.main;

/*Дан массив действительных чисел, размерность которого N. 
 * Подсчитать, сколько в нем отрицательных,положительных и нулевых элементов.
 */

public class Task08 {

	public static void main(String[] args) {
		int[] mas = new int[] { 5, -2, 0, 0, 6, 7, 4, -5 };
		int plus = 0;
		int minus = 0;
		int nul = 0;

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > 0) {
				plus++;
			}
			if (mas[i] < 0) {
				minus++;
			}
			if (mas[i] == 0) {
				nul++;
			}

		}
		System.out.println("Количество положительных чисел-(" + plus + ") Количество отрицательных чисел-(" + minus
				+ ") Количество 0-(" + nul + ")");
	}
}
