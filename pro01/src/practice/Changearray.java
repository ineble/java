package practice;

public class Changearray {

	public static void main(String[] args) {
		int data[][] = new int[3][];
		data[0] = new int[4];
		data[1] = new int[5];
		data[2] = new int[3];
		
		for(int i = 0; i < data.length; i ++) {//외부 for
			for(int j = 0; j < data[i].length; j++){ //내부 for
				System.out.print(data[i][j] + " ");
			}
			System.out.println();
		}

	}

}
