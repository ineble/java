package sec04.exam02;

public class KeyCodeExample {

	public static void main(String[] args) throws Exception{
		int keyCode;
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
		
		// 엔터는 2개의 작업 하나는 행바꿈 하나는 맨 앞으로 나오는 기능
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
				
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
	    
	}
}
