package com.honor.bonus.calc.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.honor.bonus.calc.Bonus;
import com.honor.bonus.calc.Employee;

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
		return thebonus.getYearlyBonus(10,50000);
	}

}
