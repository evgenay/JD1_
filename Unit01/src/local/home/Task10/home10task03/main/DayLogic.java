package local.home10task03.main;

import local.home10task03.main.Calendar.Day;
import local.home10task03.main.Calendar.Month;

public class DayLogic {
	public void getInfoDay(Calendar calendar, String month, int day, InDay inDay) {
		System.out.println();
		System.out.println(month + " - " + day + " - " + inDay);
		for (Month months : calendar.getMonths()) {

			if (months.getTitle().compareTo(month) == 0) {

				for (Day d : months.getDays()) {

					if (d.getDate() == day) {
						if (d.isDayOff() || d.isHoliday()) {
							System.out.println("Выходной день");
						} else {
							System.out.println("Рабочий день");
						}
						if (d.isHoliday()) {
							System.out.println("Праздничный день");
						} else {
							System.out.println("Не праздничный день");
						}
					}

				}
			}
		}
	}

}

