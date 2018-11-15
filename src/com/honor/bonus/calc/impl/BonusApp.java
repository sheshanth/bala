package com.honor.bonus.calc.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.honor.bonus.calc.Employee;

public class BonusApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Employee manEmp = context.getBean("manager", Employee.class);
		System.out.println("The Bonus for this Year for the " + manEmp.getDesignation() +" is " + manEmp.getBonus());
		
		Employee devEmp = context.getBean("developer", Employee.class);
		System.out.println("The Bonus for this Year for the " + devEmp.getDesignation() +" is " + devEmp.getBonus());
		
		context.close();
	}

}
