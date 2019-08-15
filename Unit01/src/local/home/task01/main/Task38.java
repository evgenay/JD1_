package local.home.task01.main;

/*  Для данных областей составить линейную программу, которая печатает true, если точка с координатами (х, у)
принадлежит закрашенной области, и false — в противном случае: 
*/
public class Task38 {
	public static void main(String[] args) {
		
		// рисунок А
		
		int x = -2;
		int y = 4;

		if ((x >= -4 && x <= 4) && (y <= 4 && y >= 0)) {
			System.out.println("true");
		} else {
			System.out.println("folse");
		}

		// рисунок B
		
		int x2 = 1;
		int y2 = 1;

		if ((((x2 >= -4 && x2 <= 4) && (y2 >= -3 && y2 <= 0))) || ((x2 >= -2 && x2 <= 2) && (y2 >= -2 && y2 >= -2))) {
			System.out.println("true");

		} else {
			System.out.println("folse");
		}
		
		// рисунок C	
	
		int x3 = 2;
		int y3 = 3;

		if (((y3 >= 0) && (x3 >= 0) && (y3 <= Math.sqrt(16 - x3 * x3))) || ((x3 >= 0) && (y3 <= 0) && (y3 <= Math.sqrt(25 - x3 * x3)))) {
			System.out.println("true");

		} else {
			System.out.println("folse");

		}
	}

}
