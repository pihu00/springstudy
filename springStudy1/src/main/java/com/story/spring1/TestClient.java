package com.story.spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClient {

	public static void main(String[] args) throws Exception{
		
//		CarMaker maker = new KiaMaker();
//		
//		OrderManager manager = new OrderManager();
//		manager.setMaker(maker);
//		manager.order();
		
		// WAS 가 기동 할때 처리한다.(일반 웹 프로젝트에서는)
		ApplicationContext context = new ClassPathXmlApplicationContext("car-config.xml");
		
		
		// 어노테이션을 사용하여 di를 통해 객체를 얻는다.(일반 웹 프로젝트에서는)
		OrderManager manager = context.getBean("manager",OrderManager.class);
		System.out.println("manager : " +  manager);
		manager.order();
		
	}
	
	
}
