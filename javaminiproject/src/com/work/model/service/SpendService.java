package com.work.model.service;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 지출 관련 서비스
 * 
 * @author ParkYuJung
 * @version ver.1.0
 * @since jdk1.8
 */
public class SpendService {
	
	/** 자료저장구조 */
	private static ArrayList<SpendService> list = new ArrayList<SpendService>();
	
	public SpendService(String outstr, Integer outmonstr) {
		}

	/**
	 * 지출등록
	 * @param date 날짜
	 * @param amount 금액
	 * @param spendType 지출항목
	 * @param methodPayment 결제수단
	 */
	public void addSpend(String date, int amount, String spendType, String methodPayment) {
	 list.add(this);
	}
	
	 public static void spend() throws Exception{
	        Scanner scanner=new Scanner(System.in);
	 
	        System.out.println();
	        System.out.println("==가계부 지출 입력==");
	        System.out.print("지출 항목 : ");
	        String outstr=scanner.nextLine();
	 
	        System.out.print("지출 금액  : ");
	        Integer outmonstr=scanner.nextInt();
	 
	        SpendService.put(outstr,outmonstr);
	        list.add(new SpendService(outstr,outmonstr));
	        System.out.println("지출이 등록되었습니다.");
	    }
	 
	
	private static void put(String outstr, Integer outmonstr) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 지출전체조회
	 * @return amount 금액
	 */
	public int getAllSpend() {
		return 0;
	}
	
	/**
	 * 기간별 항목 전체 지출 조회
	 * @param startDate 시작일
	 * @param endDate 종료일
	 * @return amount
	 */
	public int getPeriodSpend(String startDate, String endDate) {
		return 0;
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
	 * 결제수단별조회
	 * @param startDate 시작일
	 * @param endDate 종료일
	 * @param methodPayment 결제수단
	 * @return amount 금액
	 */
	public int getMethodPaymentSpend(String startDate, String endDate, String methodPayment) {
		return 0;
	}
	
	
	/**
	 * 지출내역변경
	 * @param date 날짜
	 * @param amount 금액
	 * @param spendType 지출항목
	 * @param methodPayment 결제수단
	 * @param modify 수정내용
	 */
	public void setSpend(String date, int amount, String spendType, String methodPayment, int modify) {
		
	}
	
	/**
	 * 지출삭제
	 * @param date 날짜
	 * @param amount 금액
	 * @param spendType 지출항목
	 * @param methodPayment 결제수단
	 */
	public void removeSpend(String date, int amount, String spendType, String methodPayment) {
		
	}
	
	
}
