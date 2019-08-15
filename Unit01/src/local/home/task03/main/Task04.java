package local.home.task03.main;

/*С помощью оператора while напишите программу вывода
 *  всех четных чисел в диапазоне от 2 до 100 включительно.
 */

public class Task04 {
	public static void main(String[] args) {
		int a = 2;
		int b = 2;
		do {
			System.out.println("Четное число = " + b);
			b = b + a;
		} while (b <= 101);

	}
}
