package com.honor.bonus.calc.impl;

import org.springframework.stereotype.Component;

import com.honor.bonus.calc.Bonus;

@Component
public class CalcuatingBonus implements Bonus {

	@Override
	public  int getYearlyBonus(int rate, int pay) {
		return (rate*pay)/100;
	}

	public static void main (String args[])
	{
		CalcuatingBonus cb = new CalcuatingBonus();
		//based upon the employee passed, it will call manager or developer
		int bonusCalcualted = cb.getYearlyBonus(25,  26);
		System.out.println("Value of the Bonus calculated" + bonusCalcualted);
		
	}
}
