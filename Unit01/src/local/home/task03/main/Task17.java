package local.home.task03.main;

//Даны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1) = (a+2)(a+3)

public class Task17 {
	public static void main(String[] args) {
		double a = 5;
		double p = 1;
		int n = 5;

		for (int i = 0; i < n; i = i + 1) {

			p = (a + i) * p;

		}
		System.out.println("Результат вычисления = " + p);

	}

}
