package y2022_06_14;

import java.util.*;

public class HashSetExample2 {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("홍길동",30)); //set에다가 새로운 객체를 넣겠다는 말
		set.add(new Member("홍길동",30)); 
		// 새로운 객체로 인식을 하라면,hashCode()값이 같아야하고, 그 후에 equals로 안에 쓰인 값또한
		// 같아야한다. -> 위의 지문은 hashCode값이 같고, equals가 같기에 같은 객체로 인식되어
		//객체수가 하나만 나온것이다.
		
		System.out.println("총 객체수 : " + set.size());
		

	}

}
