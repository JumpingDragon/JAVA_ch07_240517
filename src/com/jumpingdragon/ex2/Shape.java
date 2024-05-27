package com.jumpingdragon.ex2;

public class Shape {
	
	int width=10;  // 가로길이
	int height=10;  // 세로길이
	
	public void areaPrint() {
		System.out.println(this.width * this.height);
	}
	
	public final void namePrint() { // final 키워드가 메소드 선언에 추가되면 해당 메소드는 오버라이딩(자식클래스에서 수정) 불가!
		System.out.println("도형이름:shape");
	}
}
