package Rpg;

public abstract  class Human {
	String job;
	int power;
	String skill;
	int skill_power;
	
	abstract void attack(String job, int power);
	
	abstract void skill(String job, String skill,int skill_power);
}
