package com.honor.bonus.calc.impl;

import org.springframework.stereotype.Component;

import com.honor.bonus.calc.Bonus;

@Component
public class DeveloperBonus implements Bonus {

	@Override
	public int getYearlyBonus(int rate, int pay) {
		return (rate*pay)/100;
	}

}
