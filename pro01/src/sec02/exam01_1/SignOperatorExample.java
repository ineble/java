package sec02.exam01_1;

public class SignOperatorExample {

	public static void main(String[] args) {
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1= " + result1); //-100
		System.out.println("result2= " + result2); // 100
		
		byte b = 100;
		int result3 = -b;
		System.out.println("result3= " + result3); // 100
		

	}

}
