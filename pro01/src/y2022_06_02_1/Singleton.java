package y2022_06_02_1;

public class Singleton {
	private static Singleton singleton = new Singleton();
	private Singleton() {}
	static Singleton getInstance() {
		return singleton;
	}
}
