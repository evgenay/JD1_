package local.home.task06.main;

public class MyMethod {

// Метод генерации одномерного массива
	public static int[] inMas(int a, int b) {
		int mas[] = new int[a];
		for (int i = 0; i < a; i++) {
			mas[i] = (int) (Math.random() * b);
		}
		return mas;
	}

//  Метод печати одномерного массива	
	public static void inPrint(int[] mas) {
		System.out.println("Исходный массив: ");
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + ",");
		}
	}
	
//  Метод печати результата одномерного массива	
	public static void outPrint(int[] mas) {
		System.out.println("\nОтсортированный массив: ");
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + ",");
		}
	}
}
