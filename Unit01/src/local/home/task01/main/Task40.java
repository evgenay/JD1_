package local.home.task01.main;

/* Дано значение х. Получить значения -2х + 3х2 - 4х3 и 1 + 2х + 3х2 + 4х3
. Позаботьтесь об экономии операций.
*/
public class Task40 {
	public static void main(String[] args) {
		int x = 2;
		int y1, y2;

		y1 = ((-4 * x + 3) * x - 2) * x;
		y2 = ((4 * x + 3) * x + 2) * x + 1;

		System.out.println("Первое значение = " + y1);
		System.out.println("Второе значение = " + y2);

	}

}
