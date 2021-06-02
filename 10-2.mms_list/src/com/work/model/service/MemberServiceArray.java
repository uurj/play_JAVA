package com.work.model.service;

import com.work.model.dto.Member;

/** 
 * <pre>
 * 회원들을 관리하기 위한 자료저장구조 : 배열 다형성 반영(부모타입) 
 * </pre>
 * 
 * @author ParkYuJung
 * @version ver.1.0
 * @since jdk.1.8
 */

public class MemberServiceArray {
	
	/**
	 * 회원들을 관리하기 위한 자료저장구조 : 배열의 다형성 반영
	 */
	private Member[] members = new Member [10];
	
	/** 등록인원수 및 등록될 배열요소 위치 정보 */
	private int count;
	
	//아이디중복조회
	
	
	/** 
	 * 현재 등록 인원수 조회
	 * @return 현재 등록 인원수
	 */
	public int getCount() {
		return count;
	}
	
	
	/**
	 * 회원등록 구현 절차 : 
	 * 1. 현재 등록된 회원수(count)와 현재 배열(members)의 크기와 같은지 비교해서
	 * - 별도의 메서드로 분리 설계 : 구현클래스에서 메서드 선언 (추상 노)
	 * 
	 * 2. 같으면 확장배열(기존배열의 크기 + n)을 새로 생성해서
	 * 3. 새로 확장한 배열요소에 기존배열요소에 저장돼 있는 객체들을 이동저장
	 * 4. 기존에 참조하고 있는 배열대신에 새로 확장한 배열요소 변경 참조설정
	 * 5. count의 배열요소에 아규먼트로 전달받은 회원객체 등록하고
	 * 6. count를 1증가 시킴
	 */
	
	public void addMember(Member dto) {
		if (count == members.length) {
			extendMembers();
		}
		if(exist(dto.getMemberID()) == -1) {
		members[count++] = dto;  
		} else {
			System.out.println("[오류] 아이디는 사용할 수 없습니다.");
		}
	}
	
	/**
	 * CRUD 메서드에서 사용할 회원 존재유무 및 저장 위치 조회 메서드
	 * 1. 현재 등록된 회원수만큼 반복하면서 
	 * 2. 배열에 저장된 순서대로 저장된 객체의 아이디와(dto.getMemberID()) 아규먼트로 전달받은 아이디가 같은지 비교해서(String#equals(문자열))
	 * 3. 아이디가 같으면 현재 저장된 배열요소의 인덱스번호를 반환 
	 * 4. 반복을 다했는데도 return 되지 않았다면 아이디정보를 갖는 회원객체가 존재하지 않으므로 return -1 
	 * 
	 * @param memberID 아이디
	 * @return 존재시 저장위치번호, 미존재시 -1
	 */
	
	public int exist(String memberID) {
		// 1.
		for (int index = 0; index < count; index++) {
			// 2.
			if(members[index].getMemberID().equals(memberID)) { 
				//3.
				return index;
				}
			}
		return -1; 
	}
	
//	/**
//	 * 아이디 중복조회
//	 * @param memberID 아이디 
//	 */
//	public void searchduplicateID(String memberID) { 
//		for (int index = 0; index < count; index++) {
//			if(members[index].getMemberID().equals(memberID)) { 
//				System.out.println(memberID + "는 중복된 아이디입니다.");
//				}
//		System.out.println(memberID + "는 중복되지 않는 아이디입니다.");
//		}
//	}
	
	/**
	 * 배열구조 추가 확장해서 기존 저장정보 이동 처리
	 * 1.membersTemp라는 새로운 배열구조 생성, 크기는 기존의배열(members)의 크기*2
	 * 2.System.arraycopy를 이용해서 기존배열에 있던 정보를 새배열에 저장
	 * 3.기존의 배열을 새배열로 지정해줌 (오류발생하지 않게)
	 * 
	 * @see java.lang.System#arraycopy(Object, int, Object, int, int)
	 */
	public void extendMembers() {
		Member[] membersTemp = new Member [members.length*2];
		System.arraycopy(members, 0, membersTemp, 0, members.length);
		members = membersTemp;  // 헌방 버리고 새방으로 지정
	}

	/**
	 * 상세 조회 
	 * 1. exist(String memberID) 수행결과 : 저장위치 반환해줌 
	 * 2. 저장위치가 0보다 크거나 같은지 비교해서
	 * 3. 0보다 크거나 같으면 존재하니까 해당 배열요소의 객체를 return 반환
	 * 4. 0보다 크거나 같지 않으면(0보다 작으면) 존재하지 않음 : 존재하지 않으므로 객체타입의 기본값 null 반환 
	 */

	public Member getMember(String memberID) {
		int idx = exist(memberID);
		if (idx >= 0) {
			return members[idx];
		}
		System.out.println("[오류] " + memberID + "는 존재하지 않는 아이디입니다.");
		return null;
	}


	/**
	 * 전체조회
	 * 1. exist(String Member) 수행결과 : 저장위치 반환해줌 
	 * 2. 저장위치가 0보다 크거나 같은지 비교해서
	 * 3. 0보다 크거나 같으면 존재하니까 해당 배열요소의 객체를 return 반환
	 * 4. 0보다 크거나 같지 않으면(0보다 작으면) 존재하지 않음 : 존재하지 않으므로 객체타입의 기본값 null 반환 
	 */

	public Member getMember() {
		return null;
	}



	/**
	 * 회원정보 전체변경
	 * 1. exist로 회원 존재여부 확인
	 * 2. 존재시 객체 반환, 존재하지 않으면 null 반환
	 * 3. setMember로 Member받아서 입력
	 */

	public void setMember(Member dto) {
		
	}



	/**
	 * 회원 비밀번호 변경
	 * 1. exist로 회원 존재여부 확인
	 * 2. 저장위치가 0보다 크거나 같은지 비교
	 * 3. 0보다 크거나 같으면 존재하니까 해당 배열요소의 객체를 return 반환
	 * 4. 0보다 작으면 존재하지 않음 : 존재하지 않으므로 null 반환 _ 오류메세지 출력
	 * 5. 존재시 setmemberPw 사용해서 해당 배열요소의 비밀번호 변경 
	 * 
	 */
	
	public boolean setMemberPw(String memberID, String memberPw, String modifyPw) {
		
		return false;
	}



	/**
	 * 회원 탈퇴
	 * 아이디로 존재여부 확인. 존재하지 않으면 null 반환하고 null값 주어서 삭제
	 * 카운트 1감소
	 * 삭제된 회원의 저장공간에 맨마지막에 저장했던 정보를 옮김 ???
	 */
	
	public void removeMember(String memberID, String memberPw) {
		
	}



	/**
	 * 회원 전체 탈퇴
	 * 1. 배열 통째로 삭제
	 */
	
	public void removeMember() {
		members = null; 
	}
	
	

		
}

