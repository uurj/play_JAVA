
public class practice {

	
	public static void main(String[] args) {
		
//		main1();
//		main2();
//		main3();
		main4();
	}
	
	public static void main4() {
		
		int[][] scores = new int[3][4];
				
		scores[0][1] = 90;
		scores[0][2] = 70;
		scores[0][3] = 80;
		
		scores[1][0] = 70;
		scores[1][1] = 60;
		scores[1][2] = 50;
		scores[1][3] = 88;

		scores[2][0] = 95;
		scores[2][1] = 87;
		scores[2][2] = 67;
		scores[2][3] = 92;
		
		for (int i = 0; i < scores.length; i++) {
			System.out.print((i+1) + "반 : " + "\t");
			
			int sum = 0; 
			for(int j = 0; j < scores[i].length; j++) {
				sum += scores[i][j];
				System.out.print(scores[i][j] + "\t");
			}
			System.out.print("총점: " + sum + ", 평균: " + (sum / scores[i].length));
			System.out.println();
			}
		}
	
	
	
	
	
	
	
	public static void main3() {
		
		String[] name = {"홍길동", "강감한", "이순신", "김유신", "유관순"};
		int[] score = {92, 85, 77, 98, 65};
		
		int total = 0;
		int avg = 0;
		
		for (int i = 0; i < name.length; i++) {
			System.out.println((i+1) + "번 " + name[i] + '\t' + score[i]);
			total += score[i];
			
	}	
			avg = total / score.length;
			System.out.println("총점 : " + total);
			System.out.println("평균 : " + avg);
	}
	
	
	public static void main2() {
		
		String[] name = {"홍길동", "강감한", "이순신", "김유신", "유관순"};
		for (int index = 0; index < name.length; index++) {
			System.out.println((index + 1) + "번 : " + name[index]);
		}
	}
	
	
	public static void main1() {
		
		// 배열연습_성적관리 평균과 총점 
		int[] score = {92, 85, 77, 98, 65};
		
		int total = 0;
		int avg = 0;
		
		for (int i = 0; i < score.length; i++) {
			System.out.println((i + 1) + "번 : " + score[i]);
			total += score[i];
		}
		avg = total / score.length;
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
	}
}