package com.bala.ac.in;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Manager implements Employee {

	@Autowired
	@Qualifier("managerBonus")
	public Bonus theBonus;
	
	@Override
	public String getDesignation() {
		return "Manager";
	}

	@Override
	public int getBonus() {
		return theBonus.getYearlyBonus();
	}

}
