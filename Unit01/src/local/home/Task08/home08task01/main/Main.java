package local.home08task01.main;

/*Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных.
 *Добавьте метод, который находит сумму значений этих переменных, и метод, который находит наибольшее значение
 *из этих двух переменных
 */

public class Main {
	public static void main(String[] args) {
		Test1 z = new Test1();

		z.setAnum(14);
		z.setBnum(8);

		z.printAnum(z.getAnum());
		z.printBnum(z.getBnum());

		z.getSum();
		z.getMax();

	}

}
