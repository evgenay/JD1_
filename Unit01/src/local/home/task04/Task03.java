package local.home.task04.main;

import local.home.task04.main.MyMethod;;

/* Написать метод(методы) для нахождения наибольшего
 * общего делителя четырех натуральных чисел.
 */

public class Task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 40;
		int y = 30;
		int z = 20;
		int t = 80;
		int nod = 0;
		MyMethod.inNodFour(x, y, z, t, nod);
		System.out.println("НОД =  " + MyMethod.inNodFour(x, y, z, t, nod));
	}

}
