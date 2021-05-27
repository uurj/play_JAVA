/**
 * 
 */
package com.work.model.service;

import com.work.model.dto.AdminMember;
import com.work.model.dto.GeneralMember;
import com.work.model.dto.Member;
import com.work.model.dto.SpecialMember;

/**
 * <pre>
 * 회원관리 기능(서비스) 목록
 * -- 회원들을 관리하기 위한 자료저장구조 : 배열 다형성 반영(부모타입)
 * -- 메서드 아규먼트 다형성(부모타입), 반환타입은 무엇으로 할건지??
 * 
 * -- 메서드명(매개변수) : 반환타입
 * 
 * -- C(등록) 
 * -- R(조회)
 * => 단일조회(상세조회) => 아이디받기
 * => 다중조회(전체조회, 그룹조회) => 전체조회(), 등급별회원전체조회(등급) 
 * -- U(변경)
 * => 전체변경()
 * => 부분변경(비밀번호변경)
 * -- D(삭제)
 * => 전체삭제
 * => 특정삭제 : 아이디 
 * </pre>
 * 
 * @author ParkYuJung
 * @version ver.1.0
 * @since jdk.1.8
 */
public class MemberService {
	
	/** 
	 * 회원들을 관리하기 위한 자료저장구조 : 배열 다형성 반영(부모타입) 
	 */
	private MemberService[] members;
	
	
	/**
	 * 회원등록
	 * -- 메서드명
	 * -- 매개변수
	 * -- 반환타입
	 */
	
	/**
	 * 전체조회
	 * -- 메서드명
	 * -- 매개변수
	 * -- 반환타입 
	 */
	public void printMemberInfo() {
		
	}
	
	
	
	/** 초기회원 등록 메서드 */
	public void initMember() {
		Member dto1 = new GeneralMember("user01", "password01", "홍길동", "01012341000", "user01@work.com", "2020-12-15", "G", 5000);
		Member dto2 = new GeneralMember("user02", "password02", "강감찬", "01012342000", "user02@work.com", "2021-12-15", "G", 95000);
		Member dto3 = new SpecialMember("user03", "password03", "이순신", "01012343000", "user03@work.com", "2020-11-15", "S", "강동원");
		Member dto4 = new SpecialMember("user04", "password04", "김유신", "01012344000", "user04@work.com", "2021-01-05", "S", "김하린");
		Member dto5 = new AdminMember("user05", "password05", "유관순", "01012345000", "user05@work.com", "2020-04-01", "A", "선임");
		}
	
	
	private String info;
	
	/** 로그인 기능 */
	public void login(String memberID, String memberPw) {
		return;
	}
	
	/**가입 기능 */
	public void join(String memberID, String memberPw, String name, String mobile, String email) {
			return;
		}
	
	/** 내정보조회 */	
	public String getInfo() {
		return info;
	}
	
	/** 비밀번호변경 */
	public void modifyPw(String memberPw) {
		return;
	}
	
	/** 내정보전체변경 */
	public void modifyAll(String memberID, String memberPw, String name, String mobile, String email) {
		return;
	}
	
	/** 아이디찾기 ?*/
	public void id(String mobile) {
		return;
	}
	
	/** 비밀번호찾기 ?*/
	public void pw(String memberID) {
		return;
	}
}	
