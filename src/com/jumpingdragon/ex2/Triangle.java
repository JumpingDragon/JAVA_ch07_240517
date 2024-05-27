package com.jumpingdragon.ex2;

public class Triangle extends Shape{ //Shape 클래스를 상속받음
	
	@Override // annotation 이라고 하는데, 명시하게 됨.
	public void areaPrint() { // 오버라이딩 -> 삼각형 넓이 출력
		System.out.println(width * height * 0.5);
		//super.areaPrint() 이건 부모의 메서드를 그대로 쓰겠다는 것.
	}

//	@Override
//	public void namePrint() { 
//		// TODO Auto-generated method stub
//		//System.out.println("도형이름:Triangle");
//		super.namePrint();
//	} 
	
	
}
