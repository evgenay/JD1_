package local.home.task03.main;

//Вычислить значения функции на отрезке [а,b] c шагом h:

public class Task08 {
	public static void main(String[] args) {
		int a = 6;
		int b = 12;
		int c = 1;
		int d = 15;
		int h = 2;

		for (int x = a; x <= b; x = x + h)
			if (x != d)
				System.out.println("y" + x + " = " + ((x - c) + 6));
			else
				System.out.println("y" + x + " = " + ((x + c) * 2));

	}

}
