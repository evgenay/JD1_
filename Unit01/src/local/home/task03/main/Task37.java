package local.home.task03.main;

/* Даны два двузначных числа А и В. �?з этих чисел составили 2 четырехзначных числа: первое число
* получили путем написания сначала числа А, затем В. Для получения второго числа сначала записали
* число В, затем А. Найти числа А и В если известно , что первое четырехзначное число нацело делится
* на 99, а второе на 49.
*/

public class Task37 {
	public static void main(String[] args) {
		for (int a = 10; a < 100; a = a + 1) {
			for (int b = 10; b < 100; b = b + 1) {
				int x = a * 100;
				int y = b * 100;
				x = x + b;
				y = y + a;

				if ((x % 99) == 0 && ((y % 49) == 0)) {
					System.out.println("Первое число = " + a);
					System.out.println("Второе число = " + b);
				}
			}
		}
	}

}
