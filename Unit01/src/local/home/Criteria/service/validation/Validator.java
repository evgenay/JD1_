package by.tc.task01.service.validation;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria.Refrigerator;
import by.tc.task01.java.util.regex.Pattern;

public class Validator {

	public static boolean criteriaValidator(Criteria criteria) {
		String product = criteria.getGroupSearchName();

		switch (product) {
		case "Oven":
			return true;
		case "Laptop":
			return true;
		case "Refrigerator":
			return validateRefrigerator(criteria);
		case "VacuumCleaner":
			return true;
		case "TabletPC":
			return true;
		case "Speakers":
			return true;
		default:
			return false;
		}
	}

	private static boolean validateRefrigerator(Criteria criteria) {
		Map<String, String> refrParam = new HashMap<>();
		refrParam.put(Refrigerator.POWER_CONSUMPTION.toString(), "[0-9]{3,4}");
		refrParam.put(Refrigerator.WEIGHT.toString(), "[0-9]{2,3}");
		refrParam.put(Refrigerator.FREEZER_CAPACITY.toString(), "[0-9]{2,3}");
		refrParam.put(Refrigerator.OVERALL_CAPACITY.toString(), "[0-9]{2,3}");
		refrParam.put(Refrigerator.HEIGHT.toString(), "[0-9]{2,3}\\.[0-9]");
		refrParam.put(Refrigerator.WIDTH.toString(), "[0-9]{2,3}");

		Set<String> criteriakeys = criteria.getCriteria().keySet();
		for (String key : criteriakeys) {
			String regex = refrParam.get(key);
			String input = criteria.getCriteria().get(key)+"";

			if (!Pattern.matches(regex, input)) {
				return false;
			}
		}
		return true;
	
	}
}
