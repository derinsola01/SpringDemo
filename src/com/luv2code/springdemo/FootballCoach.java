package com.luv2code.springdemo;

public class FootballCoach implements Coach {
	
	// define a private field for the dependency
	private FortuneService fortuneService;
	
	// define a constructor for the dependency injection
	public FootballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		return "Practice free-kicks for 2hrs today";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
