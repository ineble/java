package y2022_06_15;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample2 {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("E:/Temp/test2.db");
		
		byte[] array = {10,20,30};
		
		os.write(array);
		
		
		
		os.flush();
		os.close();

	}

}
