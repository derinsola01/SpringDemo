package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		
		//load the configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = new FootballCoach();
		Coach secondCoach = new BaseballCoach();
		
		// retrieve bean from spring container
		Coach thirdCoach = context.getBean("myCoach", BaseballCoach.class);
		
		// print outs
		System.out.println(theCoach.getDailyWorkOut());
		System.out.println(secondCoach.getDailyWorkOut());
		
		//prints out static or dynamic fortune based on configuration setting.
		System.out.println(thirdCoach.getDailyFortune());
		
		// close the context
		context.close();

	}

}
