package local.home.task03.main;

/*Вывести на экран соответствий между символами и их 
 * численными обозначениями в памяти компьютера (Таблицу ASCII).
 */

public class Task26 {
	public static void main(String[] args) {

		for (int i = 33; i < 127; i = i + 1) {
			System.out.println("Символ =  " + (char) i + "  численнное обозначение = " + i);
		}
	}

}
