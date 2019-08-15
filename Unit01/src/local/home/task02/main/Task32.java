package local.home.task02.main;

/*Написать программу, которая по заданным трем числам определяет, 
 * является ли сумма каких-либо двух из них положительной.
 */

public class Task32 {
	public static void main(String[] args) {
		int a = 6;
		int b = -4;
		int c = 2;

		if (a + b > 0) {
			System.out.println("a+b >0 ");
		}
		if (b + c > 0) {
			System.out.println("b+c>0 ");
		}
		if (c + a > 0) {
			System.out.println("c+a>0 ");
		} else {
			System.out.println("False ");
		}
	}

}
