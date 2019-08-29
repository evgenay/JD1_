package local.home.task04.main;

// Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.

public class Task14 {

	public static void main(String[] args) {
		int a = 1234;
		int b = 1235;

		if (inDig(a) > inDig(b)) {
			System.out.println("В первом числе больше цифр = " + inDig(a));
		} else if (inDig(a) < inDig(b)) {
			System.out.println("Bо втором числе больше цифр =  " + inDig(b));
		} else if (inDig(a) == inDig(b)) {
			System.out.println("В двух числах, количество цифр равно  " + inDig(a));
		}
	}

	public static int inDig(int n) {
		int m = 0;
		for (int j = n; j > 0; j = j / 10)
			m++;
		return m;
	}
}
