package local.home.task05.main;

//Дан одномерный массив A[N]. Найти:max( , , , ) min( , , , ) 

public class Task14 {
	public static void main(String[] args) {
		int[] mas = MyMethod.inMas(10, 20);
		int max = mas[0];
		int min = mas[0];

		MyMethod.inPrint(mas);

		for (int i = 0; i < mas.length; i = i + 2) {
			if (mas[i] > max) {
				max = mas[i];

			}
		}
		for (int i = 1; i < mas.length; i = i + 2) {
			if (mas[i] < min) {
				min = mas[i];
			}
		}
		System.out.println("\nМакисмальный элемент четного порядка  " + max);
		System.out.println("Минимальный элемент нечетного порядка " + min);
	}

}
