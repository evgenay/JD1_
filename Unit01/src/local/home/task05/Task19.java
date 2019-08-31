package local.home.task05.main;

/*В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. 
 * Если таких чисел несколько, то определить наименьшее из них.
 */

public class Task19 {

	public static void main(String[] args) {
		int[] mas = MyMethod.inMas(10, 10);

		int maxReturn = 0;
		int maxNum = 0;
		int count = 0;
		int flag = 1;

		MyMethod.inPrint(mas);

		for (int i = 0; i < mas.length; i++) {
			count = 0;
			for (int j = 0; j < mas.length; j++) {
				if (mas[i] == mas[j]) {
					count++;
				}
			}
			if (maxReturn < count) {
				maxReturn = count;
				maxNum = mas[i];
			} else if (maxReturn == count) {
				if (maxReturn == 1) {
					flag = 0;
				}
				if (maxNum > mas[i]) {
					maxNum = mas[i];
				}
			}
		}
		if (flag != 0) {
			printLn(maxNum, maxReturn);
		} else {
			System.out.println("\nВстречающихся чисел - нет ");
		}
	}

	public static void printLn(int maxNum, int maxRet) {
		System.out.print("\nНаиболее часто встречающееся число: " + maxNum);
		System.out.println("\nВстречающееся " + maxRet + " раз(а)");
	}

}
