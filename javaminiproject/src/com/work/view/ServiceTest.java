package com.work.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

import com.work.model.service.IncomeService;
import com.work.model.service.SpendService;

/**
 * 테스트 클래스
 * 
 * @author ParkYuJung
 * @version ver.1.0
 * @since jdk1.8
 */
public class ServiceTest {
	
	/** 메인메뉴 출력화면 */
	public static void mainMenu() {
		printTitle("   * 가계부 Main Menu * ");
		System.out.println("  1. 수입");
		System.out.println("  2. 지출");
		System.out.println("  3. 예산");
		System.out.println("  0. 프로그램 종료");
		printLine();
		System.out.print("  입력 : ");
	}
	
	/** 메인메뉴 제어문 */
	public static void main(String[] args) {
		while(true) {
			mainMenu();
			int menuNo = inputNumber();
			switch(menuNo) {
			case 1:
				inCome();
				break;
			case 2:
				spend();
				break;
			case 3:
				budget();
				break;
			case 0:
				System.out.println("가계부 프로그램이 종료됩니다.");
				System.exit(0);
				break;
			default:
				System.out.println();
				System.out.println("[오류] 잘못된 번호입니다. 다시 입력해주세요.");
				break;
			
			}
		}
	}
	
	
	/** 수입메뉴 출력화면 */
	private static void incomeMenu() {
		printTitle("   * 수입 Menu * ");
		System.out.println("  1. 등록");
		System.out.println("  2. 조회");
		System.out.println("  3. 변경");
		System.out.println("  4. 삭제");
		System.out.println("  5. 돌아가기");
		System.out.println("  0. 프로그램 종료");
		printLine();
		System.out.print("  입력 : ");
	}
	
	/** 수입메뉴 제어문*/
	public static void inCome() {

		while(true) {
			incomeMenu();
			int incomemenuNo = inputNumber();
			switch(incomemenuNo) {
			case 1:
//			System.out.print(" 수입 출처 : ");
//			sources=r.next();
//			System.out.print(" 금액 : ");
//			amount=r.next();
//			String all = sources + " " + amount;
//			dic.put(all);
				addIncome();
				break;
			case 2:
				getIncome();
				break;
			case 3:
				setIncome();
				break;
			case 4:
				removeIncome();
				break;
			case 5:
				main(null);
				break;
			case 0:
				System.out.println("가계부 프로그램이 종료됩니다.");
				System.exit(0);
				break;
			default:
				System.out.println();
				System.out.println("[오류] 잘못된 번호입니다. 다시 입력해주세요.");
				break;
			}
		}
	}
	
	
	/** 지출메뉴 출력화면 */
	private static void spendMenu() {
		printTitle("   * 지출 Menu * ");
		System.out.println("  1. 등록");
		System.out.println("  2. 조회");
		System.out.println("  3. 변경");
		System.out.println("  4. 삭제");
		System.out.println("  5. 돌아가기");
		System.out.println("  0. 프로그램 종료");
		printLine();
		System.out.print("  입력 : ");
	}
	
	/** 지출메뉴 제어문 */
	private static void spend() {
		while(true) {
			spendMenu();
			int spendmenuNo = inputNumber();
			switch(spendmenuNo) {
			case 1:
				addSpend();
				break;
			case 2:
				getSpend();
				break;
			case 3:
				setSpend();
				break;
			case 4:
				removeSpend();
				break;
			case 5:
				mainMenu();
				break;
			case 0:
				System.out.println("가계부 프로그램이 종료됩니다.");
				System.exit(0);
				break;
			default:
				System.out.println();
				System.out.println("[오류] 잘못된 번호입니다. 다시 입력해주세요.");
				break;
			}
		}
	}
	
	
	/** 예산메뉴 출력화면 */
	private static void budgetMenu() {
		printTitle("   * 예산 Menu * ");
		System.out.println("  1. 등록");
		System.out.println("  2. 조회");
		System.out.println("  3. 변경");
		System.out.println("  4. 삭제");
		System.out.println("  5. 돌아가기");
		System.out.println("  0. 프로그램 종료");
		printLine();
		System.out.print("  입력 : ");
	}
	
	/** 예산메뉴 제어문 */
	private static void budget() {
		while(true) {
			budgetMenu();
			int budgetmenuNo = inputNumber();
			switch(budgetmenuNo) {
			case 1:
				addBudget();
				break;
			case 2:
				getBudget();
				break;
			case 3:
				setBudget();
				break;
			case 4:
				removeBudget();
				break;
			case 5:
				main(null);
				break;
			case 0:
				System.out.println("가계부 프로그램이 종료됩니다.");
				System.exit(0);
				break;
			default:
				System.out.println();
				System.out.println("[오류] 잘못된 번호입니다. 다시 입력해주세요.");
				break;
			}
			}
	}
	
	//메소드들..
	private static void removeIncome() {
		
	}

	private static void setIncome() {
		
	}

	private static void getIncome() {
		IncomeService.getAllIncome();
	}
	
	private static void addIncome() {
		try {
			IncomeService.income();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void removeSpend() {
		
	}

	private static void setSpend() {
		
	}

	private static void getSpend() {
		
	}

	private static void addSpend() {
		try {
			SpendService.spend();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void removeBudget() {
		
	}

	private static void setBudget() {
		
	}

	private static void getBudget() {
		
	}

	private static void addBudget() {
		
	}

	
	/** 출력 간략화 메서드 */
	public static void printLine() {
		System.out.println("''''''''''''''''''''''''''");
	}
	public static void printTitle(String title) {
		System.out.println();
		printLine();
		System.out.println(title);
		printLine();
	}
	
		/** 객체생성없이 사용가능한 키보드로부터 읽은 데이터를 문자열로 반환하는 메서드 */
		public static String inputString() {
			String data = null;
			try {
				BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
				data = in.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return data;
		}
		
		/** 객체생성없이 사용가능한 키보드로부터 읽은 데이터를 int로 반환하는 메서드 */
		public static int inputNumber() {
			String data = null;
			try {
				BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
				data = in.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return Integer.parseInt(data);
		}
}
