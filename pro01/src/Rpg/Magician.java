package Rpg;

public class Magician extends Human {
	String job; 
	int power;
	



	@Override
	public void attack(String job,int power) {
		System.out.println(job+ "가 " + power + "로 공격합니다.");
		
	}



	@Override
	public void skill(String job, String skill, int skill_power) {
		System.out.println(job+ "가 " + skill + "로 공격합니다.");
		System.out.println("상대방이 " + skill_power + "만큼 피해를 입습니다." );
	}

	
	
}
