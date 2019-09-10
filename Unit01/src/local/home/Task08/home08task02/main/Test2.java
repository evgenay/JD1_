package local.home08task02.main;

public class Test2 {
	private int a;
	private int b;

	public Test2() {
		a = 4;
		b = 3;
	}

	public Test2(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void setAnum(int a) {
		this.a = a;
	}

	public int getAnum() {
		return a;
	}

	public void setBnum(int b) {
		this.b = b;
	}

	public int getBnum() {
		return b;
	}

	public void printNum() {
		System.out.println("a = " + a + ", b = " + b);
	}

}
