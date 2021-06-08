package com.work.model.service;

import java.util.ArrayList;


import com.work.exception.CommonException;
import com.work.exception.DuplicateException;
import com.work.exception.RecordNotFoundException;
import com.work.model.dto.Member;

/**
 * 회원 서비스
 * 
 * @author ParkYuJung
 * @version ver.1.0
 * @since jdk1.8
 */
public class MemberService {
// 아이디찾기 비밀번호찾기 회원정보변경 
	
	/** 회원 자료 저장구조 */
	private ArrayList<Member> list = new ArrayList<Member>();
	
	/** 기본 생성자 : 초기화 회원 등록 */
	public MemberService() {}
	
	
	/** 회원 탈퇴 */
	public Member removeMember(String memberId) throws RecordNotFoundException  {
		int index = exist(memberId);
		if (index >= 0) {
			return list.remove(index);
		}
		throw new RecordNotFoundException(memberId);
	}
	
	/**
	 * 회원등록
	 * @param memberId 아이디
	 * @param memberPw 비밀번호
	 * @param name 이름
	 * @param mobile 휴대폰
	 * @param email 이메일 
	 * @throws DuplicateException 
	 */
	public void addMember(String memberId, String memberPw, String name, String mobile, String email) throws DuplicateException {
			Member dto = new Member(memberId,memberPw, name, mobile, email);
			addMember(dto);
	}

	/**
	 * 회원등록
	 * @param dto 등록 회원
	 * @throws DuplicateException 
	 */
	public void addMember(Member dto) throws DuplicateException {
		int index = exist(dto.getMemberId());
		if (index >= 0) {
			throw new DuplicateException(dto.getMemberId());
		}
		
		list.add(dto);
	
	}
	
	/**
	 * 회원 존재 유무 조회
	 * @param memberId 아이디
	 * @return 존재시 저장위치 인덱스번호, 미존재시 -1
	 */
	public int exist(String memberId) {
		for (int index = 0; index < list.size(); index++) {
			if (list.get(index).getMemberId().equals(memberId)) {
				return index;
			}
		}
		return -1;
	}
	
	/**
	 * 로그인
	 * @param memberId
	 * @param memberPw
	 * @return 성공시 회원 이름, 실패시 오류메세지
	 * @throws RecordNotFoundException 
	 * @throws CommonException 
	 */
	public String login(String memberId, String memberPw) throws RecordNotFoundException, CommonException {
		try {
			Member dto = getMember(memberId);
			if (dto.getMemberPw().equals(memberPw)) {
				
				return dto.getName();
			}
			throw new CommonException("[오류] 회원의 정보가 올바르지 않습니다.");
		} catch (RecordNotFoundException e) {
			throw e;
		}
	}
	
		/**
		 * 회원 상세조회
		 * @param memberId 회원아이디
		 * @return 존재하면 회원객체, 미존재 null
		 * @throws RecordNotFoundException 
		 * @see exist(String)
		 */
		public Member getMember(String memberId) throws RecordNotFoundException {
			int index = exist(memberId);
			if (index >= 0) {
				return (Member)list.get(index);
			}
			
			throw new RecordNotFoundException(memberId);
}
		/**
		 * 회원 정보 변경
		 * @param memberId 아이디
		 * @param memberPw 비밀번호
		 * @param name 이름
		 * @param email 이메일
		 * @param mobile 휴대폰
		 */
		public void setMember(String memberId, String memberPw, String name, String email, String mobile) {
			
		}
}