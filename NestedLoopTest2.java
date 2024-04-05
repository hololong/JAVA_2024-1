/* 작성일 2024년 4월 5일
 * 작성자 : 202195039 임서윤
 * 설명 : 정수를 입력하시오 : 5
 * *
 * **
 * ***
 * ****
 * *****
 */

import java.util.Scanner;

public class NestedLoopTest2 {

	public static void main(String[] args) 
	{
		// Scanner 객체 생성.
		Scanner stdIn = new Scanner(System.in);
		System.out.println("정수를 입력하시오 : ");
		int num = stdIn.nextInt();
		int jul = 1;  //초기값
		while (jul <= num  /*조건식*/) {
			int kan = 1;
			while(kan <= jul) {
				System.out.print("★");
				kan++;
			}
			System.out.println("");  //줄바꿈.
			jul++; //증감식
		}
	}
}
