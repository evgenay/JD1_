package local.home.task06.main;

/* Заданы два одномерных массива с различным количеством элементов и натуральное число k. 
 * Объединить их в один массив, включив второй массив между k-м и (k+1)- м элементами первого,
 * при этом не используя дополнительный массив.
 */

public class Task01 {

	public static void main(String[] args) {
		int[] mas = MyMethod.inMas(10, 10);
		int[] mas2 = MyMethod.inMas(5, 10);
		int k = 2;
		int t = 0;

		MyMethod.inPrint(mas);
		System.out.println("\n");
		System.out.println("Второй ");
		MyMethod.inPrint(mas2);

		int leng = mas.length + mas2.length;
		int[] mas3 = new int[leng];

		for (int i = 0; i < leng; i++)
			if (i <= k) {
				mas3[i] = mas[i];
			} else if (i > (k + mas2.length)) {
				mas3[i] = mas[k++];
			} else {
				mas3[i] = mas2[t++];
			}
		System.out.println("");
		System.out.println("\nИтоговый");
		MyMethod.inPrint(mas3);
	}
}
