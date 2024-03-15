/*
 * 작성일 : 2024년 3월 15일
 * 작성자 : 컴퓨터소프트웨어공학부 202195039 임서윤
 * 설명 : 연산과 자료형.
 * 		두개의 정수를 입력 받아 평균을 계산하는 프로그램.
 * 
 * 		1. 두 정수를 입력 받는다.
 * 		2. 평균을 계산한다.
 * 		3. 평균을 출력한다.
 */
//입력을 위한 라이브러리 추가.
import java.util.Scanner;

public class DataTypeOper {

	public static void main(String[] args) {
		// 두개의 정수를 입력 받는다.
		// Scanner 객체 생성.
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 입력 : ");
		int num1 = stdIn.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		int num2 = stdIn.nextInt();
		
		//평균을 계산한다.
		double avg1 = (num1 + num2) / 2; 
		System.out.println("정수 연산 : " + num1 + " + " + num2 + " = " + avg1);
		
		double avg2 = (num1 + num2) / 2.0; 
		System.out.println("실수 연산 : " + num1 + " + " + num2 + " = " + avg2);


	}

}
