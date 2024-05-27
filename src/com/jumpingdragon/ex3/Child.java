package com.jumpingdragon.ex3;

public class Child {
private String name;
	
	public Child() {
		this("홍길동"); // 생성자를 의미. 근데 잘 쓰지 않음.
		System.out.println("Child() call");
	}
	
	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
	
}
