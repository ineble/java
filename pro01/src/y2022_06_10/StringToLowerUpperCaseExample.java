package y2022_06_10;

public class StringToLowerUpperCaseExample {
	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
		System.out.println(str1.equals(str2));
		
		String lowerStr1 = str1.toLowerCase();
		System.out.println(lowerStr1);
		String upperStr1 = str1.toUpperCase();
		System.out.println(upperStr1);
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr2);
		String upperStr2 = str2.toUpperCase();
		System.out.println(upperStr2);
		System.out.println(lowerStr1.equals(lowerStr2));
		System.out.println(str1.equalsIgnoreCase(str2));
		//equalsIgnoreCase -> 대소문자 구문 안 하여 한다.
	}
}
