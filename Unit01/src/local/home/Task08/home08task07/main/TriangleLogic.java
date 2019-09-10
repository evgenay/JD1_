package local.home08task07.main;

public class TriangleLogic {

	public static double getStor(Triangle t) {
		if ((t.getA() == 0) || (t.getB() == 0) || (t.getC() == 0)) {
			System.out.println("Неверные параметры треугольника");
		}
		double stor = 0;
		return stor;
	}

	public static double getSquare(Triangle t) {

		double square;
		double polPer;
		polPer = getPerimeter(t) / 2;
		square = Math.sqrt(polPer * (polPer - t.getA()) * (polPer - t.getB()) * (polPer - t.getC()));

		return square;
	}

	public static double getPerimeter(Triangle t) {

		double perimeter;
		perimeter = t.getA() + t.getB() + t.getC();

		return perimeter;
	}

	public static double getMedian(Triangle t) {
		double median = (t.getA() + t.getB() + t.getC()) / 3;

		return median;
	}

}
