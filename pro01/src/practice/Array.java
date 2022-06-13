package practice;

public class Array {

	public static void main(String[] args) {
		// 값 대입+
		int arr[][] = {{10,15,7,3},{1,6,17,2},{20,2,6,4}};
		for(int i = 0; i <arr.length; i ++) {
			for(int j = 0; j < arr[i].length; j ++) {
				System.out.println("arr[" + i + "][" + j + "] : " + arr[i][j] );
			}
		}
		System.out.println();
		
		// new 연산자
		int arr1[][] = new int[3][4];
		arr1[0][0] = 10;
		arr1[0][1] = 15;
		arr1[0][2] = 7;
		arr1[0][3] = 3;
		arr1[1][0] = 1;
		arr1[1][1] = 6;
		arr1[1][2] = 17;
		arr1[1][3] = 2;
		arr1[2][0] = 20;
		arr1[2][1] = 2;
		arr1[2][2] = 6;
		arr1[2][3] = 4;
		for(int i = 0; i <arr1.length; i ++) {
			for(int j = 0; j < arr1[i].length; j ++) {
				System.out.println("arr1[" + i + "][" + j + "] : " + arr1[i][j] );
			}
		}
		

	}

}
