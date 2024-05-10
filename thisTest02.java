class Box2{
	int width, height, depth;  // 멤버 변수
	
	// 생성자.
	// 매개변수의 의미가 명확해 졌다.
	public Box2(int width, int height, int depth) {
		width = width;
		height = height;
		depth = depth;
	}
}
public class thisTest02 {

	public static void main(String[] args) {
		Box2 mybox = new Box2(1, 2, 3);
		System.out.println(mybox.width);

	}

}
