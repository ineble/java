package y2022_06_10;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = new String("신민철");
		String strVal2 = "신민철";
		String strVal3 = "신밀철";
		
		
		if(strVar1 == strVal2) {
			System.out.println("같은 String 객체를 참조");
		}else {
			System.out.println("다른 String 객체를 참조");
		}
		
		if(strVar1.equals(strVal2)) {
			System.out.println("같은 문자열을 가짐");
		}else {
			System.out.println("다른 문자열을 가짐");
		}
	}
}
