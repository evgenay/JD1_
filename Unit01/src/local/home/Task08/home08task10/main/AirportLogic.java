package local.home08task10.main;

import java.util.ArrayList;
import java.util.List;

public class AirportLogic {
	public static List<Airline> allAirport(Airport port) {

		Airline[] line = port.getPort();
		List<Airline> result = new ArrayList<Airline>();
		for (Airline ln : line) {
			result.add(ln);
		}

		return result;
	}

	public static List<Airline> findByDestination(Airport port, String dest) {

		Airline[] line = port.getPort();
		List<Airline> result = new ArrayList<Airline>();

		for (int i = 0; i < line.length; i++) {

			if (line[i].getDestination().compareTo(dest) == 0) {
				result.add(line[i]);
			}
		}

		return result;
	}

	public static List<Airline> findByDayOfWeek(Airport port, String day) {

		Airline[] line = port.getPort();
		List<Airline> result = new ArrayList<Airline>();

		for (int i = 0; i < line.length; i++) {

			if (line[i].getDaysOfWeek().compareTo(day) == 0) {
				result.add(line[i]);
			}
		}

		return result;
	}

	public static List<Airline> findByDayOfWeekAndTime(Airport port, String day, Time t) {

		Airline[] line = port.getPort();
		List<Airline> result = new ArrayList<Airline>();

		for (int i = 0; i < line.length; i++) {

			if ((line[i].getDaysOfWeek().compareTo(day) == 0) && (line[i].getTime().getHour() >= t.getHour())
					&& (line[i].getTime().getMin() >= t.getMin())) {
				result.add(line[i]);
			}
		}

		return result;
	}

}
