package y2022_06_15;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		Map<Student,Integer> map = new HashMap<Student,Integer>();  
		
		map.put(new Student(1, "홍길동"), 95);
		map.put(new Student(1, "홍길동"), 97);
		
		System.out.println(map.get(new Student(1, "홍길동")));
		System.out.println("총 Entry 수 : " + map.size());
		
	}

}
