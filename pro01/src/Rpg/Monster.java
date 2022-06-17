package Rpg;

public abstract  class Monster {
	int MonsterNo;
	String kind;
	int power;
	int speed;
	int Health;
	int skill_power;
	String[] skill;
	
	abstract void attack(String job, int power);
	
	abstract void skill(String job, String skill,int skill_power);
}
