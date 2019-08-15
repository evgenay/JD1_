package local.home.task02.main;

/*
 * Найти max{min(a, b), min(c, d)}
 */
public class Task27 {
	public static void main(String[] args) {
		int a = 9;
		int b = 8;
		int c = 5;
		int d = 4;
		int res;
				
		res = Math.max((Math.min(a, b)), Math.min(c, d));
		System.out.println("Результат  = " + res);
	}

}
