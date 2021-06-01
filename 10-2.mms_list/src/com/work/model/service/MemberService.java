package com.work.model.service;

import java.util.ArrayList;

import com.work.model.dto.AdminMember;
import com.work.model.dto.GeneralMember;
import com.work.model.dto.Member;
import com.work.model.dto.SpecialMember;
import com.work.util.Utility;

/**
 * Collection API 활용 변경
 * -- ArrayList
 * 
 * @author ParkYuJung
 * @since 1.8
 *
 */
public class MemberService {
	
	/** 회원들을 저장관리하기 위한 자료 저장구조 */
	private ArrayList list = new ArrayList();
	
	/** 기본생성자 : 초기화 회원 등록 수행 */
	public MemberService() {
//		int count = initMember();
		System.out.println("초기화회원 등록작업이 완료되었습니다. : " + initMember());
	}
	
	
	/**
	 * 회원 탈퇴
	 * @param memberID 아이디
	 * @param memberPw 비밀번호 
	 * @return 성공시 탍퇴회원의 기존정보, 실패시 null
	 */
	public Member removeMember(String memberID, String memberPw) {
		int index = exist(memberID);  // 객체가아닌 도메인으로
		if (index >= 0) {
			Object obj = list.get(index);
			if (obj instanceof Member) {
				Member dto = (Member)obj;
				if(dto.getMemberPw().equals(memberPw)) {
					return (Member)list.remove(index);
				}
			}
		}
		return null;
	}
	
	// 아이디만 비교하고 삭제하는거 
	public Member removeMember(String memberID) {
		int index = exist(memberID);  // 객체가아닌 도메인으로
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
		int index = exist(dto.getMemberID());
		if (index >= 0) {
			list.set(index, dto);
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
	public boolean setMemberPw(String memberID, String memberPw, String modifyMemberPw) {
		int index = exist(memberID);  // 객체가아닌 도메인으로
		if (index >= 0) {
			Object obj = list.get(index);
			if (obj instanceof Member) {
				Member dto = (Member)obj;
				if(dto.getMemberPw().equals(memberPw)) {
					dto.setMemberPw(modifyMemberPw);
					return true;
				}
			}
		} return false;//아이디가 존재하지 않거나 기존비번이 틀린경우
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
	 * -- 사용자 입력 데이터 : 아이디, 비밀번호, 이름, 휴대폰, 이메일
	 * -- 시스템 최초 가입시 일반회원 가입처리 : 가입일, 등급, [마일리지]
	 * @param dto 등록 회원 
	 */
	public void addMember(Member dto) {
		if (exist(dto.getMemberID()) == -1) {
			list.add(dto);
		} else {
		 System.out.println("[오류] 동일한 아이디가 존재합니다. : " + dto.getMemberID());
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
		GeneralMember dto = new GeneralMember(memberID, memberPw, name, phone, email);
		dto.setGrade("G");
		dto.setEntryDate(Utility.getCurrentDate());
		dto.setMileage(1000);
		
		addMember(dto);
		
		
	}
	
	/**
	 * 회원 존재 유무 조회
	 * @param memberID 아이디
	 * @return -1 존재시 저장위치 인덱스번호, 미존재시 -1
	 */
	public int exist(String memberID) {
		// jdk1.4
		for (int index = 0; index < list.size(); index++) {  
			Object obj = list.get(index);	// obj는 리스트가져오는 인덱스로 정의
			if (obj instanceof Member) {	// 만약 obj가 Member를 참조하고 있다면
				Member dto = (Member)obj;	// dto와 obj는 같다
				if (dto.getMemberID().equals(memberID)) { 	// 만약 dto아이디와 obj가같다면
					return index; 	// 인덱스번호 반환해라
					}
				}
			} return -1;
	}
	
	/**
	 * 테스트를 위한 회원 초기화 등록 메서드
	 * @return 초기화 회원등록 
	 */
	public int initMember() {
		Member dto1 = new GeneralMember("user01", "password01", "홍길동", "01012341000", "user01@work.com", "2020-12-15", "G", 5000);
		Member dto2 = new GeneralMember("user02", "password02", "강감찬", "01012342000", "user02@work.com", "2021-12-15", "G", 95000);
		Member dto3 = new SpecialMember("user03", "password03", "이순신", "01012343000", "user03@work.com", "2020-11-15", "S", "강동원");
		Member dto4 = new SpecialMember("user04", "password04", "김유신", "01012344000", "user04@work.com", "2021-01-05", "S", "김하린");
		Member dto5 = new AdminMember("user05", "password05", "유관순", "01012345000", "user05@work.com", "2020-04-01", "A", "선임");
		
		addMember(dto1);
		addMember(dto2);
		addMember(dto3);
		addMember(dto4);
		addMember(dto5);
		
		return list.size();
	}

	/**
	 * 회원 상세조회
	 * @param memberID 아이디
	 * @return 존재하면 회원객체, 미존재시 null
	 * @see exist(String)
	 */
	public Member getMember(String memberID) {
		int index = exist(memberID);
		if (index >= 0) {
			return (Member)list.get(index);
		}
		
		return null;
	}
}
