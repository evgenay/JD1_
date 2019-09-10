package local.home08task04.main;

import java.util.List;

/*  Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. Создайте
 * данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам
 * поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем. Добавьте
 * возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения должны
 * быть упорядочены по времени отправления.
 */

public class Main {
	public static void main(String[] args) {

		Depo trains = new Depo(5);

		trains.add(new Train("Pinsk", 36, 22.18));
		trains.add(new Train("Brest", 18, 19.15));
		trains.add(new Train("Gomel", 42, 08.10));
		trains.add(new Train("Paris", 12, 09.17));
		trains.add(new Train("Lida ", 28, 15.10));

		System.out.println("Вывод поезда по заданному №:");
		int n = 28;

		DepoLogic.getTrainInfo(trains, n);

		System.out.println("\nВсе поезда:");
		List<Train> trainsNotSort = DepoLogic.getTrains(trains);
		printTrains(trainsNotSort);

		System.out.println("\nПоезда по №:");
		Train[] sortNum = DepoLogic.sortTrainsNum(trains);
		printTrains1(sortNum);

		System.out.println("\nПоезда по месту и времени:");
		Train[] sortNameCity = DepoLogic.sortTrainsNameCity(trains);
		printTrains1(sortNameCity);

	}

	public static void printTrains(List<Train> trains) {
		for (Train st : trains) {
			System.out.printf("№ поезда: %d  ", st.getTrainNum());
			System.out.printf("Пункт назначения: %s  ", st.getDestination());
			System.out.printf("Время отправления: %02.2f\n", st.getTime());
		}
	}

	public static void printTrains1(Train[] trains) {
		for (Train st : trains) {
			System.out.printf("№ поезда: %d  ", st.getTrainNum());
			System.out.printf("Пункт назначения: %s  ", st.getDestination());
			System.out.printf("Время отправления: %02.2f\n", st.getTime());
		}
	}

}
