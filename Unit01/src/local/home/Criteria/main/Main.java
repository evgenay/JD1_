package by.tc.task01.main;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

public class Main {
	public static void main(String[] args) {
	List<Appliance> appliance;

	ServiceFactory factory = ServiceFactory.getInstance();
	ApplianceService service = factory.getApplianceService();

	Criteria criteriaRefrigerator = new Criteria(Refrigerator.class.getSimpleName());
	criteriaRefrigerator.add(Refrigerator.FREEZER_CAPACITY.toString(), 10);
	appliance = service.find(criteriaRefrigerator);
	PrintApplianceInfo.print(appliance);
	
	criteriaRefrigerator.add(Refrigerator.FREEZER_CAPACITY.toString(), 15);
	appliance = service.find(criteriaRefrigerator);
	PrintApplianceInfo.print(appliance);
	
	criteriaRefrigerator = new Criteria(Refrigerator.class.getSimpleName());
	criteriaRefrigerator.add(Refrigerator.HEIGHT.toString(), 10);
	appliance = service.find(criteriaRefrigerator);
	PrintApplianceInfo.print(appliance);
 	}
}
