package local.home.task02.main;

/*Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. 
 * Определить, пройдет ли кирпич через отверстие.
 */
public class Task31 {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int x = 3;
		int y = 4;
		int z = 5;

		if ((x < a) && (y < b) || (x < b) && (y < a)) {
			System.out.println("True   ");
		} else {
			if ((x < a) && (z < b) || (x < b) && (z < a)) {
				System.out.println("True  ");
			} else {
				if ((y < a) && (z < b) || (y < b) && (z < a)) {
					System.out.println("True  ");
				} else {
					System.out.println("False   ");
				}
			}
		}

	}
}
