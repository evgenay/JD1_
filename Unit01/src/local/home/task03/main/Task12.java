package local.home.task03.main;

/*
 * Последовательность аn строится так: а1 = 1, an =6+ аn-1 , для каждого n >1 Составьте программу
*  нахождения произведения первых 10 членов этой последовательности.
*/

public class Task12 {
	public static void main(String[] args) {
		int a = 2;
		int n = 1;
		int pos = 1;

		while (n <= 10) {
			a = 6 + (a - n);
			pos = pos * a;
			n = n + 1;
		}

		System.out.println("Последовательность = " + pos);

	}
}
