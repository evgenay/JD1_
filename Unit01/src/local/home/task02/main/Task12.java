package local.home.task02.main;

/* Даны три действительных числа. Возвести в квадрат те из них, 
 * значения которых неотрицательны, и в четвертую степень — отрицательные.
*/
public class Task12 {
	public static void main(String[] args) {
		int a = 5;
		int b = 9;
		int c = -4;

		if (a >= 0) {
			System.out.println("Число " + a + " в квадрат = " + (Math.pow(a, 2)));
		} else {
			System.out.println("Число " + a + " в четвертую степень = " + (Math.pow(a, 4)));
		}

		if (b >= 0) {
			System.out.println("Число " + b + " в квадрат = " + (Math.pow(b, 2)));
		} else {
			System.out.println("Число " + b + " в четвертую степень = " + (Math.pow(b, 4)));
		}

		if (c >= 0) {
			System.out.println("Число " + c + " в квадрат = " + (Math.pow(c, 2)));
		} else {
			System.out.println("Число " + c + " в четвертую степень = " + (Math.pow(c, 4)));
		}
	}
}
