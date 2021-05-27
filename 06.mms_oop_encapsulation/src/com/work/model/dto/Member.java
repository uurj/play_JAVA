package com.work.model.dto;

/**
 * <pre>
 * 회원 도메인 클래스
 * -- encapsulation 설계 반영 변경
 * 
 * </pre>
 * @author ParkYuJung
 * @version ver.1.0
 * @since jdk1.8
 */
public class Member {
	/** 아이디 : 식별키 */
	private String memberID;
	
	/** 비밀번호 : 필수 */
	private String memberPw;
	
	/** 이름 : 필수 */
	private String name;
	
	/** 휴대폰 : 필수 */
	private String mobile;
	
	/** 이메일 : 필수 */
	private String email;
	
	/** 가입일 : 필수 */
	private String entryDate;
	
	/** 등급 : 필수 */
	private String grade;
	
	/** 마일리지 : 선택*/
	private int mileage;
	
	/** 담당자 : 선택*/
	private String manager;

	/**기본 생성자  */
	public Member() {}

	/**
	 * 사용자 입력 데이터 초기화 생성자
	 * @param memberID 아이디
	 * @param memberPw 비밀번호
	 * @param name 이름
	 * @param mobile 휴대폰
	 * @param email 이메일
	 */
	public Member(String memberID, String memberPw, String name, String mobile, String email) {
		this.memberID = memberID;
		this.memberPw = memberPw;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
	}

	/**
	 * 필수데이터 초기화 생성자 
	 * @param memberID 아이디
	 * @param memberPw 비밀번호
	 * @param name 이름
	 * @param mobile 휴대폰
	 * @param email 이메일
	 * @param entryDate 가입일
	 * @param grade 등급
	 */
	public Member(String memberID, String memberPw, String name, String mobile, String email, String entryDate,
			String grade) {
		this.memberID = memberID;
		this.memberPw = memberPw;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.entryDate = entryDate;
		this.grade = grade;
	}

	/**
	 * 전체데이터 초기화 생성자
	 * @param memberID 아이디
	 * @param memberPw 비밀번호
	 * @param name 이름
	 * @param mobile 휴대폰
	 * @param email 이메일
	 * @param entryDate 가입일
	 * @param grade 등급
	 * @param mileage 마일리지
	 * @param manager 담당자
	 */
	public Member(String memberID, String memberPw, String name, String mobile, String email, String entryDate,
			String grade, int mileage, String manager) {
		this.memberID = memberID;
		this.memberPw = memberPw;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.entryDate = entryDate;
		this.grade = grade;
		this.mileage = mileage;
		this.manager = manager;
	}

	//-------------------------------------------------------------
	/**
	 * @return the memberID
	 */
	public String getMemberID() {
		return memberID;
	}

	/**
	 * 아이디 검증 규칙 
	 * -- 최소 5자기, 최대 30자리
	 * -- 문자열길이 메서드 : {@link String#length}
	 * @param memberID the memberID to set
	 */
	public void setMemberID(String memberID) {
		boolean result = isMemberID(memberID);
		
		if (result) {
			this.memberID = memberID; 
		} else {
			System.out.println("[오류] 비밀번호는 6~30자리 이내로 입력하세요.");
		}
		this.memberID = memberID;
	}
	
	/**
	 * 아이디검증 메서드
	 * @param memberID
	 * @return 아이디길이가 6~30자리이면 트루 아니면 펄스 
	 */
	private boolean isMemberID(String memberID) {
		if(memberID.length() >= 6 && memberID.length() <= 30) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * @return the memberPw
	 */
	public String getMemberPw() {
		return memberPw;
	}
	
	/**
	 * 비밀번호검증 규칙
	 * @param memberPw the memberPw to set
	 */
	public void setMemberPw(String memberPw) {
		if (isMemberPw(memberPw)) {
			this.memberPw = memberPw;
		} else {
			System.out.println("[오류] 비밀번호는 6~20자리 이내로 입력하세요.");
		}
		this.memberPw = memberPw;
		} 
	
	/**
	 * 비밀번호 검증 메서드
	 * @param memberPw 비밀번호
	 * @return 아이디 길이가 6~20자리 이내면 true, 아니면 false
	 */
//	private boolean isMemberPw(String memberPw) {
//		if(memberPw.length() >= 6 && memberPw.length() <= 20) {
//			return true;
//		} else {
//			return false;
//		}
//	}
	
	/**
	 * 비밀번호 검증 메서드
	 * 검증규칙 : 길이 6자기 ~ 20자리 
	 * @param memberPw 변경 비밀번호
	 * @return 검증규칙 올바르면 true, 올바르지 않으면 false 
	 */
	private boolean isMemberPw(String memberPw) {
		int length = memberPw.length();
		if (length >= 6 && length <= 20) {
			return true;
		}
		return false; 
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the entryDate
	 */
	public String getEntryDate() {
		return entryDate;
	}

	/**
	 * @param entryDate the entryDate to set
	 */
	public void setEntryDate(String entryDate) {
		this.entryDate = entryDate;
	}

	/**
	 * @return the grade
	 */
	public String getGrade() {
		return grade;
	}

	/**
	 * @param grade the grade to set
	 */
	public void setGrade(String grade) {
		if (isGrade(grade)) {
		this.grade = grade;
		} else {
			System.out.println("오류 등급은 G S A 만 가능");
		}
	}
	
	/**
	 * 등급 검증 메서드
	 * 검증규칙 : G, S, A
	 * @param grade 변경등급
	 * @return
	 */
	private boolean isGrade(String grade) {
		switch(grade) {
		case "G":
		case "S":
		case "A": 
			return true;
		default : 
			return false; 
		}
	}
	
	
	/**
	 * @return the mileage
	 */
	public int getMileage() {
		return mileage;
	}
	
	/**
	 * @param mileage the mileage to set
	 */
	public void setMileage(int mileage) {
		if (isMileage(mileage)) {
			this.mileage = mileage;
		}else { 
			System.out.println("요류");
		}
	}

	/**
	 * 마일리지 검증 메서드
	 * @param mileage 변경 마일리지
	 * @return 올바르면 true 올바르지 않으면 false
	 */
	private boolean isMileage(int mileage) {
		if(mileage >= 0 && mileage <= 100000) {
			return true;
		}
		return false;
	}
	
	/**
	 * @return the manager
	 */
	public String getManager() {
		return manager;
	}

	/**
	 * @param manager the manager to set
	 */
	public void setManager(String manager) {
		this.manager = manager;
	}

	@Override
	public String toString() {
		return memberID + ", " + memberPw + ", " + name + ", " + mobile + ", " + email + ", " + entryDate + ", " + grade
				+ ", " + mileage + ", " + manager;
	}

//	@Override
//	public String toString() {
//		return "Member [memberID=" + memberID + ", memberPw=" + memberPw + ", name=" + name + ", mobile=" + mobile
//				+ ", email=" + email + ", entryDate=" + entryDate + ", grade=" + grade + ", mileage=" + mileage
//				+ ", manager=" + manager + "]";
//	}
	
	
	
	
	
	
	
}
