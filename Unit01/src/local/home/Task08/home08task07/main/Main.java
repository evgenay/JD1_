package local.home08task07.main;

/*
 * Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления 
 * площади, периметра и точки пересечения медиан.
 */

public class Main {

	public static void main(String[] args) {

		Triangle t = new Triangle(8, 6, 3);

		TriangleLogic.getStor(t);

		System.out.println("Сторона треугольника ");
		System.out.println("A = " + t.getA() + ", B =  " + t.getB() + ", C =  " + t.getC());

		double per = TriangleLogic.getPerimeter(t);
		System.out.printf("Периметр = %.2f\n", per);

		double sq = TriangleLogic.getSquare(t);
		System.out.printf("Площадь = %.2f\n", sq);

		double med = TriangleLogic.getMedian(t);
		System.out.printf("Медиана = %.2f\n", med);

	}

}
