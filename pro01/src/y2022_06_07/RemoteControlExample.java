package y2022_06_07;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		rc.turnOn();
		rc.setVolume(15);
		rc.turnOff();
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(0);
		rc.turnOff();
	}
}
