package local.home.task02.main;

// Определить, делителем каких чисел а, b, с является число k.

public class Task20 {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		int k = 2;

		if ((a % k == 0)) {
			System.out.println("Является делителем числа a " + a);
		} else {
			System.out.println("Не является делителем числа a " + a);
		}
		if ((b % k == 0)) {
			System.out.println("Является делителем числа b " + b);
		} else {
			System.out.println("Не является делителем числа b " + b);
		}
		if ((c % k == 0)) {
			System.out.println("Является делителем числа c " + c);
		} else {
			System.out.println("Не является делителем числа c " + c);
		}
	}

}
