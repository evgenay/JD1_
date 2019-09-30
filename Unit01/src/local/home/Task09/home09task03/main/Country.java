package local.home09task03.main;

import java.util.ArrayList;
import java.util.List;

public class Country {
	private List<City> country;

	public Country() {
		country = new ArrayList<City>();
	}

	public void add(City city) {
		country.add(city);
	}

	public List<City> getCountry() {
		return country;
	}

	public void setCountry(List<City> country) {
		this.country = country;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Country other = (Country) obj;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Country [country=" + country + "]";
	}

}
