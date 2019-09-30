package local.home09task03.main;

/*  Создать объект класса Государство, используя классы Область, Район, Город.
 *  Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
 */

import local.home09task03.main.City;
import local.home09task03.main.Country;
import local.home09task03.main.CountryLogic;

public class Main {
	public static void main(String[] args) {

		Country country = new Country();
		country.add(new City("Орша", " - Витебская область", false, false, false));
		country.add(new City("Минск", " - Минская область", true, true, true));
		country.add(new City("Брест", " - Брестская область", false, true, true));
		country.add(new City("Гродно", " - Гродненская область", false, true, true));
		country.add(new City("Гомель", " - Гомельская область", false, true, true));
		country.add(new City("Витебск", " - Витебская область", false, true, true));
		country.add(new City("Могилев", " - Могилевская область", false, true, true));
		country.add(new City("Лида", " - Гродненская область", false, false, false));

		CountryLogic reg = new CountryLogic();
		reg.theCapital(country);
		System.out.println();

		reg.theRegional(country);
		System.out.println();

		reg.countRegion(country);

		reg.theArea(country);
	}
}
