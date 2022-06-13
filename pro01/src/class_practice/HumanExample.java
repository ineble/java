package class_practice;

public class HumanExample {
	
//	String 이름 = "홍길동";
//	int 나이 = 20;
//	String 성별 = "남";
//	String 직업 = "도적";	
	
	public static void main(String[] args) {
		Human human = new Human("홍길동", 20, "남", "도적");
		System.out.println("이름 : " + human.name);
		System.out.println("나이 : " + human.age);
		System.out.println("성별 : " + human.gender);
		System.out.println("직업 : " + human.job);
		
	}

}
