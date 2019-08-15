package local.home.task01.main;

/*Дано действительное число R вида nnn.ddd
 * (три цифровых разряда в дробной и целой частях).
 * Поменять местами дробную и целую части числа
 * и вывести полученное значение числа.
 */

public class Task21 {
	public static void main(String[] args) {

		double nnn_ddd = 123.456;

		double nnn = nnn_ddd * 1000;
		int nnn1 = (int) nnn;
		int nnn2 = nnn1 % 1000;
		double ddd = (nnn_ddd * 1000) / 1000;
		int ddd1 = (int) ddd;

		System.out.println("Число = " + nnn_ddd);
		System.out.println("Результат = " + nnn2 + "." + ddd1);

	}

}
