/*
 * 예약어 super
 */
class ST1a {
	public int x = 500;
	public int y = 1000;
}

class ST1b extends ST1a {
	public String x = "처음 시작하는 자바";
	public String xx = x + super.x;    // 상위 클래스의 멤버변수 x에 접근
	public String yy = y + " " + super.y;   // 상위 클래스의 멤버변수 y에 접근
						// y == super.y
	
	// x, xx, yy , 상속받은 y, 상위 클래스 x는 없다.
	// 상위 클래스 x는 없다. 그래서 super을 통해서 상위 클래스 x에 접근한다.
}
public class SuperTest1 {
	public static void main(String[] args) {
		ST1b st2 = new ST1b();
		
		System.out.println("객체 sb2에 들어 있는 x, y 값 : " + st2.x + st2.y);
		System.out.println("객체 sb2에 들어 있는 xx값 : " + st2.xx);
		System.out.println("객체 sb2에 들어 있는 yy 값 : " + st2.yy);
	}

}
