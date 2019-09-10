package local.home08task05.main;

public class Main {
	public static void main(String[] args) {

		Counter d = new Counter(15, 20, 10);

		System.out.println("Текущее значение счётчика: " + d.getDigital());
		System.out.println("Максимальный диапазон значения счётчика:" + d.getMaxDigital());
		System.out.println("Минимальный диапазон значения счётчика:" + d.getMinDigital());
		
		CounterLogic.getDiap(d);
	}
}
