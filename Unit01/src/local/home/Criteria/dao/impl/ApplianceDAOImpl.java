package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

public class ApplianceDAOImpl implements ApplianceDAO{

	@Override
	public <E> Appliance find(Criteria<E> criteria) {
		String categoryOfGoods;	
		
		categoryOfGoods = criteria.getGroupSearchName().getSimpleName();//"Oven"
		
		System.out.println("---" + categoryOfGoods);
		// you may add your own code here
		return null;
	}
	
	// you may add your own code here

}


//you may add your own new classes