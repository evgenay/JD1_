package local.home.task05.main;

/*В целочисленной последовательности есть нулевые элементы.
Создать массив из номеров этих элементов*/

public class Task02 {
	public static void main(String[] args) {

		int[] mas = MyMethod.inMas(30, 10);
		int t = 0;

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == 0) {
				t++;
			}
		}
		System.out.println("Количество нулевых элементов  " + t);

		int[] zmas = new int[t];
		int i = 0;
		for (int j = 0; j < mas.length; j++) {
			if (mas[j] == 0) {
				zmas[i] = j;
				i++;
			}
		}
		System.out.println("№|Значение");
		for (i = 0; i < zmas.length; i++) {
			System.out.println(i + "|" + zmas[i]);

		}
	}

}