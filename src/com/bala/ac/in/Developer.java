package com.bala.ac.in;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Developer implements Employee {

	@Autowired
	@Qualifier("developerBonus")
	public Bonus thebonus;
	
	@Override
	public String getDesignation() {
		return "Developer";
	}

	@Override
	public int getBonus() {
		return thebonus.getYearlyBonus();
	}

}
