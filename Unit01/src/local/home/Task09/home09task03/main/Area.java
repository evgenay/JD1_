package local.home09task03.main;

public class Area {
	private String nameArea;

	public Area(String nameArea) {
		this.nameArea = nameArea;
	}

	public String getNameArea() {
		return nameArea;
	}

	public void setNameArea(String nameArea) {
		this.nameArea = nameArea;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nameArea == null) ? 0 : nameArea.hashCode());
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
		Area other = (Area) obj;
		if (nameArea == null) {
			if (other.nameArea != null)
				return false;
		} else if (!nameArea.equals(other.nameArea))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Area [nameArea=" + nameArea + "]";
	}

}
