package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// load the Spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		// retrieve bean from spring container Singleton Test
		Coach testCoach1 = context.getBean("coach1", Coach.class);
		Coach testCoach2 = context.getBean("coach1", Coach.class);
		
		// retrieve bean from spring container Prototype Test
		Coach testCoach3 = context.getBean("coach2", Coach.class);
		Coach testCoach4 = context.getBean("coach2", Coach.class);
		
		// check if they are the same
		boolean result = (theCoach == alphaCoach);
		boolean resultCoach1 = (testCoach1 == testCoach2);
		boolean resultCoach2 = (testCoach3 == testCoach4);
		
		//print out results
		System.out.println("\nPointing to the same object: " + result);
		System.out.println("\nMemory location for theCoach: " + theCoach);
		System.out.println("\nMemory location for alphaCoach: " + alphaCoach);
		
		//print out Singleton test results
		System.out.println("\nPointing to the same object: " + resultCoach1);
		System.out.println("\nMemory location for theCoach: " + testCoach1);
		System.out.println("\nMemory location for alphaCoach: " + testCoach2);
		
		//print out Prototype test results
		System.out.println("\nPointing to the same object: " + resultCoach2);
		System.out.println("\nMemory location for theCoach: " + testCoach3);
		System.out.println("\nMemory location for alphaCoach: " + testCoach4);
				
				
		//close the context
		context.close();
	}

}
