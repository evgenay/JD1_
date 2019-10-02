package local.home09task05.main;

import java.util.Comparator;

public class TravelSortTransport implements Comparator<TravelTour> {

	@Override
	public int compare(TravelTour o2, TravelTour o1) {
		return o1.getTransport().compareTo(o2.getTransport());
	}

}
