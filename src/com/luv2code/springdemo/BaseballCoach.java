package com.luv2code.springdemo;

 
public class BaseballCoach implements Coach {
	
	// define a private field for the dependency
	private FortuneService fortuneService;	
	private myFotuneServiceImpl myFortuneServiceImplementator;
	
	
	
	public BaseballCoach() {
		
	}

	// define a constructor for the dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	public BaseballCoach(myFotuneServiceImpl fortuneServiceImplementator) {
		myFortuneServiceImplementator = fortuneServiceImplementator;
	}

	@Override
	public String getDailyFortune() {
		// use a fortuneService to get a fortune
		
		// returns the same fortune 
//		return fortuneService.getFortune();
		
		// returns random fortune
		return myFortuneServiceImplementator.getFortune();
	}

	@Override
	public String getDailyWorkOut() {
		return "Spend 30 minutes on batting practice";
	}
	
	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public myFotuneServiceImpl getMyFortuneServiceImplementator() {
		return myFortuneServiceImplementator;
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public void setMyFortuneServiceImplementator(myFotuneServiceImpl myFortuneServiceImplementator) {
		this.myFortuneServiceImplementator = myFortuneServiceImplementator;
	}

}
