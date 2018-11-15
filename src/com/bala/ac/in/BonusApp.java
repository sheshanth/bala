package com.bala.ac.in;

import org.springframework.context.support.ClassPathXmlApplicationContext;

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
