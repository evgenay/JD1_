package local.home.task02.main;

/*Даны целые числа т, п. Если числа не равны, то заменить каждое из них одним и тем же числом, 
 * равным большему из исходных, а если равны, то заменить числа нулями.
 */
public class Task17 {
	public static void main(String[] args) {
		int m = 4;
		int n = 3;

		if (m > n) {
			n = m;
			System.out.println("Число m = " + m);
			System.out.println("Число n = " + n);
		} else {
			if (n > m) {
				m = n;
				System.out.println("Число m = " + m);
				System.out.println("Число n = " + n);
			} else {
				if (n == m) {
					m = 0;
					n = 0;
					System.out.println("Число m = " + m);
					System.out.println("Число n = " + n);
				}
			}
		}
	}

}
