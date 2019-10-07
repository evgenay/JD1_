package local.home10task03.main;

/* Создать класс Календарь с внутренним классом, с помощью
 * объектов которого можно хранить информацию о 
 * выходных и праздничных днях.  
 */

import local.home10task03.main.Calendar.Month;

public class Main {
	public static void main(String[] args) {
		Calendar calendar = new Calendar();
		Month jule = calendar.new Month("Июль");
		jule.addDay(calendar.new Day(1, InDay.ПОНЕДЕЛЬНИК, false, false));
		jule.addDay(calendar.new Day(2, InDay.ВТОРНИК, false, false));
		jule.addDay(calendar.new Day(3, InDay.СРЕДА, true, false));
		jule.addDay(calendar.new Day(4, InDay.ЧЕТВЕРГ, false, false));
		jule.addDay(calendar.new Day(5, InDay.ПЯТНИЦА, false, false));
		jule.addDay(calendar.new Day(6, InDay.СУББОТА, false, true));
		jule.addDay(calendar.new Day(7, InDay.ВОСКРЕСЕНЬЕ, false, true));
		jule.addDay(calendar.new Day(8, InDay.ПОНЕДЕЛЬНИК, false, false));
		jule.addDay(calendar.new Day(9, InDay.ВТОРНИК, false, false));
		jule.addDay(calendar.new Day(10, InDay.СРЕДА, false, false));
		jule.addDay(calendar.new Day(11, InDay.ЧЕТВЕРГ, false, false));
		jule.addDay(calendar.new Day(12, InDay.ПЯТНИЦА, false, false));
		jule.addDay(calendar.new Day(13, InDay.СУББОТА, false, true));
		jule.addDay(calendar.new Day(14, InDay.ВОСКРЕСЕНЬЕ, false, true));
		jule.addDay(calendar.new Day(15, InDay.ПОНЕДЕЛЬНИК, false, false));
		jule.addDay(calendar.new Day(16, InDay.ВТОРНИК, false, false));
		jule.addDay(calendar.new Day(17, InDay.СРЕДА, false, false));
		jule.addDay(calendar.new Day(18, InDay.ЧЕТВЕРГ, false, false));
		jule.addDay(calendar.new Day(19, InDay.ПЯТНИЦА, false, false));
		jule.addDay(calendar.new Day(20, InDay.СУББОТА, false, true));
		jule.addDay(calendar.new Day(21, InDay.ВОСКРЕСЕНЬЕ, false, true));
		jule.addDay(calendar.new Day(22, InDay.ПОНЕДЕЛЬНИК, false, false));
		jule.addDay(calendar.new Day(23, InDay.ВТОРНИК, false, false));
		jule.addDay(calendar.new Day(24, InDay.СРЕДА, false, false));
		jule.addDay(calendar.new Day(25, InDay.ЧЕТВЕРГ, false, false));
		jule.addDay(calendar.new Day(26, InDay.ПЯТНИЦА, false, false));
		jule.addDay(calendar.new Day(27, InDay.СУББОТА, false, true));
		jule.addDay(calendar.new Day(28, InDay.ВОСКРЕСЕНЬЕ, false, true));
		jule.addDay(calendar.new Day(29, InDay.ПОНЕДЕЛЬНИК, false, false));
		jule.addDay(calendar.new Day(30, InDay.ВТОРНИК, false, false));
		jule.addDay(calendar.new Day(31, InDay.СРЕДА, false, false));

		calendar.addMonth(jule);

		DayLogic logic = new DayLogic();
		logic.getInfoDay(calendar, "Июль", 3,InDay.СРЕДА);
		logic.getInfoDay(calendar, "Июль", 4,InDay.ЧЕТВЕРГ);
		logic.getInfoDay(calendar, "Июль", 7,InDay.ВОСКРЕСЕНЬЕ);

	}

}
