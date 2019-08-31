package local.home.task05.main;

/*Дана последовательность действительных чисел а1 ,а2 ,..., ап. 
 * Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.
 */

public class Task07 {
	public static void main(String[] args) {
		int[] mas = MyMethod.inMas(10, 10);
		int z = 5;
		int t = 0;

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > z) {
				mas[i] = z;
				t++;
			}

		}
		System.out.println("Количество замен = " + t);

	}

}
