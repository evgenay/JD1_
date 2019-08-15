package local.home.task01.main;

/* Составить линейную программу, печатающую значение true, 
 * если указанное высказывание является истинным, и
false — в противном случае:
*/
public class Task37 {
	public static void main(String[] args) {

		/* Целое число N является четным двузначным числом. */
		int a = 98;

		if ((a % 2 == 0) && ((a >= 10 && a <= 98))) {
			System.out.println("true");
		} else {
			System.out.println("folse");
		}

		/*
		 * Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его
		 * последних цифр.
		 */
		double b = 2222;

		if (((int) b / 1000 + (int) b % 10) == (int) b % 100 / 10 + (int) b % 10) {
			System.out.println("true");
		} else {
			System.out.println("folse");
		}

		/* Сумма цифр данного трехзначного числа N является четным числом. */
		double n = 222;

		if ((n >= 99 && n <= 1000) && (((int) n / 100) + ((int) n / 10 % 10) + (n % 10)) % 2 == 0) {
			System.out.println("true");
		} else {
			System.out.println("folse");
		}

		/*
		 * Точка с координатами (х, у) принадлежит части плоскости, лежащей между
		 * прямыми х= т, х= п (т<п)
		 */
		double x = 15;
		// double y=6;
		double m = 122;
		double n2 = 15;

		if (m < n2) {
			System.out.println("folse");
		} else {
			if (((x >= n2) && (x <= n2))) {
				System.out.println("true");
			}
			// past folse

			/* Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа. */
			double k = 1;
			double t = 1;

			t = ((int) k) / 100 + (((int) k) / 10) % 10 + k % 10;
			if ((k * k == t * t * t)) {
				System.out.println("true");
			} else {
				System.out.println("folse");
			}

			/* Треугольник со сторонами а,b,с является равнобедренным. */
			double a2 = 5;
			double b2 = 5;
			double c2 = 4;

			if ((a2 == b2) || (b2 == c2)) {
				System.out.println("true");
			} else {
				System.out.println("folse");
			}

			/*
			 * Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна
			 * третьей цифре.
			 */
			double a3;
			double b3;
			double c3;
			double n3 = 110;

			a3 = (int) n3 / 100;
			b3 = ((int) n3 / 10) % 10;
			c3 = (int) n3 % 10;
			if (((a3 + b3 == c3)) || (a3 + c3 == b3) || (b3 + c3 == a3)) {
				System.out.println("true");
			} else {
				System.out.println("folse");
			}

			/*
			 * Заданное число N является степенью числа а (показатель степени может
			 * находиться в диапазоне от 0 до 4).
			 */
			double n4 = 4;

			if (n4 >= 0 && n4 <= 4) {
				System.out.println("true");
			} else {
				System.out.println("folse");
			}

			/*
			 * График функции у = ах2 + bх+ с проходит через заданную точку с координатами
			 * (m, п).
			 */
			double a5 = 1;
			double b5 = 2;
			double c5 = 5;
			double m5 = 68;
			double n5 = 7;
			double y5;

			y5 = ((a5 * Math.pow(n5, 2) + b5 * n5 + c5));
			if (y5 == m5) {
				System.out.println("true");
			} else {
				System.out.println("folse");
			}

		}

	}

}
