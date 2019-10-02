package local.home09task05.main;

import java.util.ArrayList;
import java.util.List;

public class TravelLogic {
	public List<TravelTour> findTour(TravelList list, TravelType type) {
		List<TravelTour> search = new ArrayList<TravelTour>();
		List<TravelTour> tour = list.getTour();
		for (TravelTour travel : tour) {
			if (travel.getType() == type) {
				search.add(travel);
			}
		}
		return search;
	}

	public List<TravelTour> findOptimalTour(TravelList list, TravelTransport transport, TravelFood food, int days) {
		List<TravelTour> search = new ArrayList<TravelTour>();
		List<TravelTour> tour = list.getTour();
		for (TravelTour travel : tour) {
			if (travel.getTransport() == transport && travel.getFood() == food && travel.getDays() == days) {
				search.add(travel);
			}
		}
		return search;
	}

}
