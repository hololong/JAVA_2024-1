/*
 * 작성일 2024년 4월 12일
 * 작성자 : 202195039 임서윤
 * 설명 : 점수를 입력 받아 합계와 평균을 출력하시오.
 * 		 음수가 입력되면 점수 입력이 종료됩니다.
 * 		 100점 초과의 점수는 계산에 포함되지 않습니다.
 * 
 * 문제 분석: 
 * 
 * 알고리즘 : 
 */

import java.util.Scanner;

public class ContinueBreak1 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int sum = 0;
		int count =0;
		int avg = 0;
		while (true) {
			// 객체 생성
			System.out.println("점수 입력 : ");
			int score = stdin.nextInt();
			if(score > 100) {
				System.out.println("점수를 다시 입력하세요. ");
				continue;
			}
			if(score >0) {
				sum += score;
				count++;
				avg = (sum/count);
			}else {
	            System.out.println("취소합니다.");
	            break;
			}
	      }
	      System.out.println("합계 : " + sum + "평균 : " + avg  + "입니다.");
	      

	   }

	}

