package local.home10task03.main;

import java.util.ArrayList;
import java.util.List;

public class Calendar {
	private List<Month> months;

	public Calendar() {
		months = new ArrayList<Month>();
	}

	public void addMonth(Month month) {
		months.add(month);
	}

	public List<Month> getMonths() {
		return months;
	}

	public void setMonths(List<Month> months) {
		this.months = months;
	}

	class Month {
		private List<Day> days;
		private String title;

		public Month(String title) {
			days = new ArrayList<Day>();
			this.title = title;
		}

		public void addDay(Day day) {
			days.add(day);
		}

		public List<Day> getDays() {
			return days;
		}

		public void setDays(List<Day> days) {
			this.days = days;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}
	}

	class Day {
		private int date;
		private InDay inday;
		private boolean holiday;
		private boolean dayOff;

		public Day(int date, InDay inday, boolean holiday, boolean dayOff) {
			this.date = date;
			this.inday = inday;
			this.holiday = holiday;
			this.dayOff = dayOff;
		}

		public int getDate() {
			return date;
		}

		public void setDate(int date) {
			this.date = date;
		}

		public InDay getInDay() {
			return inday;
		}

		public void setInDay(InDay inday) {
			this.inday = inday;
		}

		public boolean isHoliday() {
			return holiday;
		}

		public void setHoliday(boolean holiday) {
			this.holiday = holiday;
		}

		public boolean isDayOff() {
			return dayOff;
		}

		public void setDayOff(boolean dayOff) {
			this.dayOff = dayOff;
		}

		@Override
		public String toString() {
			return "Day [date=" + date + ", inday=" + inday + ", holiday=" + holiday + ", dayOff=" + dayOff + "]";
		}

	}

}

