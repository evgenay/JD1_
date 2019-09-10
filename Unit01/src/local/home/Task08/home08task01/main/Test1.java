package local.home08task01.main;

public class Test1 {
	private int a;
	private int b;

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

	public void printAnum(int a) {
		System.out.println("Число А = " + a);
	}

	public void printBnum(int b) {
		System.out.println("Число B = " + b);
	}

	public void getSum() {
		int sum;
		sum = a + b;
		System.out.println("Сумма = " + sum);
	}

	public void getMax() {
		if (a > b) {
			System.out.println("Число А больше = " + a);
		} else {
			System.out.println("Число B больше = " + b);
		}
	}
}
