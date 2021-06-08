package com.work.model.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import com.work.model.dto.Member;

/**
 * 수입 관련 서비스
 * 
 * @author ParkYuJung
 * @version ver.1.0
 * @since jdk1.8
 */
public class IncomeService {
	
	 HashMap<Integer, String> map = new HashMap<Integer, String>();
	 


	/** 수입 자료 저장구조 */
	private static ArrayList<IncomeService> list = new ArrayList<IncomeService>();

	/** 기본 생성자 */
	public IncomeService(String sources, int amount) {
	}
	
	 public static void income() throws Exception{
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println();
	        System.out.println("==가계부 수입 입력==");
	        System.out.print("수입 출처 : ");
	        String instr=scanner.nextLine();
	 
	        System.out.print("수입 금액 : ");
	        Integer inmonstr=scanner.nextInt();
	 
	        IncomeService.put(instr,inmonstr);
//	        map.put(new IncomeService(instr, inmonstr));
	        list.add(new IncomeService(instr, inmonstr));
	        System.out.println("수입이 등록되었습니다.");
	    }
	private static void put(String instr, Integer inmonstr) {
		
	}

	/**
	 * 수입등록
	 * @param dto
	 */
	public void addIncome(IncomeService dto) {
		list.add(dto);
	}
	
	/**
	 * 수입등록
	 * @param sources 출처
	 * @param amount 금액
	 * @param account 입금계좌
	 */
	public void addIncome(String sources, int amount, String account) {
		IncomeService dto = new IncomeService(sources, amount);
		addIncome(dto);
	}
	
	/**
	 * 수입내역변경
	 * @param date 날짜
	 * @param sources 출처
	 * @param amount 금액
	 * @param account 계좌
	 * @param modify 수정내역
	 */
	public void setIncome(String date, String sources, int amount, String account, int modify) {
		
	}
	
	/**
	 * 수입전체조회
	 * @return amount 금액
	 */
	public static ArrayList<IncomeService> getAllIncome() {
		System.out.println("===== 수입 조회 =====");
		for(IncomeService i:list) {
			System.out.println(i);
		}
		return list;
	}
	
	/**
	 * 기간별 수입 조회
	 * @param startDate 시작일
	 * @param endDate 종료일
	 * @return amount 금액
	 */
	public void getPeriodIncome(String startDate, String endDate) {
	}
	
	/**
	 * 기간별 상세 항목 조회 
	 * @param startDate 시작일
	 * @param endDate 종료일
	 * @param spendType 지출항목
	 * @return amount 금액
	 */
	public int getPeriodDetailSpend(String startDate, String endDate, String spendType) {
		return 0;
	}
	
	/**
	 * 수입삭제
	 * @param date 날짜
	 * @param sources 출처
	 * @param amount 금액
	 * @param account 계좌 
	 */
	public void removeIncome(String date, String sources, int amount, String account) {
		
	}
	
	
	
}
