package y2022_06_13;

public class StropFlagExample {

	public static void main(String[] args) {
		PrintThread1 printThread = new PrintThread1();
		printThread.start();
		
		try {Thread.sleep(1000);} catch(InterruptedException e) {}
		printThread.setStop(true);
		
	}

}
