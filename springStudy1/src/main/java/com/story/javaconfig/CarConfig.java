package com.story.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component
public class CarConfig {

	//빈 id를 지정해서 사용한다.
	@Bean(name="hyundai")
	public CarMaker hyundaiMaker(){
		
		CarMaker maker = new HyundaiMaker();
		return maker;
	}
	
	// id를 생략하면 메소드명을 id로 사용한다.
	@Bean
	public CarMaker kiaMotors(){
		
		CarMaker maker = new KiaMaker();
		return maker;
	}
	
	// @PostConstruct 어노테이션을 해당 메소드에 설정해서 사용해도 된다.
	@Bean(initMethod="init")
	public OrderManager orderManager(){
		OrderManager manager = new OrderManager(kiaMotors());
		
		return manager;
	}
	
}
