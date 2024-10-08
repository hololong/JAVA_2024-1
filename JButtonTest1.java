import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

class JButton1 extends JFrame{
	public JButton1() {
		// 이미지 아이콘 객체 생성.
		ImageIcon korea = new ImageIcon("images\\korea1.gif");
		ImageIcon usa = new ImageIcon("images\\usa.gif");
		ImageIcon germany = new ImageIcon("images\\germany.gif");
		
		// 버튼 객체 생성.
		JButton nat = new JButton(korea);   // 기본 버튼 이미지.
		nat.setPressedIcon(usa);  // 버튼 누르면 미국 국기.
		nat.setRolloverIcon(germany);   // 버튼에 마우스 올리면 독일 국기.
		
		// 컨테이너 설정.
	    Container ct = getContentPane();
	    // 배치관리자 설정
	    ct.setLayout(new FlowLayout());
	    // 컨테이너에 버튼 추가. nat
	    ct.add(nat);
	    // 화면에 보이기
	    setTitle("JButton Test");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

public class JButtonTest1 {

	public static void main(String[] args) {
		new JButton1();
	}

}
