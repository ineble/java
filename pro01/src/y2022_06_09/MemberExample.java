package y2022_06_09;

public class MemberExample {

	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등한 문자열입니다.");
		}else {
			System.out.println("obj1과 obj2는 동등한 문자열이 아닙니다.");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj2는 동등한 문자열입니다.");
		}else {
			System.out.println("obj1과 obj2는 동등한 문자열이 아닙니다.");
		}

	}

}
