package local.home.task02.main;

/* Вычислить число и месяц в невисокосном году 
 * по номеру дня
 */
public class Task35 {
	public static void main(String[] args) {
		int a = 360;

		if ((a > 0) && (a <= 31)) {
			System.out.println(a + " Января");
		} else if ((a > 31) && (a <= 59)) {
			System.out.println(a - 31 + " Февраля");
		} else if ((a > 59) && (a <= 90)) {
			System.out.println(a - 59 + " Марта");
		} else if ((a > 90) && (a <= 120)) {
			System.out.println(a - 90 + " Апреля");
		} else if ((a > 120) && (a <= 151)) {
			System.out.println(a - 120 + " Мая");
		} else if ((a > 151) && (a <= 181)) {
			System.out.println(a - 151 + " �?юня");
		} else if ((a > 181) && (a <= 212)) {
			System.out.println(a - 181 + " �?юля");
		} else if ((a > 212) && (a <= 243)) {
			System.out.println(a - 212 + " Августа");
		} else if ((a > 243) && (a <= 273)) {
			System.out.println(a - 243 + " Сентября");
		} else if ((a > 273) && (a <= 304)) {
			System.out.println(a - 273 + " Октября");
		} else if ((a > 304) && (a <= 334)) {
			System.out.println(a - 304 + " Ноября");
		} else if ((a > 334) && (a <= 365)) {
			System.out.println(a - 334 + " Декабря");
		} else {
			System.out.println(" Не верно указан день");
		}
	}
}
