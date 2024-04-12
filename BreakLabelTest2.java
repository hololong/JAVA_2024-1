/*
 * 작성일 2024년 4월 12일
 * 작성자 : 202195039 임서윤
 * 설명 : 구구단
 * 
 * 문제 분석: 
 * 
 * 알고리즘 : 
 */
public class BreakLabelTest2 {
	public static void main(String[] args) 
	{
		int i = 2,j;
		Loop : while(true)
		{
			j=1;
			if(i < 10) 
				System.out.println("|n=== " + i + "단===");
			Innerloop : while(true) 
			{
				if (j > 9) break;
				if (i > 9) break Loop;
				System.out.println(i + " * " + j + "=" +i*j);
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
