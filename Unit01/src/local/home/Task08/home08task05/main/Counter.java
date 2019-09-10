package local.home08task05.main;

public class Counter {
	private int digital;
	private int maxDigital;
	private int minDigital;

	public Counter(int digital, int maxDigital, int minDigital) {
		this.maxDigital = maxDigital;
		this.minDigital = minDigital;
		this.digital = digital;
	}

	public Counter() {
		this.digital = 0;
		this.minDigital = 0;
		this.maxDigital = 0;
	}

	public int getDigital() {
		return digital;
	}

	public void setDigital(int digital) {
		this.digital = digital;
	}

	public int getMaxDigital() {
		return maxDigital;
	}

	public void setMaxDigital(int maxDigital) {
		this.maxDigital = maxDigital;
	}

	public int getMinDigital() {
		return minDigital;
	}

	public void setMinDigital(int minDigital) {
		this.minDigital = minDigital;
	}

}