package local.home.task04.main;

import local.home.task04.main.MyMethod;

/* Написать метод(методы) для нахождения наибольшего общего делителя и
 *  наименьшего общего кратного двух натуральных чисел:
 */

public class Task02 {
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		int a = 860;
		int b = 240;
		int nok = 0;
		int nod = 0;
		MyMethod.inNod(a, b, nod);
		MyMethod.inNok(a, b, nod, nok);
		System.out.println("НОД =  " + MyMethod.inNod(a, b, nod));
		System.out.println("НОК =" + MyMethod.inNok(a, b, nod, nok));

	}
}