package y2022_06_07;

public abstract class Phone {
	public String owner;

	public Phone(String owner) {
		this.owner = owner;
	}
	public void turnOn() {
		System.out.println("폰 전월을 켭니다.");
	}
	public void turnOff() {
		System.out.println("폰 전월을 끕니다.");
	}
	
}
