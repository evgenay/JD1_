package local.home.task03.main;

//Составить программу нахождения разности кубов первых двухсот чисел

public class Task11 {
	public static void main(String[] args) {
		int i = 1;
		double sub = 0;

		while (i <= 200) {
			sub = sub - Math.pow(i, 3);
			i = i + 1;
		}
		System.out.println("Разность кубов первых двухсот чисел = " + sub + "  ");
	}

}
