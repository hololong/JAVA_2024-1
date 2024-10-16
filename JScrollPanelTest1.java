import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

class JScrollPanel extends JFrame {
	public JScrollPanel() {
		Container ct =getContentPane();
		JPanel jp = new JPanel();
		jp.setLayout(new GridLayout(20,5));
		
		// 패널(jp)에 100개의 버튼 추가
		for(int i = 1; i<= 100; i++ ) {
			jp.add(new JButton(i + "변"));
		}
		
		// 가로, 세로 스크롤 생성.
		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		
		// 스크롤 팬 생성.
		JScrollPane jsp = new JScrollPane(jp, v, h);
		
		// 컨테이너에 추가. - BorderLayout의 가운데에 넣기
		ct.add(jsp, BorderLayout.CENTER);
		
		setTitle("JScrollPane Test1");
		setSize(300,300);
		setVisible(true);
	}
}
public class JScrollPanelTest1 {

	public static void main(String[] args) {
		new JScrollPanel();
	}

}
