package local.home09task03.main;

public class City {
	private String nameCity;
	private String type;
	private boolean isCapital;
	private boolean isRegion;
	private boolean isArea;

	public City(String nameCity, String type, boolean isCapital, boolean isRegion, boolean isArea) {
		this.nameCity = nameCity;
		this.type = type;
		this.isCapital = isCapital;
		this.isRegion = isRegion;
		this.isArea = isArea;
	}

	public String getNameCity() {
		return nameCity;
	}

	public void setNameCity(String nameCity) {
		this.nameCity = nameCity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isCapital() {
		return isCapital;
	}

	public void setCapital(boolean isCapital) {
		this.isCapital = isCapital;
	}

	public boolean isRegion() {
		return isRegion;
	}

	public void setRegion(boolean isRegion) {
		this.isRegion = isRegion;
	}

	public boolean isArea() {
		return isArea;
	}

	public void setArea(boolean isArea) {
		this.isArea = isArea;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (isArea ? 1231 : 1237);
		result = prime * result + (isCapital ? 1231 : 1237);
		result = prime * result + (isRegion ? 1231 : 1237);
		result = prime * result + ((nameCity == null) ? 0 : nameCity.hashCode());
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
		City other = (City) obj;
		if (isArea != other.isArea)
			return false;
		if (isCapital != other.isCapital)
			return false;
		if (isRegion != other.isRegion)
			return false;
		if (nameCity == null) {
			if (other.nameCity != null)
				return false;
		} else if (!nameCity.equals(other.nameCity))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "City [nameCity=" + nameCity + ", type=" + type + ", isCapital=" + isCapital + ", isRegion=" + isRegion
				+ ", isArea=" + isArea + "]";
	}

}