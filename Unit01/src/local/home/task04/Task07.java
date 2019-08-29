package local.home.task04.main;

/* На плоскости заданы своими координатами n точек. Написать метод(методы),
 * определяющие, между какими из пар точек самое большое расстояние.
 * Указание. Координаты точек занести в массив.
 */

public class Task07 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][] mas = { { 2, 4, 6, 8 }, { 1, 9, 5, 3 } };
		System.out.println("Самое большое расстояние = " + MyMethod.maxDist(mas));
	}

}
