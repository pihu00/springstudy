package com.story.javaconfig;


import org.springframework.stereotype.Service;

/**
 *	클래스의 용도를 구분하기 쉽게 @Component 를 확장해서 새로운 어노테이션을 만들었다. 
 *	// ID 를 지정하지 않는 경우 클래스이름을 id로 사용한다. 단 id는 소문자로 시작한다.
 */
@Service
public class OrderManager {
//
	private CarMaker maker;
	
	public OrderManager(CarMaker maker){ //현대메이커 기아메이커 두개가 자료형으로 존재하므로 명시적으로 해줄때 사용
		this.maker = maker;
		System.out.println("OrderManager default Construct");
	}
	

	public void order(){
		
		Money money = new Money(1000);
		
		System.out.println("OrderManager.order : I made " + money.getAmount());
		System.out.println("OrderManager.order : I payed " + money.getAmount());
		Car car = maker.sell(money);
		System.out.println("OrderManager.order : I received  " + car.getName());
		
	}

//	public void setMaker(CarMaker maker) {
//		this.maker = maker;
//	}
	

	
	public void init(){
		
		System.out.println("OrderManager.init called !!!");
	}
	
	
}
