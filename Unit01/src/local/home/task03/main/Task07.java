package local.home.task03.main;

//Вычислить значения функции на отрезке [а,b] c шагом h:

public class Task07 {
	public static void main(String[] args) {
		int a = 4;
		int b = 12;
		int h = 1;
		int x;
		int y;
		
		x=a;
		while (x<=2) {
				if(x<=b) {
					y=-x;
					System.out.println("x = " + x +" y = "+y);
					x=x+h;
				}
		}
		while (x<=b) {
			y=x;
		
			System.out.println("x = " + x +" y = "+y);
			x=x+h;
		}

	}

}