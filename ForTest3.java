/*
 * 작성일 2024년 4월 5일
 * 작성자 : 202195039 임서윤
 * 설명 : 정수를 입력받아 그 수의 약수를 출력하시오.
 * 
 * 문제 분석: 약수는 어떤 정수를 나누어 떨어지게 하는 0이 아닌 정수
 * 		   1부터 입력 받은 수까지 반복하면서
 * 		   0으로 나누어 나머지가 0이 되는지 판단한다.
 * 		   1은 수로 나누어 나머지가 0인가?
 * 		   2은 수로 나누어 나머지가 0인가?
 *  	   3은 수로 나누어 나머지가 0인가?
 *  	    .
 *  		.
 *  	   23은 수로 나누어 나머지가 0인가?
 * 
 * 알고리즘 : 1. 정수을 입력받는다.
 * 		   2. 1부터 입력받은 수까지 1씩 증가하면서 반복한다.
 * 		   2. 입력된 정수 이하의 정수와 나누어 떨어지게 되는지
 * 		   	2-1. 입력받은 수를 수(1~입력 수)로 나누어 나머지가 0이면
 * 				2-1-1. 그 수를 출력한다.
 */

import java.util.Scanner;

public class ForTest3 {

	public static void main(String[] args) {
		//Scanner 객체 생성
		Scanner stdin = new Scanner(System.in);
		//정수 입력
		System.out.print("정수 입력: ");
		int input = stdin.nextInt();
		System.out.print(input + "의 약수 : ");
		for (int num = 1;/*초기값*/ num <=input;/*조건식*/ num++/*증감식*/) {
			if(input % num == 0) {
				System.out.println(num + "");
			}
		}
		
	}

}
