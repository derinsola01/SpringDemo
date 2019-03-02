package com.luv2code.springdemo;

import java.util.Random;

public class myFotuneServiceImpl implements FortuneService {

	String[] fortuneArray = {"It's gonna be a great day!", "Today is your lucky day!", "Go forth and conquer!"};
	
	@Override
	public String getFortune() {
		Random rand = new Random();
		int index = rand.nextInt(fortuneArray.length);
		return fortuneArray[index];
	}

}
