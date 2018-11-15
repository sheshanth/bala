package com.honor.bonus.calc.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.honor.bonus.calc.Bonus;
import com.honor.bonus.calc.Employee;

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
		return theBonus.getYearlyBonus(15, 100000);
	}

}
