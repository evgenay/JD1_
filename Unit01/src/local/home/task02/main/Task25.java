package local.home.task02.main;

/*Написать программу — модель анализа пожарного датчика в помещении,
 *  которая выводит сообщение «Пожароопасная ситуация », 
 *  если температура в комнате превысила 60° С.
 */

public class Task25 {
	public static void main(String[] args) {
		int t = 70;

		if (t >= 60) {
			System.out.println("Пожароопасная ситуация");
		} else {
			System.out.println("Температура в норме");
		}
	}

}
