package local.home.task03.main;

import java.util.Scanner;

/* Проверить введенную пользователем строку на наличие недопустимых символов. В качестве
 * первого символа допустимы только буквы и знак подчеркивания. Остальные символы могут быть
 * буквами, цифрами и знаком подчеркивания
 */

public class Task32 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Напишите строку > ");
		char sim = sc.next().charAt(0);

		int b = (char) sim;
		if ((b > 65 && b < 90 || b > 97 && b > 122 || b == 95)) {
			System.out.println("Проверка выполнена успешно");
		} else {
			System.out.println("Данный первый символ = " + sim + "   недопустим");
		}
	}
}
