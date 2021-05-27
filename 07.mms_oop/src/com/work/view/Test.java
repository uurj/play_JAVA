package com.work.view;

import com.work.model.dto.AdminMember;
import com.work.model.dto.GeneralMember;
import com.work.model.dto.Member;
import com.work.model.dto.SpecialMember;

public class Test {
	
	// instanceof, typecasting, virtual method invocation 테스트
	public static void main(String[] args) {
		// 회원 초기화데이터 참고로해서 회원 객체 생성 
		// 참조변수 타입은 부모객체 
		Member dto1 = new GeneralMember("user01", "password01", "홍길동", "01012341000", "user01@work.com", "2020-12-15", "G", 5000);
		System.out.println(dto1);
		
		// dto1.getMileage(); => error : 부모타입의 참조변수는 자식의 멤버에 접근 불가
		
		// 실제 메모리에 생성된 자식객체 타입으로 형변환 => 실제 자식객체의 맴버에게 졉근 가능
		GeneralMember g1 = (GeneralMember)dto1; 
		System.out.println(g1);
		
		// 형변환하기전에 해당 클래스의 객체(instanceof) 여부 체킹
		if(dto1 instanceof AdminMember) {
			// 컴파일 ok : 문법체크
			AdminMember a1 = (AdminMember)dto1; // 실행에러 발생 
			a1.getPosition();
		} else {
			System.out.println("[오류] 해당 클래스의 인스턴스가 아닙니다.");
		}		
//		Member dto1 = new GeneralMember("user01", "password01", "홍길동", "01012341000", "user01@work.com", "2020-12-15", "G", 5000);
		Member dto2 = new GeneralMember("user02", "password02", "강감찬", "01012342000", "user02@work.com", "2021-12-15", "G", 95000);
		Member dto3 = new SpecialMember("user03", "password03", "이순신", "01012343000", "user03@work.com", "2020-11-15", "S", "강동원");
		Member dto4 = new SpecialMember("user04", "password04", "김유신", "01012344000", "user04@work.com", "2021-01-05", "S", "김하린");
		Member dto5 = new AdminMember("user05", "password05", "유관순", "01012345000", "user05@work.com", "2020-04-01", "A", "선임");
		
	}
	
	
	//재정의 테스트
	public static void main2(String[] args) {
		Member dto1 = new Member("user01", "password01", "홍길동", "01064011234", "demail");
		System.out.println(dto1); 
		// toString재정의 하지 않은 경우 : com.work.model.dto.Member@26f0a63f

		//일반회원객체 생성
		Member dto2 = new GeneralMember("user02", "password01", "홍길동", "01064011234", "demial");
		System.out.println(dto2);
	}
	
	// 부모타입의 다형성 : 모든 자식객체를 참조(저장) 가능
	public static void main1(String[] args) {
	
		// ok : 같은 타입이라 할당 가능 멤버라는 기억공간에 멤버를 담는것... 자동할당됨 : 다형성 변수타입
		Member dto1 = new Member();
	
		// ok : 부모타입(상속) : 큰타입이라는 얘기
		Member dto2 = new GeneralMember(); 
		
		// ok 
		Member dto3 = new SpecialMember();
		
		// error : 다른타입, 작은(자식)타입, 즉 부모객체를 자식객체에 저장(참조)불가
		// GeneralMember dto4 = new Member();
		
		// error : 다른타입, 상속구조도 아님. 자식들임 
		// GeneralMember dto5 = new AdminMember();
		
		
	}
}
