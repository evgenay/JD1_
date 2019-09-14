package local.home.task07.main;

/*. Сформировать матрицу из чисел от 0 до 999, вывести ее на экран.
 *  Посчитать количество двузначных чисел в ней. 
 */

public class Task31 {
	public static void main(String[] args) {

		int[][] mas = new int[10][100];
		int digit = 0;
		int count = 0;
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(digit + " ");
				if (digit >= 10 && digit <= 99) {
					count++;
				}
				digit++;
			}
			System.out.println();
		}
		System.out.println("\nКоличество двузначных чисел = " + count);
	}

}
