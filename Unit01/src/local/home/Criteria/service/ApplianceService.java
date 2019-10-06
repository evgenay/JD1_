package by.tc.task01.service;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

public interface ApplianceService {	
	
	 @Override
    public List<Appliance> find(Criteria criteria) {
	if (!Validator.criteriaValidator(criteria)) {
	    return null;
	}
	
	DAOFactory factory = DAOFactory.getInstance();
	ApplianceDAO applianceDAO = factory.getApplianceDAO();

	List<Appliance> appliance = null;
	try {
	    appliance = applianceDAO.find(criteria);
	} catch (DAOException e) {
	    e.printStackTrace();
	}

	return appliance;
    }
	
}
