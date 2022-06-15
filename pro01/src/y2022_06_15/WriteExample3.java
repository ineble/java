package y2022_06_15;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample3 {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("E:/Temp/test3.db");
		
		byte[] array = {10,20,30,40,50};
		os.write(array,0,5);		
		os.flush();
		os.close();

	}

}
