package com.work.static_test;

/**
 * 회원도메인 클래스
 * 1. 아이디 memberID
 * 2. 이름 name
 * 3. 휴대폰 mobile
 * 
 * # 설계규칙
 * 1. encapsulation
 * 2. 생성자 중복정의 : 기본, 전체
 * 3. toString() 재정의
 * 4. equals(), hashCode() 재정의 : 아이디 같으면 같은 객체
 * @author Playdata
 *
 */
public class SimpleMember {
	// CLASS 변수 : 객체생성없이 사용가능하고 모든 객체가 공유가능한 변수 (공유변수)
	public static int classCount;
	
	// instance 변수 : 객체생성후 참조변수명을 통해서 해당객체에서 사용하는 변수
	public int instanceCount;
	
	// static block 초기화
	static {
		System.out.println("클래스가 로드될 때(프로그램시작시) 딱 한번만 수행합니다");
	}
	
	// instance block 초기화 -- 얘 쓸일 없음  대신 주로 생성자 활용 
	{
		System.out.println("객체 생성할때마다 수행합니다.");
	}
	
	private String memberID; 
	private String name; 
	private int modile; 
	
	/** 기본 생성자 */
	public SimpleMember() {
		System.out.println("생성자 : 객체생성시 호출수행됩니다.");
	}


	/**
	 * 전체 생성자
	 * @param memberID
	 * @param name
	 * @param modile
	 */
	public SimpleMember(String memberID, String name, int modile) {
		this.memberID = memberID;
		this.name = name;
		this.modile = modile;
	}

	
	
	/**
	 * @return the memberID
	 */
	public String getMemberID() {
		return memberID;
	}


	/**
	 * @param memberID the memberID to set
	 */
	public void setMemberID(String memberID) {
		this.memberID = memberID;
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
	 * @return the modile
	 */
	public int getModile() {
		return modile;
	}


	/**
	 * @param modile the modile to set
	 */
	public void setModile(int modile) {
		this.modile = modile;
	}


	@Override
	public String toString() {
		return memberID + ", " + name + ", " + modile;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((memberID == null) ? 0 : memberID.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SimpleMember other = (SimpleMember) obj;
		if (memberID == null) {
			if (other.memberID != null)
				return false;
		} else if (!memberID.equals(other.memberID))
			return false;
		return true;
	}


	
	
	
}
