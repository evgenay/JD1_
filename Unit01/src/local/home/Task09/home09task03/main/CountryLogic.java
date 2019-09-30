package local.home09task03.main;

import java.util.List;

import local.home09task03.main.City;
import local.home09task03.main.Country;

public class CountryLogic {
	public void theCapital(Country country) {
		System.out.println("Столица: ");
		List<City> city = country.getCountry();
		for (City x : city) {
			if (x.isCapital()) {
				System.out.print(x.getNameCity());
			}
		}
	}

	public void theRegional(Country country) {
		System.out.println("\nОбластные центры: ");
		List<City> city = country.getCountry();
		for (City x : city) {
			if (x.isArea()) {
				System.out.print(x.getNameCity());
				System.out.println(x.getType());
			}
		}
	}

	public void countRegion(Country country) {
		int count = 0;
		List<City> city = country.getCountry();
		for (City x : city) {
			if (x.isRegion()) {
				count++;
			}
		}
		System.out.println("Количество областей: " + count);
		System.out.println("Площадь 207.595");
	}

	public void theArea(Country country) {
		System.out.println("\nРайонные центры: ");
		List<City> city = country.getCountry();
		for (City x : city) {
			if (x.isArea() == false) {
				System.out.print(x.getNameCity());
				System.out.println(x.getType());
			}
		}
	}
}
