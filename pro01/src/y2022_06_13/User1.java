package y2022_06_13;

public class User1 extends Thread {
	private Calculator calculator;

	public void setCalculator(Calculator calculator) {
		this.setName("User1");
		this.calculator = calculator;
	}
	public void run() {
		calculator.setMemory(100);
	}
	
}
