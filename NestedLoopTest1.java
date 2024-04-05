/* 작성일 2024년 4월 5일
 * 작성자 : 202195039 임서윤
 * 설명 : 전체 구구단 작성하기
 * [문제분석]: 단은 2~9까지
 * 		   곱하는 수는 1~9까지
 * 		   2단 출력하고, 3단 출력하고, ... 9단 출력한다.
 *
 * [알고리즘]
 * 	   ---for ---
 * 		1. 단은 2부터 9까지 반복한다.
 * 			= 0 단 = 춮력
 * 			1-1. 곱하는 수는 1부터 9까지 반복한다.
 * 				1-1-1. 구구단 출력한다.
 * 	  --- while ---
 * 		1. 단은 2단부터
 * 		2. 단은 9단까지 반복
 * 			2-1. 수는 1부터
 * 			2-2. 수는 9까지 반복
 * 				2-2-1. 구구단 출력한다.
 * 				2-2-2. 수를 1증가시킨다.
 * 			2-3. 단을 1증가시킨다.
 */ 
public class NestedLoopTest1 {

	public static void main(String[] args) {
		int input=2;
		while(input <=9) {
			System.out.println("수 입력: ");
			for(int j=1; j<=9; j++) 
			{
				System.out.println((input + "*" + j + "=" +input*j));			
			}
			System.out.println();
			input++;
		}
	}
}
