package practice;

public class Main {
	public static void main(String[] args) {
		for(int i = 0; i < 5; i ++) {
			for(int j = 0; j < 5; j ++) {
				if(i>j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			for(int k = 5; k >0; k--) {
				if(i<k) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}

			System.out.println();
		}
		
		for(int i = 1; i < 6; i ++) {
			for(int k = 5; k >0; k--) {
				if(i<k) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			for(int j = 0; j < 6; j ++) {
				if(j<i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}	
	}
}
