package com.work.static_test;

public class StaticTest {
	
	// class 멤버변수(static)
	public static String classTitle = "빅데이터과정";
	
	// instance 멤버변수
	public String instanceTitle = "자바프로그래밍";
	
	public static void main(String[] args) {
		System.out.println(classTitle); // static 멤버는 그냥 사용 가능
		
//		System.out.println(instanceTitle); // error Cannot make a static reference to the non-static field instanceTitle
		StaticTest test = new StaticTest();  // 하지만 인스턴스는 객체 생성하고 사용해 
		System.out.println(test.instanceTitle);
		
		System.out.println(Math.random());
		System.out.println(Math.random() * 10);
		System.out.println((int)(Math.random() * 10));
		System.out.println(Math.PI);
	}
	
	public void instanceMethod() {
		System.out.println(instanceTitle);
	}
		
		
	
	
	// static 멤버변수, instance 멤버변수 테스트
	public static void main1(String[] args) {
		System.out.println();
		SimpleMember dto1 = new SimpleMember();
		SimpleMember dto2 = new SimpleMember();
		
		dto1.classCount = 1000;
		dto1.instanceCount = 100;
		
		dto2.classCount = 2000;
		dto2.instanceCount = 200;
		
		SimpleMember.classCount = 5000;
		
		System.out.println(dto1.classCount);
		System.out.println(dto1.instanceCount);
		
		System.out.println();
		System.out.println(dto2.classCount);
		System.out.println(dto2.instanceCount);
		
		System.out.println();
		System.out.println(SimpleMember.classCount);
	}

}
