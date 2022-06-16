package y2022_06_15;


import java.io.FileWriter;
import java.io.Writer;

public class WriteExample5 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("E:/Temp/test8.txt");
		
		char[] array = {'A','B','C'};
		
		writer.write(array);
		
		writer.flush();
		writer.close();
	}

}
