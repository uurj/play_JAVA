/**
 * 
 */
package com.work.model.dto;

/**
 * 우수 회원 
 * @author Playdata
 *
 */
public class SpecialMember extends Member {

	/** 우수회원 담당자 */
	private String manage; 
	
	/** 기본생성자 */
	public SpecialMember() {
		System.out.println("우수회원 기본생성자");
	}

	/**
	 * 회원 입력 필수데이터 초기화 생성자
	 * @param memberID 아이디
	 * @param memberPw 비밀번호
	 * @param name 이름
	 * @param mobile 휴대폰
	 * @param email 이메일
	 */
	public SpecialMember(String memberID, String memberPw, String name, String mobile, String email) {
		super(memberID, memberPw, name, mobile, email);
		System.out.println("우수회원 필수데이터 초기화 생성자");
	}
	
	/**
	 * 회원 입력 필수데이터 초기화 생성자
	 * @param memberID 아이디
	 * @param memberPw 비밀번호
	 * @param name 이름
	 * @param mobile 휴대폰
	 * @param email 이메일
	 * @param entryDate 가입일
	 * @param grade 등급
	 * @param manage 담당자
	 */
	public SpecialMember(String memberID, String memberPw, String name, String mobile, String email, String entryDate,
			String grade, String manage ) {
		super(memberID, memberPw, name, mobile, email, entryDate, grade);
		this.manage = manage;
	}

	/**
	 * @return the manage
	 */
	public String getManage() {
		return manage;
	}

	/**
	 * @param manage the manage to set
	 */
	public void setManage(String manage) {
		this.manage = manage;
	}

	@Override
	public String toString() {
		return super.toString() + ", " + manage;
	}

	
}
