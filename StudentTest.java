/*
 * person클래스를 작성하세요.
 * 이 클래스는 다음과 같은 속성을 가집니다.
 * String name
 * 
 * Person 클래스는 다음과 같은 메소드를 가집니다.
 * 
 * 기본 생성자 : 이름을 "홍길동"으로 초기화합니다.
 * 매개변수 생성자 : 이름을 입력받아 초기화합니다.
 * printInfo()메소드 : 사람의 이름을 출력합니다.
 * 
 * Person 클래스를 상속하는 Student 클래스를 작성하세요.
 * 이 클래스는 다음과 같은 속성을 추가로 가집니다.
 * String major
 * 
 * Student 클래스는 다음과 같은 메소드를 가집니다.
 * 기본 생성자 : 부모 클래스의 기본 생성자를 호출하고, major를 "기계공학과"로 초기화합니다.
 * 매개변수 생성자 : 이름과 전공을 입력받아 초기화합니다.
 * printInfo() 메소드 : 부모 클래스의 printInfo() 메소드를 호출하고, 전공을 추가로 출력합니다.
 * 
 * [출력결과]
 * 이름을 입력하시오 : 임서윤
 * 전공을 입력하시오 : 컴퓨터공학부
 * 
 * 이름 : 임서윤
 * 학과 : 컴퓨터공학부
 */
import java.util.Scanner;
class Person{
	// 멤버 변수 - 속성.
	String name;
	
	// 매개 변수가 없는 생성자. - 이름 초기화.
	public Person() {
		this.name = "홍길동";
	}
	// 매개 변수가 있는 생성자 - 오버로딩 : 이름을 전달 받아 초기화.
	public Person(String name) {
		this.name = name;
	}
	// 이름 출력 메소드
	public void printInfo() {
		System.out.print("이름 : " + name);
	}
}
//상속.
class Student1 extends Person{
	String major;  // 전공 멤버 변수 추가.
	
	// 매개 변수가 없는 생성자
	public Student1() {
		super();  // 부모 클래스의 기본 생성자를 호출.
		this.major = "기계공학과";
	}
	// 매개 변수가 있는 생성자 - 오버로딩
	public Student1(String name, String major) {
		super(name);  // 매개 변수가 있는 생성자 호출.
		this.major = major;
		}
	@Override
	// 오버라이딩 - 재정의
	public void printInfo() {
		super.printInfo();  // 상위 클래스의 메소드 호출.
		System.out.println(", 전공 : " + major);
	}
}
public class StudentTest {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("이름을 입력하시오 : ");
		String name = stdIn.nextLine();
		System.out.println("전공을 입력하시오 : ");
		String major = stdIn.nextLine();
		
		// 매개 변수가 있는 생성자 호출
		Student1 student = new Student1(name, major);
		student.printInfo();  // 출력 메소드 호출.
	}

}
