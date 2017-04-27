package com.story.annotation;


// VO 는 일반적으로 빈에 등록해 놓고 사용하지 않는다.
// Mutable Class : 상태값이 변하는 클래스.
public class Car {

	
	private String name;

	public Car(){}
	
	
	public Car(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
