package com.jumpingdragon.ex;

public class Car {
	
	String modelName; // 모델명
	int modelYear; //년식
	String horsePower; // 마력
	String color; //차색깔
	
	public void printModel() {
		System.out.println("자동차 모델명:"+ this.modelName);
	}

	public Car() {
		System.out.println("Car 부모 클래스 생성자 호출됨!!");
	}

	public Car(String modelName, int modelYear, String horsePower, String color) {
		super();
		this.modelName = modelName;
		this.modelYear = modelYear;
		this.horsePower = horsePower;
		this.color = color;
	}
	
	
	
}
