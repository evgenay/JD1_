package local.home09task05.main;

import java.util.Comparator;

public class TravelSortCountry implements Comparator<TravelTour>{

	@Override
	public int compare(TravelTour o1, TravelTour o2) {
		return o1.getCountry().compareTo(o2.getCountry());
	}

}
