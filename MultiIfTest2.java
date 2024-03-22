/*
 * 작성일 2024년 3월22일
 * 작성자 : 202195039 임서윤
 * 설명 : 다중 if문 실습.
 * 		점수를 입력받아 학점을 출력하시오.
 * 
 * 문제분석 : 90점 이상이면 A학점
 * 		   80점 이상이면 B학점
 * 		   70점 이상이면 C학점
 * 		   60점 이상이면 D학점
 * 	 	   60점 미만이면 F학점
 * 		   점수는 정수로 입력 받는다.
 * 
 * 알고리즘 : 1. 점수(정수)를 입력받는다.
 * 		   2. 점수가 90점 이상인가?         if
 * 			2-1. A학점입니다. 출력
 * 		   3. 아니면 점수가 80점 이상인가?        else if
 * 			3-1. B학점입니다. 출력
 * 		   4. 아니고 점수가 70점 이상인가?        else if
 * 			4-1. C학점입니다. 출력
 * 		   5. 아니고 점수가 60점 이상인가?        else if
 * 			5-1. D학점입니다. 출력
 * 		   6. 아니면(나머지는)             else
 * 			6-1. F학점입니다. 출력
 */

import java.util.Scanner;

public class MultiIfTest2 {

	public static void main(String[] args) {
		// Scanner 객체 생성.
		Scanner stdIn = new Scanner(System.in);
		
		// 1. 정수를 입력 받는다.
				System.out.print("점수 입력 : ");
				int Score = stdIn.nextInt();
				
		if(Score >= 90 && Score <= 100) {  //90점 이상이고, 100점 이하
			System.out.println("A학점입니다. ");
		}else if(Score >= 80 && Score <=90) {
			System.out.println("B학점입니다. ");
		}else if(Score >= 70 && Score <=80) {
			System.out.println("C학점입니다. ");
		}else if(Score >= 60 && Score <=70) {
			System.out.println("D학점입니다. ");
		}else if(Score >= 0 && Score <=60){
			System.out.println("F학점입니다. ");
		}
		else {
			System.out.println("잘못된 점수입니다. ");
		}
	}
}