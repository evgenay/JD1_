package local.home.task03.main;

//Вычислить : 1+2+4+8+...+ 2 в 10 степени

public class Task15 {
	public static void main(String[] args) {
		int s = 1;
		int a = 1;

		for (int i = 0; i < 10; i = i + 1) {
			a = a * 2;
			s = s + a;

		}
		System.out.println("1+2+4+8+...+ 2 в 10 в степени = " + s);
	}

}
