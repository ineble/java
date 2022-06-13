package y2022_06_02;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "홍길동");
		
		System.out.println(p1.nation);
		System.out.println(p1.name);
		System.out.println(p1.ssn);
		
		
		//final이 안 된 name은 값 변경
		p1.name = "홍삼원";
		
		System.out.println(p1.name);
	}

}
