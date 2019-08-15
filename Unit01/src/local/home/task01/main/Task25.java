package local.home.task01.main;

/*Вычислить корни квадратного уравнения ах2+ bх + с = 0 с 
 * заданными коэффициентами a, b и с (предполагается,
что а≠0 и что дискриминант уравнения неотрицателен).
*/
public class Task25 {
	public static void main(String[] args) {
		double a = 2;
		double b = 32;
		double c = 18;
		double d;
		double x1;
		double x2;

		d = (Math.pow(b, 2)) - 4 * a * c;
		x1 = ((-b - (Math.sqrt(d))) / (2 * a));
		x2 = ((-b + (Math.sqrt(d))) / (2 * a));

		if (x1 <= x2) {
			System.out.println("X1 = " + x1 + " X2 = " + x2);
		} else
			System.out.println("X3 = " + x2 + " X4 = " + 1);
	}

}
