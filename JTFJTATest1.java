import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class JTFJTA1 extends JFrame implements ActionListener {
	private JTextField input;
	private JTextArea output;
	
	private JLabel j1 = new JLabel("입력하세요.");
	
	public JTFJTA1() {
		input = new JTextField(20);  // 20칸
		output = new JTextArea(10, 20);   // 10중 20칸
		output.setEnabled(false); // 수정 불가 설정.
		
		// 2. 컨테이너 설정.
	    Container ct = getContentPane();
	    // 3. 배치관리자 설정
	    ct.setLayout(new FlowLayout());
	    JPanel p1 = new JPanel();
	    
	    // 판넬에 in, out 추가.
	    p1.add(input);
	    p1.add(output);
	    // 컨테이너에 판넬과 레이블 추가.
	    ct.add(p1);
	    ct.add(j1);
	    
	    // 리스너 등록.
	    input.addActionListener(this);
	    
	    setTitle("텍스트 필드와 텍스트 에어리어");
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(output.getLineCount() <= output.getRows()) {
			output.append(e.getActionCommand()+"\n");
			input.setText("");
		}else {
			j1.setText("입력이 종료되었습니다.");
			input.setEditable(false);
		}
		
	}
	
}
public class JTFJTATest1 {

	public static void main(String[] args) {
		new JTFJTA1();

	}

}
