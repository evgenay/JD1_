package local.home.task03.main;

/*Для заданного натурального числа определить, образуют ли его цифры арифметическую
 *прогрессию. Предполагается, что в числе не менее трёх цифр. Например: 1357, 963.
 */

public class Task38 {

	public static void main(String[] args) {

		int a = 1357;
		int n1 = a % 10;
		int n2 = (a - n1) / 10 % 10;
		int h = n1 - n2;
		int x1, x2;
		int y = 0;
		int b = a;
		for (int i = 0; i < a; i++) {

			x1 = a % 10;
			x2 = (a - x1) / 10 % 10;
			a = (a - x1) / 10;

			if (x1 - x2 == h) {
				y = h;

			} else {
				y = 0;
			}
		}

		if (y == h) {
			System.out.println(b + "  арифметическую прогрессию образуют");
		} else {
			System.out.println(b + "  арифметическую прогрессию необразуют");
		}

	}

}
