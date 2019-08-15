package local.home.task02.main;

/*. Подсчитать количество отрицательных 
 * среди чисел а, b, с.
*/
public class Task18 {
	public static void main(String[] args) {
		int a = -8;
		int b = 5;
		int c = 0;

		if (a <= 0) {
			a = 1;
		} else {
			a = 0;
		}
		if (b <= 0) {
			b = 1;
		} else {
			b = 0;
		}
		if (c <= 0) {
			c = 1;
		} else {
			c = 0;
		}
		System.out.println("Количество отрицательных чисел  = " + (a + b + c));
	}
}
