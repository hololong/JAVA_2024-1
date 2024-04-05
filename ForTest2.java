/*
 * 작성일 2024년 4월 5일
 * 작성자 : 202195039 임서윤
 * 설명 : 알고싶은 단을 입력 받아 구구단을 출력하시오.
 * 
 * 문제 분석: 단은 고정이다. 입력받는다.
 * 		   곱하는 수는 1부터 9까지 1씩 증가한다.
 * 		   곱셈의 결과는 단 * 수 이다.
 * 		   구구단 곱셈의 과정이 하나씩 출력되야 한다.
 * 
 * 알고리즘 : 1. 단을 입력받는다.(정수)
 * 		   2. 곱하는 수는 1부터 (초기값)
 * 		   3. 곱하는 수는 9까지 반복하면서 (조건식)
 *				3-1. 구구단 출력한다.
 *				3-2. 곱하는 수를 1씩 증가시킨다. (증감식) 		
 */

import java.util.Scanner;

public class ForTest2 {

	public static void main(String[] args) {
		//Scanner 객체 생성
		Scanner stdIn = new Scanner(System.in);
		//단 입력 받기
		System.out.print("알고 싶은 단 입력 : ");
		int dan = stdIn.nextInt();
		//곱하는 수는 1부터
		for(int su=1; su<=9; su++) {
			System.out.println(dan + "X" + su + "=" +dan*su);
		}

	}

}
