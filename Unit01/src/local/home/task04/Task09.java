package local.home.task04.main;

import local.home.task04.main.MyMethod;

//Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.

public class Task09 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 6;
		int b = 8;
		int c = 9;
		int nod = 0;

		if (MyMethod.inNodThree(a, b, c, nod) == 1) {
			System.out.println("Числа взаимно простые");
		} else {
			System.out.println("Числа не являются взаимно простыми");
		}

	}

}
