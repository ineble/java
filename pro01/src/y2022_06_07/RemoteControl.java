package y2022_06_07;

public interface RemoteControl {
	
	//상수
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}
