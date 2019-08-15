package local.home.task03.main;

/*Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или
*равен заданному е. Общий член ряда имеет вид:
*/

public class Task19 {
	public static void main(String[] args) {
			int e = 1;
			double a = 0; 
			double t= 0; 

			
			for (int n = 0; n <= 10; n=n+1) {
				a = (1 / Math.pow(2, n)) + (1 / Math.pow(3, n));
				if (Math.abs(a) >= e) {
					t = t + a;
				}
			}

			System.out.println("Сумма = " + t);

		}


}
