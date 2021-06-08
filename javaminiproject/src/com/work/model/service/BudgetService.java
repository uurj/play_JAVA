package com.work.model.service;

import java.util.ArrayList;

/**
 * 예산 관련 서비스
 * 
 * @author ParkYuJung
 * @version ver.1.0
 * @since jdk1.8
 */
public class BudgetService {
	
	/** 자료저장구조 */
	private ArrayList<BudgetService> list = new ArrayList<BudgetService>();
	
	/**
	 * 예산등록
	 * @param startDate 시작일
	 * @param endDate 종료일
	 * @param amount 금액 
	 */
	public void addBudget (String startDate, String endDate, int amount) {
		
	}
	
	/**
	 * 예산내역변경
	 * @param startDate 시작일
	 * @param endDate 종료일
	 * @param amount 금액
	 * @param modifyBudget 
	 * @param modifyDate
	 */
	public void setBudget(String startDate, String endDate, int amount, String modifyDate, int modifyBudget) {
		
	}
	
	/**
	 * 예산삭제
	 * @param startDate 시작일
	 * @param endDate 종료일
	 * @param amount 금액
	 */
	public void removeBudget(String startDate, String endDate, int amount) {
	}
}
