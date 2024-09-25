import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileInputStreamTest1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("파일명을 입력 하세요 : ");
		String s = stdIn.next();
		
		// 입력한 파일명으로 객체 생성.
		try {
			// 입력한 파일명으로 객체 생성.
			FileInputStream fis = new FileInputStream(s);
			
			int i;
			while(( i = fis.read()) != -1) {
				System.out.println(i);
			}
			fis.close();
		} catch (FileNotFoundException e) {
			System.out.println(s + "파일이 없습니다.");
		} catch (IOException e) {
			System.out.println("파일이 없습니다.");
		}
	}

}