package practice;

public class Main {
	public static void main(String[] args) {
		
		while(true) {
			int x = (int)(Math.random()*6+1);
			
			int y = (int)(Math.random()*6+1);
			System.out.print("(" + x + "," + y + ") ");
			System.out.println();
			if((x + y) == 5) {
				break;
			} 
		}
	}
}

