package local.home08task10.main;

import java.util.List;

/* Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
 * метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
 * методами. Задать критерии выбора данных и вывести эти данные на консоль.
 * Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
 * Найти и вывести:
 * a) список рейсов для заданного пункта назначения;
 * b) список рейсов для заданного дня недели;
 * c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */

public class Main {
	public static void main(String[] args) {

		Airport airport = new Airport(5);

		airport.add(new Airline("Париж", 110, "Боинг-737", (new Time(15, 15)), "Понедельник"));
		airport.add(new Airline("Монако", 115, "Боинг-737", (new Time(18, 10)), "Среда"));
		airport.add(new Airline("Монте-Карло", 120, "Боинг-737", (new Time(10, 15)), "Вторник"));
		airport.add(new Airline("Минск", 118, "Боинг-626", (new Time(01, 28)), "Среда"));
		airport.add(new Airline("Москва", 100, "Боинг-626", (new Time(03, 17)), "Четверг"));

		System.out.println("Общий список рейсов:");
		List<Airline> getAll = AirportLogic.allAirport(airport);
		print(getAll);

		System.out.println("\nСписок рейсов для заданного пункта назначения:");
		List<Airline> getDest = AirportLogic.findByDestination(airport, "Монте-Карло");
		print(getDest);

		System.out.println("\nСписок рейсов для заданного дня недели:");
		List<Airline> getDay = AirportLogic.findByDayOfWeek(airport, "Среда");
		print(getDay);

		System.out.println("\nСписок рейсов для заданного дня недели, время вылета для которых больше заданного:");
		List<Airline> getDayTime = AirportLogic.findByDayOfWeekAndTime(airport, "Среда", new Time(01, 00));
		print(getDayTime);

	}

	public static void print(List<Airline> line) {
		for (Airline ln : line) {
			System.out.printf("Пункт назначения: %s - ", ln.getDestination());
			System.out.printf("Номер рейса: %d: ", ln.getFlyghtNum());
			System.out.printf("Тип самолета: %s: ", ln.getPlanesType());
			System.out.printf("Время вылета - %s ", ln.getTime());
			System.out.printf("День недели: %s\n", ln.getDaysOfWeek());

		}

	}

}
