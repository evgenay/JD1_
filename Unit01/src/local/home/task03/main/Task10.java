package local.home.task03.main;

import java.math.BigInteger;

// Составить программу нахождения произведения квадратов первых двухсот чисел

public class Task10 {
	public static void main(String[] args) {

		BigInteger sum = BigInteger.valueOf(1);

		for (int i = 1; i <= 200; i++) {

			sum = sum.multiply(BigInteger.valueOf(i * i));
		}
		System.out.println("Произведения квадратов первых двухсот чисел = " + sum + "  ");
	}

}
