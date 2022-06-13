package y2022_06_13;

import java.awt.Toolkit;

public class BeepPrintExample4 {

	public static void main(String[] args) {
		Thread thread = new BeepThread();
		thread.start();
		for(int i = 0; i < 5; i ++) {
			System.out.println("띵");
			try {Thread.sleep(1000);}catch(Exception e) {}
		}	
	}
}
