package y2022_06_07;

public abstract class Animal {
	public String kind;
	
	public void breathe() {
		System.out.println(kind +"가 숨을 쉽니다.");
	}
	public abstract void sound();
}
