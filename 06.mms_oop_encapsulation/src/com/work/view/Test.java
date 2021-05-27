package com.work.view;

import com.work.model.dto.Member;

public class Test {

	/* encapsulation test*/
	public static void main(String[] args) {
		Member dto = new Member("uurj", "pss", "ddu", "01064010419", "ddu@naver.com");
		System.out.println("변경전 : " + dto);
		// 아이디 변경 : 멤버변수 직접 접근 불가
		//dto.memberID = "aaa"; // 오류 : Memeber 접근권한 private 선언, 외부에서 접근불가
		
		// 아이디 변경 : setter()
		// 올바른 아이디 검증 규칙 준수
		dto.setMemberID("happ");
		dto.setMemberPw("happ");
		System.out.println("변경후 : " + dto);
		
		dto.setMemberID("a");
		System.out.println("변경후 : " + dto);
	}
	
	public static void main1(String[] args) {
		// 회원의 가입시 입력데이터 초기화생성자 이용해서 객체 생성
		// 가입 : 아이디, 비밀번호, 이름, 휴대폰, 이메일

		Member dto = new Member("uurj", "pass", "ddu", "01064010419", "ddu@naver.com");
	
		// 생성한 회원객체의 정보를 출력
		// System.out.println(참조변수명); => 참조변수명.toString() 수행결과문자열 제공
		// toString() 메서드 생략 가능
		System.out.println(dto.toString()); // 아래처럼 투스트링 생략해도 됨 
		System.out.println(dto);
	}

}
