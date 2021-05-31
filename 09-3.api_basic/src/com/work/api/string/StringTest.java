package com.work.api.string;

import java.util.StringTokenizer;

public class StringTest {
	
	
	
	//Wrapper API
	public static void main(String[] args) {
		// 실습 : 토큰링을 이용해서 숫자데이터만 추출해서 덧셈결과를 출력
		String data = "100 + 200 + 3";
		// 1. 토큰링 분리 작업 
		StringTokenizer tokenizer = new StringTokenizer(data, " + ");
		int sum = 0;
		while(tokenizer.hasMoreElements()) {
			String token = tokenizer.nextToken();
//			sum += Integer.parseInt(token);  방법1
			
//			Integer integer = new Integer(token);  방법2
//			sum += integer.intValue();
			
			sum += new Integer(token).intValue(); // 방법3
		}
		
		System.out.println("sum: " + sum);
	}
	
	
	// 문자열 토큰 테스트
	public static void main3(String[] args) {
		String data1 = "user01, password01, 홍길동, 01012341000, hong@work.com";
		String data2 = "100 + 200 * 3";
		
		// String#split()
		String[] tokens = data1.split(",");
		for (String token: tokens) {
			System.out.println(token);
		}
		
		System.out.println();
		// StringTokenizer
		StringTokenizer tokenizer = new StringTokenizer(data1, ", ");
		System.out.println(tokenizer.countTokens());
		while (tokenizer.hasMoreElements()) {
			String data = tokenizer.nextToken();
			System.out.println(data);
		}
	}
	
	
	public static void main2(String[] args) {
		// StringBuffer, StringBuilder : 가벼운 문자열
		// 반드시 new StringBuffer(), new StringBuilder() : new 키워드 이용해서 객체생성
		// StringBuffer : jdk1.0 version
		// StringBuilder : jdk1.5 version
		StringBuffer buffer = new StringBuffer("여러분");
		buffer.append("안녕하세요").append("오오");
		System.out.println(buffer);
	}

	public static void main1(String[] args) {
		// String : 불변 문자열
		String msg1 = "hello"; // heap area내에 literal pool에 들어감
		String msg2 = "hello"; // heap area내에 literal pool에 들어감 내용이 많이 변경되면 메모리 많이 잡아먹어서 이렇게 잘 안슴
		String msg3 = new String ("hello"); // heap area
		String msg4 = new String ("hello"); // heap area
		
		print("== 연산자 문자열 비교");
		System.out.println(msg1 == msg2); // true
		System.out.println(msg1 == msg3); // false 저장공간이 달라서 false 
		System.out.println(msg1 == msg4); // false
		
		print("equals() 문자열 비교");
		System.out.println(msg1.equals(msg2)); // true
		System.out.println(msg1.equals(msg3)); // true
		System.out.println(msg1.equals(msg4)); // true
		
		print("문제점?");
		for(int index = 0; index < 100; index++) {
			msg1 += index;
		}
	}

	public static void print(String msg) {
		System.out.println("\n###" + msg);
	}
}
