/**
 * 
 */
package com.work.model.service;

import java.util.ArrayList;

/**
 * <pre>
 * 회원관리 기능(서비스) 목록
 * </pre>
 * 
 * @author ParkYuJung
 * @version ver.1.0
 * @since jdk.1.8
 */
public class MemberService {
	
	private String info;
	
	/** 로그인 기능 */
	public void login(String memberID, String memberPw) {
		return;
	}
	
	/**가입 기능 */
	public void join(String memberID, String memberPw, String name, String mobile, String email) {
			return;
		}
	
	/** 내정보조회 */	
	public String getInfo() {
		return info;
	}
	
	/** 비밀번호변경 */
	public void modifyPw(String memberPw) {
		return;
	}
	
	/** 내정보전체변경 */
	public void modifyAll(String memberID, String memberPw, String name, String mobile, String email) {
		return;
	}
	
	/** 아이디찾기 ?*/
	public void id(String mobile) {
		return;
	}
	
	/** 비밀번호찾기 ?*/
	public void pw(String memberID) {
		return;
	}
}	
