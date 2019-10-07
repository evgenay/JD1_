package by.tc.task01.service.validation;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria.Refrigerator;
import by.tc.task01.java.util.regex.Pattern;

public class Validator {
	
	public static <E> boolean criteriaValidator(Criteria<E> criteria) {
		String product = criteria.getGroupSearchName();

	switch (product) {
	case "Oven":
	    return true;
	case "VacuumCleaner":
	    return true;
	case "Laptop":
	    return true;
	case "Speakers":
	    return true;
	case "Refrigerator":
            return validateRefrigerator(criteria);
	case "TabletPC":
	    return true;
	default:
	    return false;
	}
  }

//you may add your own new classes
