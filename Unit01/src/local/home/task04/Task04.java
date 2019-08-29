package local.home.task04.main;

/* Написать метод(методы) для нахождения наименьшего
 * общего кратного трех натуральных чисел.
 */

public class Task04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 20;
		int y = 30;
		int z = 10;
		int nok = 0;
		int nod = 0;

		MyMethod.inNokThree(x, y, z, nod, nok);
		System.out.println("НОК 3 чисел =  " + MyMethod.inNokThree(x, y, z, nod, nok));
	}

}
