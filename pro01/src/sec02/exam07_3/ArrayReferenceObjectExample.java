package sec02.exam07_3;

//클래스
public class ArrayReferenceObjectExample {
	// 메인 메소드
	public static void main(String[] args) {
		String [] arr = new String[3];
		arr[0] = "Java";
		arr[1] = "Java";
		arr[2] = new String("Java");
		
		System.out.println(arr[0] == arr[1]); //true
		System.out.println(arr[0] == arr[2]); //false
		System.out.println(arr[0].equals(arr[2])); //true
		
		
	}

}
