package local.home.task03.main;

/*Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или
*равен заданному е. Общий член ряда имеет вид:
*/

public class Task18 {
	public static void main(String[] args) {
		double e = 0.05;
		double n = 0;
		double t = 1;
		double s = 1;

		if (e >= 1) {
			s = 1;
		} else {
		}
		do {
			s = t;
			System.out.println("Сумма = " + t);
			n = n + 1;
			t = t * 10 / n;
			s = s + t;
		} while (t > e);
	}

}
