package y2022_06_15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class HashSetExample {

	public static void main(String[] args) {
		Set<Student1> set = new HashSet<Student1>();
		
		set.add(new Student1(1,"홍길동"));
		set.add(new Student1(2,"신용권"));
		set.add(new Student1(1,"조민우"));
		
		Iterator<Student1> iterator = set.iterator();
		while(iterator.hasNext()) {
			Student1 student = iterator.next();
			System.out.println(student.studentNum + " : " + student.name);
			
		}

	}

}
