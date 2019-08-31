package local.home.task05.main;

/* Дан целочисленный массив с количеством элементов п.
 * Сжать массив, выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями).
 * Примечание. Дополнительный массив не использовать.
 */

public class Task20 {
	public static void main(String[] args) {
		int n = 5;
		int[] mas = MyMethod.inMas(n, 10);

		MyMethod.inPrint(mas);

		for (int i = 0; i < mas.length; i = i + 2) {
			mas[i] = 0;
		}
		System.out.print("\nОбработанный массив-0- :" + "\n");
		for (int j = 0; j < mas.length; j++) {
			System.out.print(mas[j] + ",");
		}

		int zmas;
		for (int j = 0; j < mas.length; j++) {
			if (mas[j] == 0)
				for (int i = 0; i < mas.length; i++) {
					zmas = mas[i];
					mas[i] = mas[j];
					mas[j] = zmas;
				}
		}
		System.out.print("\nСжатый массив :" + "\n");
		for (int j = mas.length - 1; j > 0; j--) {
			System.out.print(mas[j] + ",");
		}
	}
}