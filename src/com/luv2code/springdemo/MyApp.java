package com.luv2code.springdemo;

public class MyApp {

	public static void main(String[] args) {
		
		Coach theCoach = new FootballCoach();
		Coach secondCoach = new BaseballCoach();
		System.out.println(theCoach.getDailyWorkOut());
		System.out.println(secondCoach.getDailyWorkOut());

	}

}
