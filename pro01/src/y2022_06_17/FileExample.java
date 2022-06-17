package y2022_06_17;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {

	public static void main(String[] args) throws Exception {
		// 파일 객체 생성 
		// 폴더 객체
		File dir = new File("E:/Temp/images");
		// 파일 객체
		File file1 = new File("E:/Temp/file1.txt");
		File file2 = new File("E:/Temp/file2.txt");
		File file3 = new File("E:/Temp/file3.txt");
		
		// 이 폴더 존재하니 ? -> 아니요 폴더 만들어라
		if(dir.exists() == false) dir.mkdir();
		// 이 파일 존재하니 ? -> 아니요 파일 만들어라
		if(file1.exists() == false) file1.createNewFile();
		if(file2.exists() == false) file2.createNewFile();
		if(file3.exists() == false) file3.createNewFile();
		
		// 일시적인 경로를 저장하기 위한 변수명
		File temp = new File("E:/Temp");
		// 이 경로 안에 있는 파일들을 리스트 형식으로 뽑아와서 contents 변수명에 배열 형태로 넣어라
		File [] contents = temp.listFiles();
		
		System.out.println("시간\t\t\t형태\t\t크기\t이름");
		System.out.println("----------------------------------------------------");
		// 내가 쓰고싶은 날짜 유형 지정하기
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		
		// 아까 뽑아온 리스트 file이라는 변수명에 차례대로 집어넣겠다.
		for(File file : contents ) {
			// lastModified 파일의 날짜를 수정한 날짜로 표시해라
			System.out.print(sdf.format(new Date(file.lastModified())));
			if(file.isDirectory()) {
				// 폴더 이름 갖고와라
				System.out.println("\t<DIR>\t\t\t" + file.getName());
				
			}else {
				// 파일이니깐 크기 표시하고 이름 갖고와라
				System.out.println("\t\t\t" + file.length() + "\t" + file.getName());
				
			}
			System.out.println();
		}

	}

}
