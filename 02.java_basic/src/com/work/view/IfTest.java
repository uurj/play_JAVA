package com.work.view;

public class IfTest {
	
	public static void main(String[] args) {
		int score = 60;
		String grade = null;
		
		if (score >= 0 & score <= 100) {
		switch (score / 10) {
		case 10:
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default :
			grade = "F";
			break;
		}
		System.out.println("점수 : " + score + " 등급 :" + grade);
		}
		} 
		
	
	
	
	
	
	/* 실습
	 * 성적에 따라 등급을 출력하는 프로그램
	 * 성적은 0~100점 이내
	 * A : 90~100
	 * B : 80~89
	 * C : 70~79
	 * D : 60~69
	 * F : 0~59
	 * 
	 * -출력형식
	 * 00점 0등급
	 */
	
	public static void main2(String[] args) {
		int score = -53;
				
		if (score >= 0 & score <= 100) {
		
		System.out.println(score + "점 A등급" );
	} else if  (score >= 80) {
		System.out.println(score + "점 B등급");
	} else if (score >= 70) {
		System.out.println(score + "점 C등급");
	} else if (score >= 60) {
		System.out.println(score + "점 D등급");
	} else {
		System.out.println(score + "점 F등급");
			}
	}
	

	public static void main1(String[] args) {
		//성적을 변수에 저장
		int score = 65;
		
		//70점 이상이면 합격 미만이면 불합격
		if (score >= 70) {
		System.out.println(score + "합격");
		} else { 
			System.out.println(score + "불합격");
		}
	}

}
