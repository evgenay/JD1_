package local.home.task02.main;

/*Определить правильность даты, введенной с клавиатуры  
 *  (число — от 1 до 31, месяц — от 1 до 12).
 *  Если введены некорректные данные, то сообщить об этом
*/

public class Task23 {
	public static void main(String[] args) {

		int day = 15;
		int mounth = 12;

		if ((mounth < 1) || (mounth > 12)) {
			System.out.println("Неверная дата: неверно введен месяц!");
		} else if ((day < 1) || (day > 31)) {
			System.out.println("Неверная дата: неверно введен день!");
		} else {
			System.out.println("Дата  = " + day + "." + mounth);
		}
	}
}
