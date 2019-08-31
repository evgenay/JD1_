package local.home.task05.main;

/*Даны действительные числа а1 ,а2 ,..., аn . 
 *Поменять местами наибольший и наименьший элементы.
 */

public class Task09 {
	public static void main(String[] args) {
		int[] mas = MyMethod.inMas(10, 10);
		int max = mas[0];
		int min = mas[0];

		MyMethod.inPrint(mas);

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > max) {
				max = mas[i];
			}
			if (mas[i] < min) {
				min = mas[i];
			}
		}
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == min) {
				mas[i] = max;
			} else if (mas[i] == max) {
				mas[i] = min;
			}
		}
		System.out.print("\n" + "------Замена------\n");
		for (int i = 0; i < mas.length; i++) {

			System.out.print(mas[i] + ",");
		}
	}

}
