package com.story.annotation;
import org.springframework.stereotype.Component;


/**
 *	@Component("hyundai")
 *  == 
 *	<bean id="hyundai" class="com.story.annotation.HyundaiMaker"/>
 *
 */
@Component("hyundai")
public class HyundaiMaker implements CarMaker{

	@Override
	public Car sell(Money money) {
		
		System.out.println("HyundaiMaker.sell : I got " + money.getAmount());
		
		Car car = new Car("Pride");
		
		System.out.println("HyundaiMaker.sell : I made " + car.getName());
		System.out.println("HyundaiMaker.sell : I sold " + car.getName());
		
		return car;
	}
	
	
}
