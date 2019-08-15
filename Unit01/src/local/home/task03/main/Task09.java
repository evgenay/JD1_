package local.home.task03.main;

//Найти сумму квадратов первых ста чисел.

public class Task09 {
	public static void main(String[] args) {
		int j = 100;
		int i = 0;
		int sum = 1;

		for (i = 1; i <= j; i++) {
			sum = (int) Math.pow(i, 2);
		}
		System.out.println("Сумма квадратов первых ста чисел = " + sum + "  ");
	}
}
