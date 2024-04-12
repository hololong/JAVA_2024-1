/*
 * 작성일 2024년 4월 12일
 * 작성자 : 202195039 임서윤
 * 설명 : 1부터 입력받은수까지 합계
 * 
 * 문제 분석: 반복적으로 더하다가 입력받은수보다 수가 커지면 break
 * 
 * 알고리즘 : 
 */

import java.util.Scanner;

public class BreakTest1 {

	public static void main(String[] args) {
		// Scanner 객체 생성.
		Scanner stdin = new Scanner(System.in);
		// 정수 입력받기
		System.out.println("입력받은수 : ");
		int input_num = stdin.nextInt();
		int sum = 0;
		//1.초기값
		int num = 1;
		while(true) {  //무한반복
			sum = sum + num;  //합계 계산
			if (num >= input_num) {
				break;
			}
			num++;  //증감식
		}
		System.out.println("1부터" + input_num + "까지 합은" + sum + "입니다. ");
		

	}

}
