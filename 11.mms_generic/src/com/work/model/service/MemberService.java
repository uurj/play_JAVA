package com.work.model.service;

import java.util.ArrayList;


import com.work.model.dto.Member;
import com.work.util.Utility;

/**
 * Collection API 활용 변경
 * -- ArrayList
 * -- Generic Collection 변경 
 * 
 * @author ParkYuJung
 *
 */
public class MemberService {
	
	/** 회원들을 저장관리하기 위한 자료 저장구조 */
	private ArrayList<Member> list = new ArrayList<Member>();
	
	/** 기본생성자 : 초기화 회원 등록 수행 */
	public MemberService() {
//		int count = initMember();
//		System.out.println("초기화회원 등록작업이 완료되었습니다. : " + initMember());
	}
	
	/**
	 * 회원 탈퇴
	 * @param memberId 아이디
	 * @param memberPw 비밀번호 
	 * @return 성공시 탈퇴회원의 기존정보, 실패시 null
	 */
	public Member removeMember(String memberId, String memberPw) {
		int index = exist(memberId); 
		
//		jdk1.4
//		if (index >= 0) {
//			Object obj = list.get(index);
//			if (obj instanceof Member) {
//				Member dto = (Member)obj;
//				if(dto.getMemberPw().equals(memberPw)) {
//					return (Member)list.remove(index);
//				}
//			}
//		}
		
//		generic jdk1.5
		if (index >= 0 && list.get(index).getMemberPw().equals(memberPw)) {
			return (Member)list.remove(index);
		}
		return null;
	}
	
	// (탈퇴) 아이디만 비교하고 탈퇴하는거 
	public Member removeMember(String memberId) {
		int index = exist(memberId);  // 객체가아닌 도메인으로
		if (index >= 0) {
					return (Member)list.remove(index);
		}
		return null;
	}
	
	
	/**
	 * 회원정보 전체 변경 
	 * @return 성공시 true, 실패시(아이디가 존재하지 않을때) false
	 */
	public boolean setMember(Member dto) {
		int index = exist(dto.getMemberId());
		
// 		jdk1.4
//		if (index >= 0) {
//			list.set(index, dto);
//			return true;
//		}
		
		// generic jdk 1.5
		if (index >= 0) {
			return true;
		}
		return false;
	}
	
	/**
	 * 비밀번호 변경
	 * -- 아규먼트 : 아이디, 비밀번호, 변경비밀번호
	 * -- 도메인 데이터 각각 : 아이디, 비밀번호, 변경비밀번호
	 * -- 도메인 객체로 받을 수 있을까? 즉, Member로 받을 수 있나? -> 아이디비번은 있지만 변경비번은 없어서 안됨
	 * -- Map : key:value 는 가능
	 * @return
	 */
	public boolean setMemberPw(String memberId, String memberPw, String modifyMemberPw) {
		int index = exist(memberId);  
		
//		jdk1.4
//		if (index >= 0) {
//			Object obj = list.get(index);
//			if (obj instanceof Member) {
//				Member dto = (Member)obj;
//				if(dto.getMemberPw().equals(memberPw)) {
//					dto.setMemberPw(modifyMemberPw);
//					return true;
//				}
//			}
		
		// generic jdk1.5 변경실습
		if (index >= 0 && list.get(index).getMemberPw().equals(memberPw)) {
			list.get(index).setMemberPw(modifyMemberPw);
			return true;
		}
		return false;//아이디가 존재하지 않거나 기존비번이 틀린경우
	}
	
	
	/** 현재 등록한 전체 회원 조회 */
	public ArrayList getMember() {
		return list;
	}
	
	
	/**
	 * 현재 등록 인원수 조회
	 * @return 현재 등록 인원수
	 */
	public int getCount() {
		return list.size();
	}
	
	/**
	 * 회원 등록
	 * @param dto 등록 회원 
	 */
	public void addMember(Member dto) {
		if (exist(dto.getMemberId()) == -1) {
			list.add(dto);
		} else {
		 System.out.println("[오류] 동일한 아이디가 존재합니다. : " + dto.getMemberId());
			}
		}
	
	/**
	 * 회원 등록
	 * -- 사용자 입력 데이터 : 아이디, 비밀번호, 이름, 휴대폰, 이메일
	 * -- 시스템 최초 가입시 일반회원 가입처리 : 가입일, 등급, [마일리지]
	 * @param memberID 아이디
	 * @param memberPW
	 * @param name
	 * @param phone
	 * @param email
	 */
	public void addMember(String memberID, String memberPw, String name, String phone, String email) {
		Member dto = new Member(memberID, memberPw, name, phone, email);
		dto.setGrade("G");
		dto.setEntryDate(Utility.getCurrentDate());
		dto.setMileage(1000);
		
		addMember(dto);
		
		
	}

	/**
	 * 회원 존재 유무 조회
	 * @param memberId 아이디
	 * @return -1 존재시 저장위치 인덱스번호, 미존재시 -1
	 */
	public int exist(String memberId) {
		// Collection jdk1.4
		// jdk1.4
//		for (int index = 0; index < list.size(); index++) {  
//			Object obj = list.get(index);	
//			if (obj instanceof Member) {	
//				Member dto = (Member)obj;	
//				if (dto.getMemberID().equals(memberID)) { 	
//					return index; 	
//					}
//				}
		// Generic jdk1.5 변경 구현
		for (int index = 0; index < list.size(); index++) {
			if (list.get(index).getMemberId().equals(memberId)) {
				return index;
			}
		}
		return -1;
	} 
	
	
	/**
	 * 테스트를 위한 회원 초기화 등록 메서드
	 * @return 초기화 회원등록 
	 */
	public int initMember() {
		Member dto1 = new Member("user01", "password01", "홍길동", "01012341000", "user01@work.com", "2020-12-15", "G", 50000, null);
		Member dto2 = new Member("user02", "password02", "강감찬", "01012342000", "user02@work.com", "2021-01-05", "G", 950000, null);
		Member dto3 = new Member("user03", "password03", "이순신", "01012343000", "user03@work.com", "2020-11-15", "S", 0, "강동원");
		Member dto4 = new Member("user04", "password04", "김유신", "01012344000", "user04@work.com", "2021-01-05", "S", 0, "김하린");
		Member dto5 = new Member("administrator", "admin1004", "유관순", "01012345000", "administrator@work.com", "2020-04-01", "A");
		
		addMember(dto1);
		addMember(dto2);
		addMember(dto3);
		addMember(dto4);
		addMember(dto5);
		
		return list.size();
	}

	/**
	 * 회원 상세조회
	 * @param memberId 아이디
	 * @return 존재하면 회원객체, 미존재시 null
	 * @see exist(String)
	 */
	public Member getMember(String memberId) {
		int index = exist(memberId);
		if (index >= 0) {
			return (Member)list.get(index);
		}
		
		return null;
	}
	
	/**
	 * 로그인
	 * -- 처리절차 아이디와 비밀번호를 입력받고 일치하면 로그인 성공
	 * -- 메서드명 login
	 * -- 매개변수 아이디 비밀번호
	 * -- 반환타입 boolean
	 * 1. 회원전용서비스 : boolean
	 * 2. 회원등급별 차등 서비스 : 로그인성공 - 해당회원의 등급(String), 로그인 실패 - null (아이디 미존재, 비밀번호 불일치)
	 * 3. 로그인 성공시 
	 * 		3.1 로그인 성공??
	 * 		3.2 등급이 일반회원?
	 * 		3.3 일반회원이면 마일리지 변경(로그인 마일리지 추가)
	 * 		3.4 일반회원이면 마일리지가 현재 100,000이상이니?
	 * 		3.5 일반회원의 현재 마일리지가 100,000이상이면 --- 우수회원 등업처리를 위한 메서드 dispatch (위임)
	 * 		3.6 일반회원이 우수회원으로 등업처리 결과를 받아서 	
	 * @param memberID
	 * @param memberPw
	 * @return 로그인 성공시 트루, 실패시 펄스
	 */
//	public boolean login(String memberID, String memberPw) {
//		for (int index = 0; index < list.size(); index++) {
//			if (list.get(index).getMemberId().equals(memberID)) {
//				return true;
//			}
//		return false;
//	}
	
		/*
		 * 마일리지 변경
		 * -- 마일리지 정책을 어떻게 할건지
		 * 1. 로그인시마다 일반회원인 경우에는 마일리지 500추가 
		 * 2. 
		 */
	
	/**
	 * 우수회원 등업처리
	 * -- 처리절차 마일리지가 등업수치에 도달하면 스페셜회원으로 등업
	 * 1. 일반회원이 본인의 마일리지 정보를 조회하고 관리자에게(시스템) 등업요청
	 * 2. 자동등업 : 100,000점 넘으면 자동으로 등업
	 * 		-- 마일리지를 변경처리 메서드에서 수행하도록 로직처리
	 * 		-- 로그인 성공시 자동으로 확인해서 등업
	 * 3. 관리자 회원정보 조회해서 등업처리
	 * 
	 * 
	 * -- 메서드명 upgrade
	 * -- 매개변수 마일리지
	 * -- 반환타입 String
	 */
	
	
	/**
	 * 아이디찾기
	 * -- 처리절차 휴대폰번호로 확인
	 * -- 메서드명 searchMemberID
	 * -- 매개변수 휴대폰
	 * -- 반환타입 String
	 */
	
	
	/**
	 * 비밀번호찾기
	 * 1. 기존비밀번호 반환 : 보안상 좋지 않음
	 * 2. 임시암호발급 변경 후 반환 : 휴대폰문자, 이메일 발송, 응답화면 메세지
	 * 3. 암호변경위한 메뉴 제공 : 
	 * -- 처리절차
	 * -- 메서드명
	 * -- 매개변수
	 * -- 반환타입
	 */
	
	
//	/** 아이디중복조회 */
//	public Member searchduplicateId(String string) {
//		return null;
	
}
