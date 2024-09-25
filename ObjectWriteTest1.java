

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;
//이 클래스를 직렬화 하여 사용.
class PersonInfo implements Serializable{
	String name;
	String city;
	int age;
	
	public PersonInfo(String name, String city, int age) {
		this.name = name;
		this.city = city;
		this.age = age;
	}
}
public class ObjectWriteTest1 {

	public static void main(String[] args) throws Exception, IOException{
		Scanner stdIn = new Scanner(System.in);
		System.out.print("저장할 파일명을 입력 하세요 : ");
		String s = stdIn.next();
		String s1 = "*** 고객 정보 ***";
		
		// 직렬화된 객체를 2개 생성.
		PersonInfo p1 = new PersonInfo("임서윤", "부산", 23);
		PersonInfo p2 = new PersonInfo("밍망규", "부산", 23);
		
		// 파일에 출력하기 위한 객체 생성.
		// 직렬화된 객체를 2진수로 기록할 파일 지정.
		// 객체를 기록 할 객체 생성.
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(s));
		
		//직렬화된 객체를 파일에 2진수로 기록.
		oos.writeObject(s1);
		oos.writeObject(p1);
		oos.writeObject(p2);
		
		oos.close();
		
		System.out.println(s + "파일명으로 객체 파일을 생성.");
	}

}
