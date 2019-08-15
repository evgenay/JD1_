package local.home.task03.main;

import java.util.Scanner;

/* Написать программу, в которой вводятся два операнда Х и Y и знак операции (+, –, /, *). Вычислить
* результат Z в зависимости от знака. Предусмотреть реакции на возможный неверный знак операции, а
* также на ввод Y=0 при делении. Организовать возможность многократных вычислений без
* перезагрузки программа (т.е. построить цикл). В качестве символа прекращения вычислений принять
* �?0’.
*/

public class Task28 {
	public static void main(String[] args) {

		int x = 3;
		int y = 2;
		int z = 0;
		int e = 1;

		do {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.print("\nВыбирите операцию > ");
			char ch = sc.next().charAt(0);

			switch (ch) {
			case '+':
				z = x + y;
				System.out.print("Результат сложения > " + z);
				break;
			case '*':
				z = x * y;
				System.out.print("Результат умножения > " + z);
				break;
			case '-':
				z = x - y;
				System.out.print("Результат вычитания > " + z);
				break;
			case '/':
				if (y == 0)
					System.out.println("Не верное значение Y");
				else
					z = x / y;
				System.out.print("Результат деления > " + z);
				break;
			case '0':
				// default:
				System.out.print("Выход");
				e = 0;
			}
		} while (e != 0);
	}
}
