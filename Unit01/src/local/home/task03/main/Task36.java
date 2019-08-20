package local.home.task03.main;

/*Два двузначных числа, записанных одно за другим , образуют четырёхзначное число, которое
 *делится на их произведение. Найти эти числа.
 */

public class Task36 {
	public static void main(String[] args) {
		int a, b;

		for (int i = 10; i < 100; i = i + 1) {
			for (int j = 10; j < 100; j = j + 1) {
				a = i * j;
				b = i * 100 + j;
				if (b % a == 0) {
					System.out.println("Первое число = " + i + " Второе число =  " + j);
				}
			}
		}
	}

}
