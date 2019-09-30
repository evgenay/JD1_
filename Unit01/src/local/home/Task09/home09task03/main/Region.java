package local.home09task03.main;

public class Region {
	private String nameRegion;

	public Region(String nameRegion) {
		this.nameRegion = nameRegion;
	}

	public String getNameRegion() {
		return nameRegion;
	}

	public void setNameRegion(String nameRegion) {
		this.nameRegion = nameRegion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nameRegion == null) ? 0 : nameRegion.hashCode());
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
		Region other = (Region) obj;
		if (nameRegion == null) {
			if (other.nameRegion != null)
				return false;
		} else if (!nameRegion.equals(other.nameRegion))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Region [nameRegion=" + nameRegion + "]";
	}

}
