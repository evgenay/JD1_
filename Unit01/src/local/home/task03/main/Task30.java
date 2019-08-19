package local.home.task03.main;

import java.util.Scanner;

//Написать программу, переводящую римские цифры в арабские.


public class Task30 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите  один символ и нажмите Enter > ");
		char sim = sc.next().charAt(0);
		int x=0;
		switch (sim) {
		case 'I': x= 1;
		break;
		case 'V': x=5;
		break;
		case 'X': x=10;
		break;
		case 'L': x=50;
		break;
		case 'C': x=100;
		break;
		case 'D': x=500;
		break;
		case 'M': x=1000;
			
		}
		System.out.println("Арабская цифра =  "+x);
			
	}

}
