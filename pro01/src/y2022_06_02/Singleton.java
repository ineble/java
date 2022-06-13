package y2022_06_02;

public class Singleton {
	// private를 쎃기때문에 외부에서 호출이 안된다.
	// 외부에서 new를 사용 못 함
	private static Singleton singleton = new Singleton();
	
	private Singleton() {}
	static Singleton getInstance() {
		return singleton;
	}
}
