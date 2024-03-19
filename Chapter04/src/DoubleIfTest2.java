/*작성일 : 2024년 3월 19일
 * 작성자 : 컴퓨터소프트웨어공학부 202195039 임서윤
 * 설명 : 이중 if문 실습.
 * 		하나의 정수를 입력 받아 음수인지 양수인지 확인하는 프로그램.
 *
 * 문제분석 : 짝수 => 2로 나눈 나머지가 0이다.
 * 		   홀수 => 2로 나눈 나머지가 1이다. (0이 아니다.)
 * 		   (if)짝수 아니면(else) 홀수이다.
 * 		   홀수 아니면 짝수이다.
 * 
 * 알고리즘 : 1. 정수를 입력 받는다.
 * 		   2. 입력 받은 정수가 짝수인지 판단한다.
 * 			2-1. 00은 짝수이다. 출력
 * 		   3. 아니면
 * 			3-1. 00은 홀수이다. 출력
 */
import java.util.Scanner;

public class DoubleIfTest2 {

	public static void main(String[] args) {
		// Scanner 객체 생성.
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = stdIn.nextInt();
		
		if(num % 2==0) {
			System.out.println(num + "은(는) 짝수입니다.");
		}//if 종료 시점.
		else {
			System.out.println(num + "은(는) 홀수입니다.");
		}
		
		//조건과 상관없이 무조건 출력되는 문장.
		System.out.println("프로그램 종료.");
	}

}
