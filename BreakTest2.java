/*
 * 작성일 2024년 4월 12일
 * 작성자 : 202195039 임서윤
 * 설명 : 중첩 사용된 반복문에서 break문 사용
 * 
 * 문제 분석: 
 * 
 * 알고리즘 : 
 */
public class BreakTest2 {
	public static void main(String[] args) 
	{
		int i, j;
		for(i=1 ; i < 10 ; i++) 
		{
			for(j = 1; j < i; j++)
			{
				if(j>6) {
					break;
				}
				System.out.print("♥");
			}
			System.out.println();
		}
	}

}
