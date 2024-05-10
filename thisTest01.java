class Box1{
	int width, height, depth;  // 멤버 변수
	
	// 생성자.
	public Box1(int w, int h, int d) {
		width = w;
		height = h;
		depth = d;
	}
}
public class thisTest01 {

	public static void main(String[] args) {
		Box1 mybox = new Box1(1, 2, 3);
		System.out.println(mybox.width);

	}

}
