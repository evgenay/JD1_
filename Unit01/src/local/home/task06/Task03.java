package local.home.task06.main;

/* Сортировка выбором. Дана последовательность чисел .Требуется переставить  элементы 
 * так, чтобы они были расположены по убыванию. Для этого в массиве, начиная с
 * первого, выбирается наибольший элемент и ставится на первое место, а первый  
 * - на место наибольшего. Затем, начиная со второго, эта процедура повторяется.
 * Написать алгоритм сортировки выбором.
 */

public class Task03 {

	public static void main(String[] args) {
		int[] mas = MyMethod.inMas(10, 10);

		MyMethod.inPrint(mas);

		for (int i = 0; i < mas.length - 1; i++) {
			int max = mas[i];
			int iMax = i;
			for (int j = i; j < mas.length; j++) {
				if (mas[j] > max) {
					max = mas[j];
					iMax = j;
				}
			}
			int t = mas[iMax];
			mas[iMax] = mas[i];
			mas[i] = t;
		}
		MyMethod.outPrint(mas);
	}

}