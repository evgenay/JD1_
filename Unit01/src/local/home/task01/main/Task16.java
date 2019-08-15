package local.home.task01.main;

/*Найти произведение цифр заданного
 *четырехзначного числа.
 */
public class Task16 {
	public static void main(String[] agrs) {
		int m = 1;
		int n = 2437;

		for (int i = 0; i < 4; i++) {
			m = m * (n % 10);
			n = n / 10;
		}
		System.out.println("Произведение = " + m);

	}

}
