package local.home.task03.main;

//Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n.

public class Task14 {
	public static void main(String[] args) {
		double n = 10;
		double s = 0;
		double a = 0;
		
		for (int i = 0; i < n; i = i + 1) {
			a = a + 1;
			s = 1 / a + s;
		}
		System.out.println("Последовательность = " + s);

	}

}
