package local.home.task02.main;

import java.util.Scanner;

/*Составить программу, реализующую эпизод применения компьютера в книжном магазине. Компьютер
запрашивает стоимость книг, сумму денег, внесенную покупателем; если сдачи не требуется, печатает на экране
«спасибо»; если денег внесено больше, чем необходимо, то печатает «возьмите сдачу» и указывает сумму сдачи; если
денег недостаточно, то печатает сообщение об этом и указывает размер недостающей суммы.
*/
public class Task34 {
	public static void main(String[] args) {
		int x;
		int y;
		int a;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Стоимость книги > ");

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("Неверное значение, повторите ещё раз ");
		}
		x = sc.nextInt();

		System.out.print("Сумма денег > ");

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("Неверное значение, повторите ещё раз ");
		}
		y = sc.nextInt();

		if (y == x) {
			System.out.println("Спасибо ");
		} else if (y > x) {
			a = y - x;
			System.out.println("Возьмите сдачу " + a);
		} else if (y < x) {
			a = x - y;
			System.out.println("Денег недостаточно " + a);
		}

	}

}
