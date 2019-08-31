package local.home.task05.main;

/*Дана последовательность натуральных чисел а1 , а2 ,..., ап. 
 * Создать массив из четных чисел этой последовательности.
 * Если таких чисел нет, то вывести сообщение об этом факте.
 */

public class Task05 {
	public static void main(String[] args) {
		int[] mas = MyMethod.inMas(10, 10);
		int t = 0;

		for (int i = 0; i < mas.length; i++) {
			if ((mas[i] % 2 == 0) && (mas[i] != 0)) {
				t++;
			}
		}
		System.out.println("Количество четных элементов  " + t);

		int[] nmas = new int[t];
		int i = 0;
		for (int j = 0; j < mas.length; j++) {
			if ((mas[j] % 2 == 0) && (mas[j] != 0)) {
				nmas[i] = mas[j];
				i++;
			}
		}
		if (t == 0) {
			System.out.println("Массив не будет создан из за отсутствия четных элементов ");
		} else {
			System.out.println("№|Значение");
			for (i = 0; i < nmas.length; i++) {
				System.out.println(i + "|" + nmas[i]);
			}

		}
	}
}
