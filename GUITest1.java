import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class GUI1 extends JFrame implements ActionListener{
   // 속성으로 텍스트 에어리어와 텍스트 필드를 선언.
   // 이벤트 처리에서 사용해야 되기 때문에 생성자 밖에 속성으로 선언한다.
   // 글의 내용을 입력하고, 버튼을 누르면 파일로 생성되어야 한다.
   public JTextField f_name;
   public JTextArea contents;
   public GUI1() {
      // 컨테이너 생성
      Container ct = getContentPane();
      
      
      // FlowLayout 배치 관리자 생성
      ct.setLayout(new FlowLayout());
      
      
      // 컴포넌트 생성
      f_name = new JTextField("파일 이름을 입력하세요", 20);
      JButton jb = new JButton("파일 불러오기");
      contents = new JTextArea("파일 내용을 입력하세요.", 10, 20);
      
      jb.addActionListener(this);
      

      // 컨테이너에 컴포넌트 추가
      ct.add(f_name);
      ct.add(jb);
      ct.add(contents);

      // 화면에 표시하기
      
      setTitle("GUITest1");
      setSize(500, 500);
      // 윈도우 창 종료시 프로세스 닫기
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);   
   }
   @Override
   public void actionPerformed(ActionEvent e) {

      try {
         // 출력.
         // 파일 이름으로 출력 객체 생성.
         String s = f_name.getText();
         FileOutputStream fos = new FileOutputStream(s);
         DataOutputStream dos = new DataOutputStream(fos);
         
         // 텍스트 에어리어의 내용을 파일로 출력
         dos.writeUTF(contents.getText());
         fos.close();
         System.out.println(s + "파일을 생성하였습니다.");
         
         
      } catch (FileNotFoundException e1) {
         // TODO Auto-generated catch block
         e1.printStackTrace();
      } catch (IOException e1) {
         // TODO Auto-generated catch block
         e1.printStackTrace();
      }
      
   }
   
}
public class GUITest1 {

   public static void main(String[] args) {
      new GUI1();

   }

}
