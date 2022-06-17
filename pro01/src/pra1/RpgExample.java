package pra1;

import Rpg.Magician;
import Rpg.Warrior;

public class RpgExample {

	public static void main(String[] args) {
		Warrior warrior1 = new Warrior();
		warrior1.attack("전사", 10);
		warrior1.skill("전사", "강하게 치기", 20);
		
		
		Magician magician1 = new Magician();
		magician1.attack("마법사", 5);
		magician1.skill("마법사","파이어볼",30);
		
	}

}
