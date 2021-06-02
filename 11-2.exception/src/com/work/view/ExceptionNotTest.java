package com.work.view;

public class ExceptionNotTest {
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		// 이름 : 홍길동 강감찬 이순신 : 배열에 저장, 선언 + 생성 +초기화 동시수행
		String[] names = {"홍길동", "강감찬", "이순신"};
		
		// for 구문이용해서 5번 반복하면서 배열저장된 이름정보를 출력
		for(int index = 0; index < 5; index++) {
			System.out.println(names[index]); // 예외발생 가능 코드
		}
		
		System.out.println("프로그램 정상 종료");
		
		/* 수행결과
		 * 프로그램시작
		 * 0 - 홍길동
		 * 1 - 강감찬
		 * 2 - 이순신
		 * 3 - 배열요소 범위를 벗어난 부분 접근 예외 발생 : ArrayIndexOutOfBoundsException
		 * 4. 해당 예외처리 여부 체킹
		 * 5. 예외처리가 되어잇지 않으면 콘솔창 예외발생 트래킹 정보와 예외메세지 출력
		 * 6. 프로그램 강제종료 
		 */
	}

}
