/*
 * 작성일 2024년 3월26일
 * 작성자 : 202195039 임서윤
 * 설명 : 조건식 연습.
 * 		월을 입력받아 해당 계절을 출력하시오.
 * 		3,4,5월 => 봄
 * 		6,7,8월 => 여름
 * 		9,10,11월 => 가을
 * 		12,1,2월 => 겨울
 * 
 * 문제분석 : 입력 받아야 할 값은
 * 		   1,2,3,4,5,6,7,8,9,10,11,12이다.
 * 		   0이나 13을 입력하면 => 해당 월은 없습니다 출력하자.
 * 
 * 		   switch ~ case 문 사용
 * 		   MtoS 사용
 * 
 */
import java.util.Scanner;

public class SwitchTest2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		//1. 정수를 입력 받는다.
		System.out.print("월을 입력하시오 : ");
		String month = stdIn.next();
		String MtoS;
		switch(month)
		{
			case "December":
			case "January":
			case "Febuary":
				MtoS = "겨울입니다.";
				break;
			case "March":
			case "April":
			case "May":
				MtoS = "봄입니다.";
				break;
			case "June":
			case "July":
			case "August":
				MtoS = "여름입니다.";
				break;
			case "September":
				System.out.print("멋진 9월과 ");
			case "October":
				System.out.print("아름다운 10월과 ");
			case "November":
				System.out.print("낙엽의 11월은 ");
				MtoS = "가을입니다.";
				break;
			default:
				MtoS = "1~12월을 벗어난 달입니다.";
				break;
		}
		System.out.println(MtoS);
	}

}
