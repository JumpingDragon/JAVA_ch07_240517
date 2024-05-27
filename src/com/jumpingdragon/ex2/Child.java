package com.jumpingdragon.ex2;

public class Child extends Parent{

	private int studentNo;
	
	public Child(String name, int studentNo) {
		super("홍길동"); // 부모클래스에 기본 생성자가 없으면 부모클래스의 생성자를 반드시 호출해줘야 한다.
		this.name = name;
		this.studentNo = studentNo;
	}
	
	// 아니면, 부모 클래스에 기본생성자가 없으면 자식클래스에서 새로운 생성자를 만들 수가 없다.
	
}
