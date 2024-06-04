/*
 * Shape 클래스를 작성하고 이를 상속받는 Circle 클래스를 작성하세요.
 * 
 * Shape 클래스에는 String color 속성을 추가하고, 이를 설정하는 생성자를 작성합니다.
 * Circle 클래스는 Shape 클래스를 상속받고, double radius 속성을 추가하여 이를 설정하는 생성자를 작성합니다.
 * Circle 클래스에 원의 면적과 둘레를 계산하는 메소드를 작성합니다.
 * 
 * 사용자로부터 원의 반지름과 색상을 입력받아, 해당 원의 정보를 출력하는 프로그램을 작성하세요.
 * 
 * [출력결과]
 * 원의 색상을 입력하세요 : 빨강
 * 원의 반지름을 입력하세요 : 
 */

import java.util.Scanner;

class Shape2{
	// 멤버 변수 - 속성.
	String color;
	// 매개 변수가 없는 생성자. - 이름 초기화.
	public Shape2() {
		this.color = "";
	}
	// 매개 변수가 있는 생성자 - 오버로딩 : 이름을 전달 받아 초기화.
	public Shape2(String color) {
		this.color = color;
	}
	// 색상 출력 메소드
	public void printInfo() {
		System.out.print("원의 색상을 입력하세요 : " + color);
}
}
class Circle2 extends Shape2{
	double radius;
	public Circle2(String color, double radius) {
		super(color);
		this.radius = radius;
	}
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("원의 반지름 : " + radius);
		System.out.println("원의 면적 : " + radius * radius * 3.14);
		System.out.println("원의 둘레 : " + 2 * radius * 3.14);
	}
	
}
public class ShapeClass {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("원의 색상을 입력하시오 : ");
		String color = stdIn.nextLine();
		System.out.println("원의 반지름을 입력하시오 : ");
		Double radius = stdIn.nextDouble();
		
		// 매개 변수가 있는 생성자 호출
		Circle2 shape = new Circle2(color,radius);
		shape.printInfo();  // 출력 메소드 호출.
	
	}
}