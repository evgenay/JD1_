package local.home.task05.main;

/* Дана последовательность целых чисел a1,a2,..,an. 
 * Образовать новую последовательность, выбросив из исходной те члены, которые равны
 * min(a1 ,a2 ,an , ).   
 */

public class Task17 {

	public static void main(String[] args) {
		int[] mas = MyMethod.inMas(10, 10);

		MyMethod.inPrint(mas);

		int sum = 0;
		int min;
		for (int i = 0; i < mas.length; i++) {
			sum = sum + mas[i];
		}
		min = sum / mas.length;

		int j = 0;
		int[] nmas = new int[mas.length];
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] != min) {
				nmas[j] = mas[i];
				j++;
			}
		}
		System.out.print("\nСумма элементов = " + sum);
		System.out.print("\nМинимальный элемент = " + min);

		System.out.print("\nИзмененый массив c исключенным элементом " + min + " : \n");
		for (int i = 0; i < nmas.length; i++) {
			System.out.print(nmas[i] + ",");

		}
	}
}
