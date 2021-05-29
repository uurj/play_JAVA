/**
 * 
 */
package com.work.model.dto;

/**
 * 관리자 회원
 * @author Playdata
 *
 */
public class AdminMember extends Member {

	/** 관리자 직책 */
	private String position;
	
	/** 기본 생성자 */
	public AdminMember() {
		System.out.println("관리자회원 기본생성자");
	}

	
	/**회원 입력 필수데이터 초기화 생성자
	 * @param memberID 아이디
	 * @param memberPw 비밀번호
	 * @param name 이름
	 * @param mobile 휴대폰
	 * @param email 이메일
	 */
	public AdminMember(String memberID, String memberPw, String name, String mobile, String email) {
		super(memberID, memberPw, name, mobile, email);
		System.out.println("관리자클래스 테스트");
	}
	
	/**관리자회원 모든데이터 초기화 생성자
	 * @param memberID 아이디
	 * @param memberPw 비밀번호
	 * @param name 이름
	 * @param mobile 휴대폰
	 * @param email 이메일
	 * @param entryDate 가입일
	 * @param grade 등급
	 * @param position 직책
	 */
	public AdminMember(String memberID, String memberPw, String name, String mobile, String email, String entryDate,
			String grade, String position) {
		super(memberID, memberPw, name, mobile, email, entryDate, grade);
		this.position = position;
	}


	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}


	/**
	 * @param position the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return super.toString() + ", " + position;
	}
	
	
}
