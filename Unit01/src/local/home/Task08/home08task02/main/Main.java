package local.home08task02.main;

public class Main {
	public static void main(String[] args) {
		Test2 z = new Test2();
		z.printNum();

		Test2 z1 = new Test2(7, 8);
		z1.printNum();

		z1.setAnum(31);
		z1.printNum();

		z1.setBnum(28);
		z1.printNum();
	}
}
