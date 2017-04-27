package com.story.spring;

public class TestClient {

	public static void main(String[] args) throws Exception{
		
		CarMaker maker = new KiaMaker();
		
		OrderManager manager = new OrderManager();
		manager.setMaker(maker);
		manager.order();
		
		
		
	}
	
	
}
