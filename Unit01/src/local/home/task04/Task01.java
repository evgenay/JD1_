package local.home.task04.main;

import local.home.task04.main.MyMethod;

/*Треугольник задан координатами своих вершин. 
 *Написать метод для вычисления его площади
 */

public class Task01 {
	public static void main(String[] args) {
		double x1 = 7;
		double x2 = 5;
		double x3 = 6;
		double y1 = 3;
		double y2 = -1;
		double y3 = -5;

		System.out.println("Площадь треугольника = " + MyMethod.ThreangleS(x1, x2, x3, y1, y2, y3));
	}
}
