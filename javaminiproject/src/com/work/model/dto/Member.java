package com.work.model.dto;

/**
 * <pre>
 * 도메인 클래스
 * </pre>
 * 
 * @author ParkYuJung
 * @version ver.1.0
 * @since jdk1.8
 */
public class Member {
	/** 아이디, 식별키 */
	private String memberId;
	
	/** 비밀번호, 필수 */
	private String memberPw;
	
	/** 이름, 필수 */
	private String name;
	
	/** 휴대폰, 필수, 형식 01012341234 */
	private String mobile;
	
	/** 이메일, 필수 */
	private String email;
	
	/** 수입 */
	private int inCome;
	
	/** 지출 */
	private int spend;
	
	/** 이체 */
	private int transfer;
	
	/** 날짜 */
	private String date;
	
	/** 금액 */
	private int amount;
	
	/** 예산 */
	private int budget;
	
	/** 결제수단 */
	private String methodPayment;
	
	
	/** 기본생성자 */

	public Member() {}

	/** 
	 * 사용자 입력데이터 초기화 생성자
	 * @param memberId 아이디
	 * @param memberPw 비밀번호
	 * @param name 이름
	 * @param mobile 휴대폰
	 * @param email 이메일
	 */
	public Member(String memberId, String memberPw, String name, String mobile, String email) {
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
	}

	/**
	 * 전체 데이터 초기화 생성자
	 * @param memberId 아이디
	 * @param memberPw 비밀번호
	 * @param name 이름
	 * @param mobile 휴대폰
	 * @param email 이메일
	 * @param inCome 수입
	 * @param spend 지출
	 * @param transfer 이체
	 * @param date 날짜
	 * @param amount 금액
	 * @param budget 예산
	 * @param methodPayment 결제수단 
	 */
	public Member(String memberId, String memberPw, String name, String mobile, String email, int inCome, int spend,
			int transfer, String date, int amount, int budget, String methodPayment) {
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.inCome = inCome;
		this.spend = spend;
		this.transfer = transfer;
		date = date;
		this.amount = amount;
		this.budget = budget;
		this.methodPayment = methodPayment;
	}

	/**
	 * @return the memberId
	 */
	public String getMemberId() {
		return memberId;
	}

	/**
	 * @param memberId the memberId to set
	 */
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	/**
	 * @return the memberPw
	 */
	public String getMemberPw() {
		return memberPw;
	}

	/**
	 * @param memberPw the memberPw to set
	 */
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
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
	 * @return the inCome
	 */
	public int getInCome() {
		return inCome;
	}

	/**
	 * @param inCome the inCome to set
	 */
	public void setInCome(int inCome) {
		this.inCome = inCome;
	}

	/**
	 * @return the spend
	 */
	public int getSpend() {
		return spend;
	}

	/**
	 * @param spend the spend to set
	 */
	public void setSpend(int spend) {
		this.spend = spend;
	}

	/**
	 * @return the transfer
	 */
	public int getTransfer() {
		return transfer;
	}

	/**
	 * @param transfer the transfer to set
	 */
	public void setTransfer(int transfer) {
		this.transfer = transfer;
	}

	/**
	 * @return the date
	 */
	public String getdate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setdate(String date) {
		date = date;
	}

	/**
	 * @return the amount
	 */
	public int getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}

	/**
	 * @return the budget
	 */
	public int getBudget() {
		return budget;
	}

	/**
	 * @param budget the budget to set
	 */
	public void setBudget(int budget) {
		this.budget = budget;
	}

	/**
	 * @return the methodPayment
	 */
	public String getMethodPayment() {
		return methodPayment;
	}

	/**
	 * @param methodPayment the methodPayment to set
	 */
	public void setMethodPayment(String methodPayment) {
		this.methodPayment = methodPayment;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((memberId == null) ? 0 : memberId.hashCode());
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
		Member other = (Member) obj;
		if (memberId == null) {
			if (other.memberId != null)
				return false;
		} else if (!memberId.equals(other.memberId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(memberId);
		builder.append(", ");
		builder.append(memberPw);
		builder.append(", ");
		builder.append(name);
		builder.append(", ");
		builder.append(mobile);
		builder.append(", ");
		builder.append(email);
		builder.append(", ");
		builder.append(inCome);
		builder.append(", ");
		builder.append(spend);
		builder.append(", ");
		builder.append(transfer);
		builder.append(", ");
		builder.append(date);
		builder.append(", ");
		builder.append(amount);
		builder.append(", ");
		builder.append(budget);
		builder.append(", ");
		builder.append(methodPayment);
		return builder.toString();
	}
}	