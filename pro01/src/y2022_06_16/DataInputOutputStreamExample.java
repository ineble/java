package y2022_06_16;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamExample {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("E:/Temp/primitive.db");
		// 데이터를 쓰기 위한 출력 스트림이다. 파일을 사용 할 수 있는지 여부는 기본 플랫폼에 따라 다릅니다.
		DataOutputStream dos = new DataOutputStream(fos);
		// 자바 데이터 유형을 출력 스트림에 이식 가능한 방식으로 작성하는 생성자
		// Data를 붙이면 기본 타입의 wrap의 형태를 Data로 받을 수 있다.
		
		dos.writeUTF("홍길동");
		dos.writeDouble(95.5);
		dos.writeInt(1);
		
		dos.writeUTF("감자바");
		dos.writeDouble(90.3);
		dos.writeInt(2);

		dos.flush();dos.close();
		
		FileInputStream fis = new FileInputStream("E:/Temp/primitive.db");
		DataInputStream dis = new DataInputStream(fis);
		
		for(int i = 0; i < 2 ; i ++) {
			String name = dis.readUTF();
			double score = dis.readDouble();
			int order = dis.readInt();
			System.out.println(name + " : " + score + " : " + order);
		}
		
		dis.close();
	}

}
