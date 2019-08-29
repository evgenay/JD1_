package local.home.task04.main;

/*Вычислить площадь правильного шестиугольника со стороной а,
 *используя метод вычисления площади треугольника.
 */

import local.home.task04.main.MyMethod;

public class Task06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x1 = 7;
		double x2 = 5;
		double x3 = 6;
		double y1 = 3;
		double y2 = -1;
		double y3 = -5;
		int c = (int) (MyMethod.ThreangleS(x1, x2, x3, y1, y2, y3) * 6);
		System.out.println("Площадь = " + c);

	}
}
