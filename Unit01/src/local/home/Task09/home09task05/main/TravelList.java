package local.home09task05.main;

import java.util.ArrayList;
import java.util.List;

public class TravelList {
	private List<TravelTour> tour;

	public TravelList() {

		tour = new ArrayList<TravelTour>();

	}

	public TravelList(List<TravelTour> tour) {
		this.tour = tour;
	}

	public List<TravelTour> getTour() {
		return tour;
	}

	public void setTour(List<TravelTour> tour) {
		this.tour = tour;
	}

	@Override
	public String toString() {
		return "TourList [tours=" + tour + "]";
	}

	public void addTour(TravelTour tour) {
		this.tour.add(tour);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tour == null) ? 0 : tour.hashCode());
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
		TravelList other = (TravelList) obj;
		if (tour == null) {
			if (other.tour != null)
				return false;
		} else if (!tour.equals(other.tour))
			return false;
		return true;
	}

}
