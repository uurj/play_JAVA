package com.work.final_test;

public class FinalTest {

}

//class A extends String {
	
//}

class B {
	public void doA() {
		System.out.println("A");
	}
	
	public final void doB() {
		System.out.println("B");
	}
	
}

class C extends B {
	public int count = 100;
	
	// 상수 선언 방법
	public static final int MAX_COUNT = 30;
	
	@Override
	public void doA() {
		count = 200;
		//MAX_COUNT = 500; //The final field C.MAX_COUNT cannot be assigned
		System.out.println("자식에서 재정의 변경합니다");
	}
	
	
//	@Override
//	public void doB() {
//		System.out.println("자식에서 재정의 변경합니다.");
//	}
}