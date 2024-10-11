import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

class JRadioButton1 extends JFrame implements ActionListener{
	JLabel jl;
	JCheckBox[] jc = new JCheckBox[5];
	String[] hobby = {"기타치기", "영화보기", "노래부르기", "놀러가기", "게임먹기"};
	
	JRadioButton[] jr = new JRadioButton[5];
	String[] age = {"20대", "30대", "40대", "50대", "60대"};
	
	public JRadioButton1() {
		jl = new JLabel();
		
		Container ct = getContentPane();
		ct.setLayout(new GridLayout(4,1));
		
		JLabel jl1 = new JLabel("당신의 취미는?");
		JLabel jl2 = new JLabel("당신의 나이는?");
		
		JPanel jp1 = new JPanel();   // 취미 영역
		JPanel jp2 = new JPanel();   // 나이 영역
		JPanel jp3 = new JPanel();   // 결과 영역
		
		JPanel hobbyPanel = new JPanel();
		JPanel agePanel = new JPanel();
		
		// 나이를 나타내는 라이도버튼 그룹 설정
		ButtonGroup gb = new ButtonGroup();
		
		// 취미와 나이를 나타내는 체크박스와 라디오 버튼 객체를 배열로 생성.
		for(int i = 0; i < 5; i++) {
			jc[i] = new JCheckBox(hobby[i]);
			jr[i] = new JRadioButton(age[i]);
			
			hobbyPanel.add(jc[i]);
			agePanel.add(jr[i]);
			
			// 이벤트를 받아들일 각 컴포넌트에 리스너 등록.
			jr[i].addActionListener(this);
			gb.add(jr[i]); // 버튼 그룹에 라디오버튼 객체 추가)
		}
		// 취미를 판넬 1에 붙히기
		jp1.add(jl1);
		jp1.add(hobbyPanel);
		
		// 나이를 판넬 2에 붙히기
		jp2.add(jl2);
		jp2.add(agePanel);
		
		// 결과 영역
		jp3.add(jl);
		
		// 컨테이너에 판넬 붙이기
		ct.add(jp1);
		ct.add(jp2);
		ct.add(jp3);
		
		setTitle("JRadioButton Test1");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s = "당신의 취미는 : ";
		for(int i = 0; i < 5; i++) {
			if(jc[i].isSelected() == true) {
				s = s + hobby[i] + ",";
			}
		}
		s = s + " | 당신의 나이는 : ";
		jl.setText(s + e.getActionCommand());
	}
}
public class JRadioButtonTest1 {

	public static void main(String[] args) {
		new JRadioButton1();
	}

}
