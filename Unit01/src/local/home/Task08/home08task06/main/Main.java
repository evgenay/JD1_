package local.home08task06.main;

/* Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
 * изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
 * недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на заданное
 * количество часов, минут и секунд
 */

public class Main {
	public static void main(String[] args) {
		Time t = new Time(14, 18, 11);

		System.out.println("Установленное время  ");

		LogicTime.getTime(t);

	}

}