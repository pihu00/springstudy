package com.story.annotation;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Named
public class TestClient {

	@Inject
	OrderManager orderManager;
	
	public static void main(String[] args) throws Exception{
		
//		CarMaker maker = new KiaMaker();
//		
//		OrderManager manager = new OrderManager();
//		manager.setMaker(maker);
//		manager.order();
		
		// WAS 가 기동 할때 처리한다.(일반 웹 프로젝트에서는)
		ApplicationContext context = new ClassPathXmlApplicationContext("car-config-annotation.xml");
		
		
		// 어노테이션을 사용하여 di를 통해 객체를 얻는다.(일반 웹 프로젝트에서는)
		OrderManager manager = context.getBean("orderManager",OrderManager.class);
		System.out.println("manager : " +  manager);
		manager.order();
		
		System.out.println("----------------------------");
		
		
		TestClient testClient = context.getBean("testClient",TestClient.class);
		testClient.orderManager.order();
		System.out.println("---------------------------");
		
		//스프링의 싱글턴을 확인한다.
		System.out.println(manager);
		System.out.println(testClient.orderManager);
		System.out.println(context.getBean("orderManager",OrderManager.class));
		
		
	}
	
	
}
