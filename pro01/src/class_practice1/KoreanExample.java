package class_practice1;

public class KoreanExample {

	public static void main(String[] args) {
		Korean k1 = new Korean( "박자바", "012345-1234567");
		Korean k2 = new Korean( "김자바", "012345-1234567");
		k2.nation = "중국";
		System.out.println("내 국적은 " + k1.nation + "이고, 이름은" + k1.name + "이며, 주민등록번호는 " + k1.ssn +  "입니다.");
		
		System.out.println("내 국적은 " + k2.nation + "이고, 이름은" + k2.name + "이며, 주민등록번호는 " + k2.ssn +  "입니다.");

	}

}
