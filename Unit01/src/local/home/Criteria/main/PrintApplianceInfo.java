package by.tc.task01.main;

import by.tc.task01.entity.Appliance;

public class PrintApplianceInfo {
	
	public static void print(List<Appliance> appliances) {
		if (appliances == null) {
			System.out.println("По данным критериям товар не найден ");
		} else {
			for (Appliance appliance : appliances) {
				System.out.println(appliance.toString());
			}
		}
		System.out.println("---------------------------------");
	}
}
