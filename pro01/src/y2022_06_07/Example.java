package y2022_06_07;

public class Example {

	public static void main(String[] args) {
		plus add= new plus();
		System.out.print(add.x + " ");
		System.out.println(add.y);
		plus add1 = new plus(1,2);
		System.out.print(add1.x + " ");
		System.out.println(add1.y);
		plus add2 = new plus(1,3);
		System.out.print(add2.x + " ");
		System.out.println(add2.y);
		
		int result1 = add.plus(add.x, add.y);
		
		int result = add.plus(3, 4);
		
		System.out.println(result1);
		System.out.println(result);
		
	}
}
