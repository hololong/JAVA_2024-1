/*
 * 작성일 : 2024년 4월 16일
 * 작성자 : 202195039 임서윤
 * 설명 : 1차원 배열에 정수 값을 저장하여 생성하시오
 * 		 사용자로부터 정수를 하나 입력받아 그 정수가 어디에 몇개 있는지 출력하시오.
 * 		 입력한 값이 배열에 없다면 "입력한 값이 없습니다."를 출력하시오.
 * 
 * 1. 배열에 값 저장하여 선언
 * 2. 찾고 싶은 정수를 입력 받는다.
 * 3. 배열의 길이까지 반복하면서
 * 		3-1. 입력받은 수와 배열 각 번지에 저장된 값이 같은지 비교한다.
 * 			input_num == num[i]
 * 		  3-1-1. 같은 수가 있으면 count를 증가시킨다.
 * 		  3-1-2. 현재 위치의 번지를 출력한다.
 * 4. count가 0이면
 * 		4-1. 일치하는 값이 없다.
 * 5. 아니면(count에 개수가 있으면)
 * 		5-1. 입력한 수0이 0개 있다. 
 */

import java.util.Scanner;

public class ArrayTest03 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int num[] = {23, 87, 65, 59, 38, 5, 7, 8, 9, 10, 51, 45};
		System.out.println("찾고 싶은 숫자 입력 : ");
		int input = stdin.nextInt();
		int count = 0;  //횟수 저장 변수 선언
		//일치하는 값이 있는지 체크.. count = 0
		for(int i = 0; i < num.length; i++) {
			if(input == num[i]) {
				count++;  //개수 증가
				//위치 출력
				System.out.println("num[" + i + "] 데이터와 일치");
			}
		}
		if(count == 0)
				System.out.println("일치하는 값이 없다.");
		else
				System.out.println(input + "이" + count + "개 있습니다.");
		
	}
}
