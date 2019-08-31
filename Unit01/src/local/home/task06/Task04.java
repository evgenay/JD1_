package local.home.task06.main;

/*  Сортировка обменами. Дана последовательность чисел a1 < a2 <....< an
* Требуется переставить числа в порядке возрастания. Для этого сравниваются
* два соседних числа a(i) и a(i +1). Если a(i) > a(i+1), то делается
* перестановка. Так продолжается до тех пор, пока все элементы не станут
* расположены в порядке возрастания. Составить алгоритм сортировки, подсчитывая
* при этом количества перестановок.
 */

public class Task04 {
	public static void main(String[] args) {
		int[] mas = MyMethod.inMas(10, 10);
		int y = mas.length - 1;
		MyMethod.inPrint(mas);

		do {
			for (int j = 0; j < y; j++)

				if (mas[j] > mas[j + 1]) {
					int t = mas[j];
					mas[j] = mas[j + 1];
					mas[j + 1] = t;
				}
			y--;
		} while (y > 0);
		MyMethod.outPrint(mas);
	}
}
