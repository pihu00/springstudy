package com.story.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestClient {

	
	public static void main(String[] args) throws Exception{
		
//		CarMaker maker = new KiaMaker();
//		
//		OrderManager manager = new OrderManager();
//		manager.setMaker(maker);
//		manager.order();
		
		// WAS 가 기동 할때 처리한다.(일반 웹 프로젝트에서는)
		ApplicationContext context = new AnnotationConfigApplicationContext(CarConfig.class);
		
		
		// 어노테이션을 사용하여 di를 통해 객체를 얻는다.(일반 웹 프로젝트에서는)
		OrderManager manager = context.getBean("orderManager",OrderManager.class);
		System.out.println("manager : " +  manager);
		manager.order();
		
		System.out.println("----------------------------");
		
		System.out.println(manager == context.getBean("orderManager", OrderManager.class));
		
		
		System.out.println("---------------------------");
		
		
		//스프링의 싱글턴을 확인한다.
		System.out.println(context.getBean("hyundai",HyundaiMaker.class));
		System.out.println(context.getBean("kiaMotors",KiaMaker.class));
		
		
	}
	
	
}
