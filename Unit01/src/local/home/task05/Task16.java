package local.home.task05.main;

/* Даны действительные числа a a an , , , 1 2 
 * . Найти max( , , , ) a1 + a2n a2 + a2n−1  an + an+1.
 */

public class Task16 {
	public static void main(String[] args) {

		int[] mas = MyMethod.inMas(10, 20);

		MyMethod.inPrint(mas);

		int j = 0;
		int[] nmas = new int[mas.length - 1];
		for (int i = 0; i < (mas.length - 1); i++) {
			nmas[j] = mas[i] + mas[i + 1];
			j++;
		}
		System.out.print("\nИзмененый массив: \n");
		for (int i = 0; i < nmas.length; i++) {
			System.out.print(nmas[i] + ",");
		}
		int max = mas[0];
		for (int i = 0; i < nmas.length; i++) {
			if (nmas[i] > max) {
				max = nmas[i];
			}
		}
		System.out.print("\nМаксимальный элемент новой последовательности = " + max);
	}

}
