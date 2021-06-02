package com.work.view;

import java.util.ArrayList;

import com.work.model.dto.AdminMember;
import com.work.model.dto.GeneralMember;
import com.work.model.dto.Member;
import com.work.model.dto.SpecialMember;
import com.work.model.service.MemberService;

/**
 * <pre>
 * 회원관리시스템 테스트 클래스
 * </pre>
 * @author ParkYuJung
 * @version ver.1.0
 * @since jdk1.8
 */

public class Test {
	
	/**
	 * 회원관리시스템 테스트 메서드
	 * -- 회원등록(아이디, 비밀번호, 이름, 휴대폰, 이메일) : 사용자 입력
	 * -- service(model) : 사용자입력정보 + 시스템(가입일 현재날짜, 등급 일반회원, [+ 마일리지정책 가입시 1000]) 
	 * @param args
	 */
	public static void main(String[] args) {
		print("회원관리 서비스 이용위한 객체 생성");
		MemberService service = new MemberService();
		
		print("초기화 회원 등록 : " + service.initMember());
		
		print("회원등록");
		Member dto = new GeneralMember("아이디", "비밀번호", "이름", "휴대폰", "이메일");
		service.addMember("test01", "pass", "이재", "010-1000-2000", "ds@work.com");
		service.addMember("test02", "pass2", "이재머", "010-1000-2000", "ds@work.com");
		service.addMember("test01", "pass2", "이재", "010-1000-2000", "ds@work.com");
		
		
		print("현재 등록회원수 : " + service.getCount());
		
		print("전체회원 조회");
		ArrayList list = service.getMember();
		for (int index = 0; index < list.size(); index++) {
			System.out.println(list.get(index));
		}
		
		print("회원 상세조회 : user01");
		Member dto1 = service.getMember("user01");
		if(dto != null) {
			System.out.println(dto1);
		}
		
		print("회원 상세조회 : 신규등록 회원 test01");
		dto1 = service.getMember("test01");
		if(dto != null) {
			System.out.println(dto1);
		}
		
	
		print("user01 전체정보 변경");
		
		//dto = new GeneralMember("user01", "", ""); 이런식으로도 가능
		dto = service.getMember("user01");  // 이건 정보가져오기
		
		print("변경전 user01 정보 : " + dto1);
		
		// 변경하고자하는 속성 setter 이용해서 변경
		dto.setName("김은경");
		dto.setMemberPw("passwordmodify");
		dto.setMobile("010-5169-1154");
		
		// 변경수행
		boolean result = service.setMember(dto1);
		
		dto1 = service.getMember("user01");
		print("변경후 user01 정보 : " + dto);
				
		System.out.println();
		// 변경객체 : 없는 아이디 회원 변경
		dto = new GeneralMember("xxx", "password01", "홍길동", "01012341000", "user01@work.com", "2020-12-15", "G", 5000);
		result = service.setMember(dto);
		if (result) {
			System.out.println(dto = service.getMember("xxx"));
		} else {
		System.out.println("해당아이디의 회원정보가 존재하지 않습니다.");
		
		// 비밀번호 변경
		print("비밀번호 변경전 조회 : ");
		dto = service.getMember("user02"); 
		System.out.println(dto);
		
		System.out.println();
		//비밀번호 변경 : valid, invalid
		service.setMemberPw("user02", "password", "doo");		
		if (result) {
			System.out.println("비밀번호 변경이 정상처리 되었습니다.");
		} else {
			System.out.println("[오류] 회원의 정보를 다시 확인하시기 바랍니다.");
		}
		
		System.out.println();
		dto = service.getMember("user02");
		System.out.println(dto);
		
		print("user01");
		dto = service.removeMember("user03");
		if (dto != null) {
			System.out.println("[탈퇴성공] " + dto.getName() + "님 이용이 종료되었습니다.");
		} else {
			System.out.println("[탈퇴실패]");
		}
		}
		
	}
	
	/**
	 * 회원관리시스템 테스트 메서드
	 * @param args 시작시에 전달받은 문자열 매개변수 배열 
	 */
	public static void main1(String[] args) {
		Member dto1 = new GeneralMember("user01", "password01", "홍길동", "01012341000", "user01@work.com", "2020-12-15", "G", 5000);
		Member dto2 = new GeneralMember("user02", "password02", "강감찬", "01012342000", "user02@work.com", "2021-12-15", "G", 95000);
		Member dto3 = new SpecialMember("user03", "password03", "이순신", "01012343000", "user03@work.com", "2020-11-15", "S", "강동원");
		Member dto4 = new SpecialMember("user04", "password04", "김유신", "01012344000", "user04@work.com", "2021-01-05", "S", "김하린");
		Member dto5 = new AdminMember("user05", "password05", "유관순", "01012345000", "user05@work.com", "2020-04-01", "A", "선임");
		
		print("회원관리 서비스 이용위한 객체생성");
		MemberService service = new MemberService();
		
		print("회원등록");
		service.addMember(dto1);
		service.addMember(dto2);
		service.addMember(dto2);
		service.addMember(dto2);
		service.addMember(dto3);
		service.addMember(dto4);
		service.addMember(dto5);
		
		print("등록인원수 : " + service.getCount());
		
//		print("user01 상세조회");
//		Member dto = service.getMember("user01");
//				if (dto != null) {
//					System.out.println(dto);
//				}
//		print("user99 상세조회");
//		dto = service.getMember("user99");
//		if (dto != null) {
//			System.out.println(dto);
//		}
//		
//		print("전체조회");
//		
//		print("회원정보 전체조회");
//		
//		print("암호변경");
//		
//		print("회원탈퇴");
//		
//		print("회원전체탈퇴(배열초기화)");
//		
//		
//		print("회원 초기화 등록");
	}
	
	/**
	 * 테스트출력 간략화 메서드
	 * @param message 출력 메세지 
	 */
		public static void print(String message) {
		System.out.println("\n###" + message);
	}
}	
	
