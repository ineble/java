package y2022_06_15;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("송", 56);
		map.put("지", 85);
		map.put("섭", 72);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		Set<Map.Entry<String, Integer>> mapEntry = map.entrySet();
		for(Map.Entry<String,Integer> Entry : mapEntry) {
			if(Entry.getValue()>maxScore) {
				name = Entry.getKey();
				maxScore = Entry.getValue();
			}
			totalScore += Entry.getValue();
		}
		
		int avgScore = totalScore/map.size();
		
		System.out.println("총점 " + totalScore);
		System.out.println("맥스 : " + maxScore);
		System.out.println("평점 " + avgScore);
		System.out.println("이름 " + name);
		
		

	}

}
