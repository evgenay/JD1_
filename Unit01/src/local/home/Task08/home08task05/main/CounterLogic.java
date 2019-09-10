package local.home08task05.main;

public class CounterLogic {
	public static void getDiap(Counter d) {
		if ((d.getMinDigital() <= d.getDigital()) && (d.getMaxDigital() >= d.getDigital())
				&& (d.getMinDigital() < d.getMaxDigital())) {
			System.out.println("Значение счетчика находятся в указанном диапазоне");
			System.out.println("Значение счетчика увеличено на 1 = "+(d.getDigital() + 1));
			System.out.println("Значение счетчика уменьшено на 1 = "+(d.getDigital() - 1));
		} else {
			System.out.println("Значение счетчика за пределами указанного диапазона");
		}
	}
}
