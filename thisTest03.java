class Box3{
	int width, height, depth;  // 멤버 변수
	
	// 생성자.
	// 매개변수의 의미가 명확해 졌다.
	public Box3(int width, int height, int depth) {
		// this는 현재 객체 변수를 의미.
		// 객체 변수 width 에 매개변수 width 값을 저장.
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
}
public class thisTest03 {

	public static void main(String[] args) {
		Box3 mybox = new Box3(1, 2, 3);
		System.out.println(mybox.width);
		// 묵시적 값인 0이 출력된다.
	}

}
