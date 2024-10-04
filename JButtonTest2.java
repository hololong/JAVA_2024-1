import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

// 1) 처리할 이벤트 종류 결정.
// 2) 
class JButton2 extends JFrame implements ActionListener{
	JTextField jtf;
	public JButton2() {
		// 이미지 아이콘 객체 생성.
		ImageIcon apple = new ImageIcon("images\\apple.jpg");
		ImageIcon banana = new ImageIcon("images\\banana.jpg");
		ImageIcon persimmom = new ImageIcon("images\\persimmom.jpg");
		ImageIcon pear = new ImageIcon("images\\pear.jpg");
		ImageIcon grape = new ImageIcon("images\\grape.jpg");
		
		// 버튼 객체 생성.
		JButton app = new JButton("사과", apple);
		JButton ban = new JButton("바나나", banana);
		JButton per = new JButton("감", persimmom);
		JButton pea = new JButton("배", pear);
		JButton gra = new JButton("포도", grape);
				
		// 컨테이너 설정.
		Container ct = getContentPane();
		// 배치관리자 설정
		ct.setLayout(new GridLayout(3,2));
		// 텍스트 필드 생성.  - 전역변수로 생성자 바깥에 속성으로 선언하고 사용.
		jtf = new JTextField(10);
		// 컨테이너에 버튼 추가. 
		ct.add(app);
		ct.add(ban);
		ct.add(per);
		ct.add(pea);
		ct.add(gra);
		ct.add(jtf);
		// 3) 이벤트를 받아들일 각 컴포넌트에 리스너를 등록.
		app.addActionListener(this);
		ban.addActionListener(this);
		per.addActionListener(this);
		pea.addActionListener(this);
		gra.addActionListener(this);
		// 화면에 보이기
		setTitle("JButton Test2");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		}

	// 4) 리스너 인터페이스에 선언된 메소드를 오버라이딩 하여 이벤트 처리 루틴 작성
	// 이벤트 처리 메소드 작성.
	@Override
	public void actionPerformed(ActionEvent e) {
		// 텍스트 필드에 버튼의 문자열을 반환.
		jtf.setText(e.getActionCommand());
		
	}
	}
public class JButtonTest2 {

	public static void main(String[] args) {
		new JButton2();
	}

}
