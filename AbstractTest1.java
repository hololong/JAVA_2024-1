abstract class Shape{   // 추상 클래스
	// 추상 메소드 선언 - 그리기
	abstract void draw();
	// 추상 메소드 선언 - 넓이
	abstract void computeArea(double a, double b);
}
class Rectangle1 extends Shape{  // 상속
	// 메소드 오버라이딩 - 구체적으로 구현
	void draw() {
		System.out.println("사각형을 그리는 기능");
	}
	// 메소드 오버라이딩 - 구체적으로 구현
	void computeArea(double h, double v) {
		System.out.println("사각형의 넓이 : " + (h * v));
	}
}
class Triangle1 extends Shape{  // 상속
	// 메소드 오버라이딩 - 구체적으로 구현
	void draw() {
		System.out.println("삼각형을 그리는 기능");
	}
	// 메소드 오버라이딩 - 구체적으로 구현
	void computeArea(double a, double h) {
		System.out.println("삼각형의 넓이 : " + (a * h / 2));
	}
}
public class AbstractTest1 {

	public static void main(String[] args) {
		System.out.println("==추상 메소드를 이용한 다형성==");
		Shape s = new Rectangle1();
		s.draw();
		s.computeArea(5.0, 10.0);
		s = new Triangle1();
		s.draw();
		s.computeArea(5.0, 10.0);
	}

}
