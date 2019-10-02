package local.home09task05.main;

public class TravelTour {
	private TravelType type;
	private TravelTransport transport;
	private TravelFood food;
	private int days;
	private String country;
	
	public TravelTour() {
		type = TravelType.NULL;
		transport = TravelTransport.NULL;
		food = TravelFood.NULL;
		days = 0;
		country = new String();
	}
	
	public TravelTour(TravelType type, TravelTransport transport, TravelFood food, int days, String country) {
		this.type = type;
		this.transport = transport;
		this.food = food;
		this.days = days;
		this.country = country;
	}
	public TravelType getType() {
		return type;
	}
	public TravelTransport getTransport() {
		return transport;
	}
	public TravelFood getFood() {
		return food;
	}
	public int getDays() {
		return days;
	}
	public String getCountry() {
		return country;
	}
	public void setType(TravelType type) {
		this.type = type;
	}
	public void setTransport(TravelTransport transport) {
		this.transport = transport;
	}
	public void setFood(TravelFood food) {
		this.food = food;
	}
	public void setDays(int days) {
		this.days = days;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Тур - [ Тип - " + type + ", транспорт= " + transport + ", пища= " + food + ", дни(ей)= " + days + ", страна= "
				+ country + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + days;
		result = prime * result + ((food == null) ? 0 : food.hashCode());
		result = prime * result + ((transport == null) ? 0 : transport.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		TravelTour other = (TravelTour) obj;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (days != other.days)
			return false;
		if (food != other.food)
			return false;
		if (transport != other.transport)
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	
}

