package com.work.set;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;

import com.work.model.dto.AdminMember;
import com.work.model.dto.GeneralMember;
import com.work.model.dto.Member;
import com.work.model.dto.SpecialMember;

public class SetTest {
	public static void main(String[] args) {
		// jdk1.4  Collection Set - 순서 없음, 중복 불가 
//		HashSet set = new HashSet();
		
		// jdk1.5 generic : Member만 저장되는 전용 Collection
		HashSet<Member> set = new HashSet<Member>();
		
		Member dto1 = new GeneralMember("user01", "password01", "홍길동", "01012341000", "user01@work.com", "2020-12-15", "G", 5000);
		Member dto2 = new GeneralMember("user01", "password02", "강감찬", "01012342000", "user02@work.com", "2021-12-15", "G", 95000);
		Member dto3 = new SpecialMember("user03", "password03", "이순신", "01012343000", "user03@work.com", "2020-11-15", "S", "강동원");
		Member dto4 = new SpecialMember("user04", "password04", "김유신", "01012344000", "user04@work.com", "2021-01-05", "S", "김하린");
		Member dto5 = new AdminMember("user05", "password05", "유관순", "01012345000", "user05@work.com", "2020-04-01", "A", "선임");
	
		
		System.out.println();
		// 등록 : add(Object)
//		System.out.println(set.add("hello"));		// true
//		System.out.println(set.add("hello"));		// false 
//		System.out.println(set.add("hello"));		// false
//		System.out.println(set.add("hello"));		// false
//		System.out.println(set.add("hello"));		// false
//		System.out.println(set.add(1004));			// true
//		System.out.println(set.add(new Integer(1004)));	// false
		System.out.println(set.add(dto1));			// true
		System.out.println(set.add(dto2));			// false
		System.out.println(set.add(dto3));			// true
		System.out.println(set.add(dto4));			// true
		System.out.println(set.add(dto5));			// true
//		System.out.println(set.add(new Date()));	// true
		
		System.out.println("저장 갯수 : " + set.size());
		
		// 조회 : 전체조회 ........해쉬는 복주머니라 이터레이터로 담아서 조회해야됨
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
//			System.out.println(iterator.next());  // 넥스트는 하나씩 가져오는거
			Object obj = iterator.next();
			System.out.println(obj);
		}
		
		// 조회 : 아이디가 "user01" 객체의 정보 조회 : instanceof / type casting 
		iterator = set.iterator();  // 위에서 다돌았으니까 다시 받아와야함
		while(iterator.hasNext()) {
				Member dto = (Member)iterator.next();
				if (dto.getMemberID().equals("user01")) {
					System.out.println(dto);
					break; // 반복문 빠져나오기
				}
			}
		
		
		// 삭제 : boolean remove(Object o)
		System.out.println("\n삭제 : user04");
		System.out.println();
		iterator = set.iterator();   // 위에서 다돌았으니까 다시 받아와야함
		while(iterator.hasNext()) {
			Object obj = iterator.next();
			if (obj instanceof Member) {
				Member dto = (Member)obj;
				if (dto.getMemberID().equals("user04")) {
					set.remove(dto);
					break; // 반복문 빠져나오기
				}
			}
		}
	}
	

	public static void main1(String[] args) {
		// jdk1.4  Collection Set - 순서 없음, 중복 불가 
		HashSet set = new HashSet();
		
		Member dto1 = new GeneralMember("user01", "password01", "홍길동", "01012341000", "user01@work.com", "2020-12-15", "G", 5000);
		Member dto2 = new GeneralMember("user01", "password02", "강감찬", "01012342000", "user02@work.com", "2021-12-15", "G", 95000);
		Member dto3 = new SpecialMember("user03", "password03", "이순신", "01012343000", "user03@work.com", "2020-11-15", "S", "강동원");
		Member dto4 = new SpecialMember("user04", "password04", "김유신", "01012344000", "user04@work.com", "2021-01-05", "S", "김하린");
		Member dto5 = new AdminMember("user05", "password05", "유관순", "01012345000", "user05@work.com", "2020-04-01", "A", "선임");
	
		
		System.out.println();
		// 등록 : add(Object)
		System.out.println(set.add("hello"));		// true
		System.out.println(set.add("hello"));		// false 
		System.out.println(set.add("hello"));		// false
		System.out.println(set.add("hello"));		// false
		System.out.println(set.add("hello"));		// false
		System.out.println(set.add(1004));			// true
		System.out.println(set.add(new Integer(1004)));	// false
		System.out.println(set.add(dto1));			// true
		System.out.println(set.add(dto2));			// false
		System.out.println(set.add(dto3));			// true
		System.out.println(set.add(dto4));			// true
		System.out.println(set.add(dto5));			// true
		System.out.println(set.add(new Date()));	// true
		
		System.out.println("저장 갯수 : " + set.size());
		
		// 조회 : 전체조회 ........해쉬는 복주머니라 이터레이터로 담아서 조회해야됨
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
//			System.out.println(iterator.next());  // 넥스트는 하나씩 가져오는거
			Object obj = iterator.next();
			System.out.println(obj);
		}
		
		// 조회 : 아이디가 "user01" 객체의 정보 조회 : instanceof / type casting 
		iterator = set.iterator();  // 위에서 다돌았으니까 다시 받아와야함
		while(iterator.hasNext()) {
			Object obj = iterator.next();
			if (obj instanceof Member) {
				Member dto = (Member)obj;
				if (dto.getMemberID().equals("user01")) {
					System.out.println(dto);
					break; // 반복문 빠져나오기
				}
			}
		}
		
		// 삭제 : boolean remove(Object o)
		System.out.println("\n삭제 : user04");
		iterator = set.iterator();  // 위에서 다돌았으니까 다시 받아와야함
		while(iterator.hasNext()) {
			Object obj = iterator.next();
			if (obj instanceof Member) {
				Member dto = (Member)obj;
				if (dto.getMemberID().equals("user04")) {
					set.remove(dto);
					break; // 반복문 빠져나오기
				}
			}
		}
	
	
}
}