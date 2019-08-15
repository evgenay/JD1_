package local.home.task01.main;

/* Написать программу, которая выводит на экран
 * первые четыре степени числа π.
 */
public class Task15 {
	public static void main(String[] args) {
		double pi = (Math.PI);
		double pi2;
		double pi3;
		double pi4;

		pi2 = Math.pow(pi, 2);
		pi3 = Math.pow(pi, 3);
		pi4 = Math.pow(pi, 4);

		System.out.println("Число π = " + pi + "\nЧисло π II степень  = " + pi2 + "\nЧисло π III степень  = " + pi3
				+ "\nЧисло π IV степень  = " + pi4);
	}

}
