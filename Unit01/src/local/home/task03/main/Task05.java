package local.home.task03.main;

/*С помощью оператора while напишите программу определения суммы
 *  всех нечетных чисел в диапазоне от 1 до 99 включительно
 */

public class Task05 {
	public static void main(String[] agrs) {
		int i = 1;
		int sum = 0;

		do {
			System.out.println("Сумма = " + sum);
			sum = sum + i;
			i = i + 2;
		} while (i <= 99);
	}

}
