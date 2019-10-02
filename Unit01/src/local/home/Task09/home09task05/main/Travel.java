package local.home09task05.main;

public class Travel {
	public static void main(String[] args) {

		TravelList travel = new TravelList();

		travel.addTour(new TravelTour(TravelType.КРУИЗ, TravelTransport.САМОЛЕТ, TravelFood.ВСЕВКЛЮЧЕНО, 20, "США"));
		travel.addTour(new TravelTour(TravelType.ЛЕЧЕНИЕ, TravelTransport.АВТОБУС, TravelFood.ЗАВТРАК, 17, "Израиль"));
		travel.addTour(new TravelTour(TravelType.ШОПИНГ, TravelTransport.ПОЕЗД, TravelFood.ЗАВТРАК, 19, "ЮАР"));
		travel.addTour(
				new TravelTour(TravelType.КРУИЗ, TravelTransport.АВТОМОБИЛЬ, TravelFood.ВСЕВКЛЮЧЕНО, 8, "Швеция"));
		travel.addTour(
				new TravelTour(TravelType.ЭКСКУРСИЯ, TravelTransport.ПОЕЗД, TravelFood.ТРЕХРАЗОВОЕ, 3, "Польша"));
		travel.addTour(new TravelTour(TravelType.КРУИЗ, TravelTransport.САМОЛЕТ, TravelFood.ВСЕВКЛЮЧЕНО, 15, "Япония"));

		TravelLogic t = new TravelLogic();

		TravelSortCountry country = new TravelSortCountry();
		System.out.println("Отсортированные путевки по стране:");
		travel.getTour().sort(country);
		print(travel);

		TravelSortTransport transport = new TravelSortTransport();
		System.out.println("Отсортированные путевки по транспорту:");
		travel.getTour().sort(transport);
		print(travel);

		System.out.println("Оптимальный выбор путевки:");
		if (t.findOptimalTour(travel, TravelTransport.САМОЛЕТ, TravelFood.ВСЕВКЛЮЧЕНО, 9).isEmpty()) {
			System.out.println("Такие путевки отсутствуют");
		} else
			System.out
					.println(t.findOptimalTour(travel, TravelTransport.САМОЛЕТ, TravelFood.ВСЕВКЛЮЧЕНО, 15).toString());
		System.out.println();

		System.out.println("Типы путевок:");
		if (t.findTour(travel, TravelType.КРУИЗ).isEmpty()) {
			System.out.println("Такие путевки отсутствуют");
		} else
			System.out.println(t.findTour(travel, TravelType.ШОПИНГ).toString());
		System.out.println();
	}

	public static void print(TravelList tours) {
		for (TravelTour t : tours.getTour()) {
			System.out.println(t.toString());
		}
		System.out.println();
	}

}
