/*
 * 작성일 : 2024년 5월 3일
 * 작성자 : 202195039 임서윤
 * 설명 : 클래스 모음
 */
// main 메소드가 있는 클래스에만 public 붙인다.
// 다른 클래스에는 public 붙이지 않는다.
class PlusMinus{
		// 속성 정의
		// 변수 생성.
		int plus, minus;
		
		// 기능(메소드) 정의
		// plus 기능
		// 2개의 정수형 값을 전달 받아 합계를 구한 값을 돌려준다.
		public String plus(int x , int y) {
			plus = x + y;
			return "두 수의 합은 " + plus;
		}
		
		// minus 기능
		public String minus(int x, int y) {
			minus = x - y;
			return "두 수의 차는 " + minus;
		}
}

// 곱하기 나누기 클래스 생성.
// 더하기, 빼기, 곱하기, 나누기 기능을 다 가지고있다.
class MultiDiv extends PlusMinus{
		// 속성 정의
		int multi;
		double div;
		
		// multi 기능(메소드) 정의
		public String multi(int x, int y) {
			multi =x * y;
			return "두 수의 곱은 " + multi;
		}
		
		// div 기능(메소드) 정의
		// 접근 금지, 캡슐화.
		private String div(int x, int y) {
			div =x / y;
			return "두 수의 나눈 값은 " + div;
		}
}
public class Calculator {
	public static void main(String[] args) {
		// PlusMinus 클래스로부터 객체 생성.
		PlusMinus pm = new PlusMinus();  // + -
		// MultiDiv 클래스로부터 객체 생성
		MultiDiv md = new MultiDiv();  //+ - * /
		
		// 변수 선언.
		String sum, cha, multi, div;
		
		// pm 객체를 통해 PlusMinus 클래스에 있는 메소드 호출
		sum = pm.plus(10, 20);
		System.out.println(sum);
		
		// 객체를 통해서 minus 메소드 호출하여 결과 출력
		cha = pm.minus(10, 20);
		System.out.println(cha);
		
		// md 객체를 통해 MultiDiv 클래스에 있는 메소드 호출
		multi = md.multi(10, 20);
		System.out.println(multi);
		
		// md 객체를 통해서 더하기 결과 출력
		// 상속받아 사용하기에 plus 메소드 접근 가능.
		// 메시지가 요구하는 메소드가 자신의 클래스에 없으면
		// 상위 클래스에서 메소드를 찾는다.
		sum = md.plus(10, 20);
		System.out.println(sum);
		
		// md 객체를 통해서 div 메소드 호출
		// div 메소드가 private로 선언되어 접근 금지.
		// div = md.div(5, 2);  // 오류 발생.
		// System.out.println(div);
	}
}
