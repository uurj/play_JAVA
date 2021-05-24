package com.work.view;

public class GuGuDanTest {
/*
-- 1. for 구문을 활용한 구구단
-- 2. while 구문을 활용한 구구단
-- 3. do~while 구문을 활용한 구구단
-- 4. 반복문(본인이 편한 반복문사용)을 활용하여 짝수 구구단만 출력 : 2, 4, 6...단
-- 5. 반복문(본인이 편한 반복문사용)을 활용하여 홀수스텝의 구구단만 출력
 : 2*1 , 2*5... 곱해지는게 홀수인거

## 힌트 :
	-- 공백라인 : System.out.println() 
	-- 내용만출력(라인이동발생하지 않음) : System.out.print(출력내용);
	-- 일정간격띄우기 특수문자 : 백슬래쉬t
	-- 새로운 라인 이동 특수문자 : \n
	-- + 중복연산자 : 문자열이 오면 연결연산
		
-- 출력형식 :
	1. for 구문을 활용한 구구단
	2단		3단	......	9단
	2*1=2	3*1=3		9*1=9
	2*2=4
	....
	....
	2*9=18	3*9=27		9*9=81
	
-- 	4. 반복문을 활용하여 짝수 구구단만 출력	
	2단	4단	....	8단
	
-- 5. 반복문을 활용하여 홀수스텝의 구구단만 출력해보세요	
	2단		3단	......	9단
	2*1=2	3*1=3		9*1=9
	2*3=6	3*3=9		9*3=27
	..
	..
	2*9=18	3*9=27		9*9=81
 * 
 */
	
	
	
	public static void main(String[] args) {
		
		System.out.println("1. for 구문을 활용한 구구단");
		for (int dan = 2; dan <= 9; dan++) {
			System.out.print(dan + "단" + "\t" );
		}
		System.out.println("");
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
			System.out.print(j + "*" + i + "=" + (i*j) + "\t");
			}	
			System.out.println();
		}
		
		
		
		
		
		System.out.println();
		System.out.println("2. while 구문을 활용한 구구단");
		
		int a = 2;
		while(a <= 9) {
			System.out.print(a + "단\t");
			a++;
		}
		System.out.println("");
		a = 1;
		while (a <= 9) {
			int b = 2;
			while (b <= 9) {
				System.out.print(b + "*" + a + "=" + a*b + "\t");
				b++;
				}
			a++;
			System.out.println("");
			}
		
		
		
		System.out.println("3. do while 구문을 활용한 구구단");
		
		
		
		
		
		System.out.println();
		System.out.println("4. 반복문을 활용하여 짝수 구구단만 출력");
		
		for (int dan = 1; dan <= 4; dan++) {
			System.out.print(dan*2 + "단" + "\t" );
		}
		System.out.println("");
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 4; j++) {
			System.out.print(j*2 + "*" + i + "=" + (i*j) + "\t");
			}	
			System.out.println();
			}
	
		
		
		
		System.out.println();
		System.out.println("5. 반복문을 활용하여 홀수스텝의 구구단만 출력");

		
		for (int dan = 2; dan <= 9; dan++) {
			System.out.print(dan + "단\t");
		}
		System.out.println();
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.print(j + "*" + (i*2-1) + "=" + j*(i*2-1) + "\t");
				}
			System.out.println("");
			}
		
		
		}
	}
