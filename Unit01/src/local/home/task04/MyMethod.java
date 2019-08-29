package local.home.task04.main;

public class MyMethod {

//Метод вычисления площади треугольника
	public static double ThreangleS(double x1, double x2, double x3, double y1, double y2, double y3) {
		double a, b, c, p, s;

		a = Math.sqrt(Math.pow((x1 - x2), 2) + (Math.pow((y1 - y2), 2)));
		b = Math.sqrt(Math.pow((x3 - x2), 2) + (Math.pow((y3 - y2), 2)));
		c = Math.sqrt(Math.pow((x1 - x3), 2) + (Math.pow(y1 - y3, 2)));
		p = (a + b + c);
		s = Math.sqrt((p / 2 * (p / 2 - a) * (p / 2 - b) * (p / 2 - c)));

		return s;
	}

// Метод поиска НОД
	public static int inNod(int x, int y, int nod) {

		int z = (x * y);
		int i = 1;

		do {
			if ((x % i == 0) && (y % i == 0)) {

				if (nod < i) {
					nod = i;
				}
			}
		} while (i++ < z);
		return nod;
	}

// Метод поиска НОK
	public static int inNok(int x, int y, int nod, int nok) {

		int z = (x * y);
		int i = 1;
		do {
			if ((x % i == 0) && (y % i == 0)) {

				if (nod < i) {
					nod = i;
				}
				nok = z / nod;
			}
		} while (i++ < z);
		return nok;
	}

// Метод поиска НОД 3
	public static int inNodThree(int x, int y, int z, int nod) {

		int a = (x * y * z);
		int i = 1;
		do {
			if ((x % i == 0) && (y % i == 0) && (z % i == 0)) {

				if (nod < i) {
					nod = i;
				}
			}
		} while (i++ < a);
		return nod;
	}

// Метод поиска НОД 4
	public static int inNodFour(int x, int y, int z, int t, int nod) {

		int a = (x * y * z * t);
		int i = 1;
		do {
			if ((x % i == 0) && (y % i == 0) && (z % i == 0) && (t % i == 0)) {

				if (nod < i) {
					nod = i;
				}
			}
		} while (i++ < a);
		return nod;
	}

// Метод поиска НОK 3
	public static int inNokThree(int x, int y, int z, int nod, int nok) {

		int a = (x * y * z);
		int i = 1;
		do {
			if ((x % i == 0) && (y % i == 0) && (z % i == 0)) {

				if (nod < i) {
					nod = i;
				}
				nok = (a / nod) / 10;
			}
		} while (i++ < a);
		return nok;
	}

// Метод поиска дистанции между  точками - задача 7	
	public static double maxDist(double[][] mas) {
		double dist = 1;
		for (int i = 0; i < mas[0].length; i++) {
			for (int j = 0; j < mas[0].length; j++) {
				double s = Math.sqrt(((mas[0][i] - mas[0][j]) * ((mas[0][i] - mas[0][j]))
						+ (((mas[1][i] - mas[1][j]) * (mas[1][i] - mas[1][j])))));
				if (s > dist) {
					dist = s;
				}
			}
		}
		return dist;
	}

// Метод генерации массива
	public static int[] inMas(int a, int b) {
		int mas[] = new int[a];
		for (int i = 0; i < a; i++) {
			mas[i] = (int) (Math.random() * b);
// Просмотр значений		
//			System.out.println(mas[i]); 
		}
		return mas;
	}

// Проверка числа
	public static boolean testDig(int a) {
		int i = 2;
		do {
			if (a % i == 0) {
				return false;
			}
			i++;
		} while (i < a);
		return true;
	}

// Проверка числа на чётность - задача 19
	public static int numOutDig(long outDig) {
		int num = 0;
		while ((outDig / 10) >= 0.1) {
			double arg1 = (outDig % 10) % 2;
			double arg2 = outDig % 10;
			if ((arg1 == 0) && ((arg2) != 0)) {
				num++;
			}
			outDig = (outDig / 10);
		}
		return num;
	}
}
