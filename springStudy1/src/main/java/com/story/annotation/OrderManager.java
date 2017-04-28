package com.story.annotation;


import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *	클래스의 용도를 구분하기 쉽게 @Component 를 확장해서 새로운 어노테이션을 만들었다. 
 *	// ID 를 지정하지 않는 경우 클래스이름을 id로 사용한다. 단 id는 소문자로 시작한다.
 */
@Service
public class OrderManager {
//
//	@Inject
//	@Named("hyundai")
//	@Autowired
//	@Qualifier("hyundai")
	@Resource(name="hyundai")
	private CarMaker maker;
	
	// 자료형 > 아이디로 찾아서 주입
	// @Resource 와 같은 의미 (메소드의 파라미터에 주입) -> carmaker를 자료형으로 가진 것을 찾아서 주입시킴
//	@Autowired // 필드변수, 생성자, 메소드에 사용이 가능하다.
//	public OrderManager(@Qualifier("hyundai") CarMaker maker){ //현대메이커 기아메이커 두개가 자료형으로 존재하므로 명시적으로 해줄때 사용
//		this.maker = maker;
//		System.out.println("OrderManager default Construct");
//	}
	
	
	public void order(){
		
		Money money = new Money(1000);
		
		System.out.println("OrderManager.order : I made " + money.getAmount());
		System.out.println("OrderManager.order : I payed " + money.getAmount());
		Car car = maker.sell(money);
		System.out.println("OrderManager.order : I received  " + car.getName());
		
	}

	// 아이디가 우선 순위로 찾음.
	// 아아디 > 자료형 순서로 찾아서 주입.
	// Resource 는 해당 name의 빈을 현 메소드의 파라미터로 넣어달라는 얘기(생성자에서는 사용이 불가능 하다.)
//	@Resource(name="kia")
//	public void setMaker(CarMaker maker) {
//		this.maker = maker;
//	}
	

	
	// 객체가 빈으로 등록된 다음에 초기화 작업을 위한 메소드
	@PostConstruct// == init-method="init"
	public void init(){
		
		System.out.println("OrderManager.init called !!!");
	}
	
	
}
