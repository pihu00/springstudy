package com.story.spring;

public class HyundaiMaker implements CarMaker{

	@Override
	public Car sell(Money money) {
		
		System.out.println("KiaMaker.sell : I got " + money.getAmount());
		
		Car car = new Car("Pride");
		
		System.out.println("KiaMaker.sell : I made " + car.getName());
		System.out.println("KiaMaker.sell : I sold " + car.getName());
		
		return car;
	}
	
	
}
