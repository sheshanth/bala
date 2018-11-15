package com.bala.ac.in;

import org.springframework.stereotype.Component;

@Component
public class ManagerBonus implements Bonus {

	@Override
	public int getYearlyBonus() {
		return 100;
	}

}
