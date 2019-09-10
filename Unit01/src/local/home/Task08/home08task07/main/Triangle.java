package local.home08task07.main;

public class Triangle {
	private int a;
	private int b;
	private int c;

	public void setA(int a) {
		if ((b + c) > a) {
			this.a = a;
		} else {
			this.a = 0;
		}
	}

	public int getA() {
		return a;
	}

	public void setB(int b) {
		if ((a + c) > b) {
			this.b = b;
		} else {
			this.b = 0;
		}
	}

	public int getB() {
		return b;
	}

	public void setC(int c) {
		if ((b + a) > c) {
			this.c = c;
		} else {
			this.c = 0;
		}
	}

	public int getC() {
		return c;
	}

	public Triangle(int a, int b, int c) {
		if ((b + c) > a) {
			this.a = a;
		} else {
			this.a = 0;
		}

		if ((a + c) > b) {
			this.b = b;
		} else {
			this.b = 0;
		}

		if ((b + a) > c) {
			this.c = c;
		} else {
			this.c = 0;
		}

	}
}
