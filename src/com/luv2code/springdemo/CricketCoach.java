package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	public CricketCoach () {
		
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	@Override
	public String getDailyWorkOut() {
		return "Practice fast bowling for 15 minutes";
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}
	
	public String getTeam() {
		return team;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public void setTeam(String team) {
		this.team = team;
	}

}
