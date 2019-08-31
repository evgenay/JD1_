package local.home.task05.main;

//Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить, будет ли она возрастающей.

public class Task04 {

	public static void main(String[] args) {
		int[] mas = MyMethod.inMas(10, 10);

		for (int i = 0; i < mas.length - 1;) {
			if (mas[i] <= mas[i + 1]) {
				System.out.println("Последовательность возрастающая ");
				break;
			} else {
				System.out.println("Последовательность убывающая");
			}
			break;
		}
	}

}
