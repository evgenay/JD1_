package local.home.task07.main;

//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class Task14 {

	public static void main(String[] args) {
			int n = 4;
			int m = n;
			int c = 1;
			int[][] mas = MyMethod.inTwoMas(n, m, c);

			System.out.println("Исходный массив:");

			MyMethod.inPrintMat(mas);
			System.out.println("\n" + "Квадратная матрица порядка n: " +n+ "\n");

			for (int i = 0; i < mas.length; i++) {
				for (int j = 0; j < mas[i].length; j++) {
					if (i == j)
						mas[i][mas[i].length-j-1] =c++;
				}
			}
			MyMethod.inPrintMat(mas);
		}

	}


