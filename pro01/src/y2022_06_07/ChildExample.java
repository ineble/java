package y2022_06_07;

public class ChildExample {

	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "data1";
		System.out.println("부모 필드 : " + parent.field1);
		parent.method1();
		parent.method2();
		
		// parent.filed2 = "data2"; 불가능
		parent.method3();
		
		
		
		Child child = (Child) parent;
		child.field2 = "data2";
		System.out.println("자식 필드 : " + child.field2);
		child.field2 = "yyy";
		child.method3();
		child.method1();
		child.field1 = "data3";
		System.out.println("부모로 올라간 필드 : " + child.field1);
		// child.field1 = "data3"; 가능
		// child.method1(); 가능
		
		

	}

}
