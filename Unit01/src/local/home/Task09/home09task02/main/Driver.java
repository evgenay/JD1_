package local.home09task02.main;

public class Driver {
	private String go;
	private int speed;
	private int refuel;
	private int changewheel;

	public Driver(String go, int speed, int refuel, int changewheel) {
		this.go = go;
		this.speed = speed;
		this.refuel = refuel;
		this.changewheel = changewheel;
	}

	public String getGo() {
		return go;
	}

	public void setGo(String go) {
		this.go = go;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setRefuel(int refuel) {
		this.refuel = refuel;
	}

	public int getRefuel() {
		return refuel;
	}

	public void setChangeWheel(int changewheel) {
		this.changewheel = changewheel;
	}

	public int getChangeWheel() {
		return changewheel;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + changewheel;
		result = prime * result + ((go == null) ? 0 : go.hashCode());
		result = prime * result + refuel;
		result = prime * result + speed;
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
		Driver other = (Driver) obj;
		if (changewheel != other.changewheel)
			return false;
		if (go == null) {
			if (other.go != null)
				return false;
		} else if (!go.equals(other.go))
			return false;
		if (refuel != other.refuel)
			return false;
		if (speed != other.speed)
			return false;
		return true;
	}

}
