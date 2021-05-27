package com.work.view;

import com.work.model.dto.AdminMember;
import com.work.model.dto.GeneralMember;
import com.work.model.dto.SpecialMember;

public class Test {
	public static void main(String[] args) {
		//일반회원 자식객체 생성 절차 : 부모가 먼저 메모리할당 받고 -> 자식이 메모리할당 받음
		GeneralMember g1 = new GeneralMember("일반아이디", "password01", "홍길동", "01012341000", "user@wor.com"); 
		SpecialMember g2 = new SpecialMember ("u우수아이디", "password01", "박유정", "01012341000", "user@wor.com"); 
		AdminMember g3 = new AdminMember ("관리자아이디", "password01", "원빈", "01012341000", "user@wor.com"); 
		
		System.out.println(g1.getMemberID()); // Member 부모로부터 상속받은 메서드
		System.out.println(g1.getName());
		System.out.println(g2.getName());
		System.out.println(g3.getName());
	}
	

}
