/*
 * 작성일 2024년 3월26일
 * 작성자 : 202195039 임서윤
 * 설명 : 세 자리의 십진수를 입력받아 각자리의 숫자들이 짝수인지 홀수인지 판단.
 * 
 * [문제분석]
 * 		짝수는 2로 나눈 나머지가 0이다.
 * 		홀수는 2로 나눈 나머지가 1이다.(0이 아니다.)
 * 		세자리 수 : 100~999
 * 		예를들어 123을 입력했다면
 * 		백의 자리는 1 홀수
 * 		십의 자리는 2 짝수
 * 		일의 자리느 3 홀수. 출력한다.
 * 
 * 		백의 자리, 십의 자리, 일의 자리를 구분해야 한다.
 * 		힌트) 나누기와 나머지 연산자를 활용한다.
 * 		
 * [알고리즘]
 * 1. 세자리수를 입력한다.
 * 2. 세자리수가 맞는지 판단.
 * 3-1. 만약 100의 자리가 짝수이면
 * 		0은 짝수
 * 3-2. 100의 자리가 홀수이면
 * 		0은 홀수
 * 4-1. 만약 10의 자리가 짝수이면
 * 		0은 짝수
 * 4-2. 10의 자리가 홀수이면
 * 		0은 홀수
 * 5-1. 만약 1의 자리가 짝수이면
 * 		0은 짝수
 * 5-2. 1의 자리가 홀수이면
 * 		0은 홀수
 */
import java.util.Scanner;

public class SwitchTest4 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		//1. 세자리 정수를 입력 받는다.
		System.out.print("세 자리 정수를 입력하시오 : ");
		int num = stdIn.nextInt();
		
		//2. 세자리가 맞나?
		if(num>=100 && num < 1000) // 100 ~ 999
		{
			int num_100 = num / 100;        //100의 자리 몫 찾기
			int num_10 = (num % 100) / 10;        //10의 자리 몫 찾기
			int num_1 = (num % 100) % 10;        //1의 자리 몫 찾기
			
			//판단
		}
		else {    //3. 세 자리가 아니면
			System.out.println("잘못 입력하셨습니다. ");
			
		}
	}
}

