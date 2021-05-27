package com.work.model.dto;

/**
 * <pre>
 * 회원 관리 도메인 클래스
 * </pre>
 * @author ParkYuJung
 * @version ver.1.0
 * @since jdk1.8
 */
public class Member {
	/** 회원 : 필수 */
	public String member;
	
	/** 아이디 : 필수 */
	public String ID;
	
	/** 마일리지 */
	public int mileage;
	
	
	/** 기본생성자 */
	public Member() {
		
	}

	/**
	 * 필수 데이터 초기화 생성자
	 * @param member 회원
	 * @param ID 아이디
	 */
	public Member(String member, String ID) {
		this();
		this.member = member;
		this.ID = ID; 
	}
	
	/**
	 * 전체 데이터 초기화 생성자
	 * 
	 * @param member 회원
	 * @param ID 아이디
	 * @param mileage 마일리지 
	 */
	public Member(String member, String ID, int mileage) {
		this.member = member;  
		this.ID = ID;  
		this.mileage = mileage;  
	}
	
	
//---------------여기부터메소드---------------------------------
	
	public void printInfo() {
		System.out.println(member + "\t" + ID + "\t" + mileage);
	}
	
	/**일반회원의 마일리지가 100,000 이상이 되면 우수회원으로 등업처리한다.*/
	public int getMileage() {
		return mileage; 
	}


}
