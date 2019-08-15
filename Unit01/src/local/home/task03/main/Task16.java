package local.home.task03.main;

//Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10)

public class Task16 {
	public static void main(String[] args) {
		long a=1+2;
		long p =a;
		long i=2;

		do {
			System.out.println(p);
		i=i+1;								//3		4		5
		a=a+i;								//6		10		15
		p=(p*a);							//18	180		2700
	}while (i <= 10);
	}
}
