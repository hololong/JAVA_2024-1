/*
 * 작성일 : 2024년 4월 16일
 * 작성자 : 202195039 임서윤
 * 설명 : 1차원 배열을 생성하고, 묵시적 초기값을 출력한다.
 * 		 사용자로부터 값을 입력받아 배열에 저장하고, 합과 평균을 출력하시오.
 */

import java.util.Scanner;

public class ArrayTest01 {

	public static void main(String[] args) {
		//Scanner 객체 생성
		Scanner stdin = new Scanner(System.in);
		int i,sum = 0;
		double avg;
		int num[] = new int[5];  //배열 선언 및 생성.
		System.out.println("배열의 길이 : " + num.length);  //num.length 배열 길이
		
		System.out.println("배열에 저장된 초기값");
		for(i = 0; i < 5; i++) {
			System.out.println("num[" + i + "] = " + num[i]);
			//System.out.println(num[0]);
			//System.out.println(num[1]);
			//System.out.println(num[2]);
		}
		// 사용자로부터 값 입력 받아 배열에 저장.
		System.out.println("사용자로부터 값 입력 받아 배열에 저장");
		for(i = 0; i < num.length; i++) {
			System.out.print("num[" + i + "] 번지에 데이터 입력 : ");
			num[i] = stdin.nextInt();
			//num[0] = stdin.nextInt();
			//num[1] = stdin.nextInt();
			//num[2] = stdin.nextInt();
		}
		
		// 배열에 저장된 값 출력
		System.out.println("배열에 저장된 초기값");
		for(i = 0; i < 5; i++) {
			System.out.println("num[" + i + "] = " + num[i]);
		}
		
		//배열에 저장된 값들의 합과 총점 계산하여 출력
		//sum = sum + num => num[0] + num[1] + num[2] ...
		System.out.println("배열에 저장된 값들의 합과 총점 계산하여 출력");
		for(i = 0; i < 5; i++) {
			sum = sum + num[i];
		}
		avg = (double)sum / num.length;  //sum / 5   형변환 (double)쓰기
			System.out.println("배열에 저장된 값들의 합 :" + sum);
			System.out.println("배열에 저장된 값들의 평균 :" + avg);
}
}