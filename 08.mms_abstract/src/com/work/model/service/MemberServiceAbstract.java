package com.work.model.service;

import com.work.model.dto.AdminMember;
import com.work.model.dto.GeneralMember;
import com.work.model.dto.Member;
import com.work.model.dto.SpecialMember;

/**
 * <pre>
 * 회원을 관리하기 위한 서비스 클래스 (추상클래스 설계 변경)
 * -- 추상클래스 구성요소
 * >> 클래스 구성요소 + [추상메서드] 
 * 
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
public abstract class MemberServiceAbstract {
	
	/** 
	 * 회원들을 관리하기 위한 자료저장구조 : 배열 다형성 반영(부모타입) 
	 */
	private Member[] members = new Member [10];
	
	/** 등록인원수 및 등록될 배열요소 위치 정보 */
	private int count;
	
	
	/** 
	 * 현재 등록 인원수 조회
	 * @return 현재 등록 인원수
	 */
	public int getCount() {
		return count;
	}
	
	
	/**
	 * 회원등록
	 * -- 메서드명
	 * -- 매개변수 : ?? 다형성반영해서 모든회원을 등록하기위한 메서드
	 * -- 반환타입
	 */
	public abstract void addMember(Member dto);
	
	/**
	 * CRUD 메서드에서 사용할 회원 존재유무 및 저장 위치 조회 메서드
	 * @param memberID 아이디
	 * @return 존재시 저장위치번호, 미존재시 -1
	 */
	public abstract int exist(String memberID);
	
	/**
	 * 상세조회
	 * -- 메서드명 : getMember()
	 * -- 매개변수 : memberID
	 * -- 반환타입 : Member (반환타입다형성 : 부모타입) 
	 */
	public abstract Member getMember(String memberID); 
	
	/**
	 * 전체조회
	 * -- 메서드명 : getMember()
	 * -- 매개변수 : no argument
	 * -- 반환타입 : 현재 등록된 모든 회원들의 정보만을 저장한 배열, 다형성반영해서 Member타입의 배열로
	 */
	public abstract Member getMember();
	
	/**
	 * 회원정보 전체변경
	 * -- 메서드명 : setMember()
	 * -- 매개변수 : Member
	 * -- 반환타입 : void / 오류발생시 메세지 처리
	 */
	public abstract void setMember(Member dto);
	
	/**
	 * 회원 비밀번호 변경
	 * -- 메서드명 : setMemberPw()
	 * -- 매개변수 : memberID memberPw 아이디, 비밀번호, 변경비밀번호
	 * -- 반환타입 : boolean 암호변경성공 true, 실패하면 false 
	 */
	public abstract boolean setMemberPw(String memberID, String memberPw, String modifyPw);
	
	/**
	 * 회원 탈퇴
	 * null값을 주면 삭제됨, ㅋㅏ운트도 1감소시켜 그리고 맨마지막에 저장됏던걸 탈퇴한자리에 옮겨
	 * -- 메서드명 : removeMember()
	 * -- 매개변수 : 아이디, 비밀번호
	 * -- 반환타입 : void
	 */
	public abstract void removeMember(String memberID, String memberPw);
	
	/**
	 * 회원전체탈퇴
	 * -- 메서드명 : removeMember()
	 * -- 매개변수 : no argument
	 * -- 반환타입 : void 
	 */
	public abstract void removeMember();
	
	
	/** 초기회원 등록 메서드 */
	public void initMember() {
		Member dto1 = new GeneralMember("user01", "password01", "홍길동", "01012341000", "user01@work.com", "2020-12-15", "G", 5000);
		Member dto2 = new GeneralMember("user02", "password02", "강감찬", "01012342000", "user02@work.com", "2021-12-15", "G", 95000);
		Member dto3 = new SpecialMember("user03", "password03", "이순신", "01012343000", "user03@work.com", "2020-11-15", "S", "강동원");
		Member dto4 = new SpecialMember("user04", "password04", "김유신", "01012344000", "user04@work.com", "2021-01-05", "S", "김하린");
		Member dto5 = new AdminMember("user05", "password05", "유관순", "01012345000", "user05@work.com", "2020-04-01", "A", "선임");
		}
	
	
}