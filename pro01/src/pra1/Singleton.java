package pra1;


public class Singleton {
	//필드
	private static Singleton singleton = new Singleton();
	
	
	//생성자
	private Singleton() {
		
	}
	
	static Singleton getInstance() {
		return singleton;
	}
}
