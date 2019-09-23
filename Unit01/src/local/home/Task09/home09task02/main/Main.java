package local.home09task02.main;

public class Main {
	public static void main(String[] args) {
		Car car = new Car("Ford Mondeo", new Engine("АИ 95 ", 1.8), new Wheel(16), (2010));
		Driver driver = new Driver("Едем", 60, 0, 0);

		print(car);
		print(driver);
		driver.setGo("Пробито 1 колесо и его замена");
		driver.setChangeWheel(1);
		driver.setSpeed(0);
		print(driver);
		driver.setGo("Заправляем машину на 20 литров и едем");
		driver.setRefuel(20);
		driver.setSpeed(40);
		print(driver);

	}

	public static void print(Car car) {
		System.out.println("Модель: " + car.getModel());
		System.out.println("Год выпуска: " + car.getYear());
		System.out.println("Топливо " + car.getEngine());
		System.out.println("Диаметр колеса " + car.getWheel());
	}

	public static void print(Driver driver) {

		System.out.println(driver.getGo());
		System.out.println("Скорость Км/ч: " + driver.getSpeed());
	}

}
