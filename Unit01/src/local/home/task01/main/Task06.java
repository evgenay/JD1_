package local.home.task01.main;

/*В n малых бидонах 80 л молока. Сколько литров молока в m больших бидонах,
*если в каждом большом бидоне на 12 л. больше, чем в малом?*/

public class Task06 {
	public static void main(String[] args) {
		int n = 8;
		int x = 80;
		int m = 6;
		System.out.println("Количество малых бидонов = " + (n));
		System.out.println("Количество литров в малых бидонах = " + (x));
		System.out.println("Количество больших бидонов = " + (m));

		System.out.println("Количество литров в одном малом бидоне = " + (x / n));
		System.out.println("Литров молока в больших бидонах = " + (12 + x) * m);

	}

}
