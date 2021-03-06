package y2022_06_07;

import javax.sound.midi.Soundbank;

public class AnimalExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();
		dog.breathe();
		Cat cat = new Cat();
		cat.sound();
		cat.breathe();
		System.out.println("-----------------------------");
		
		Animal animal = null; //초기화
		animal = new Dog(); //자동 형변환
		animal.sound();
		animal.breathe();
		animal = new Cat(); //자동 형변환
		animal.sound();
		animal.breathe();
		System.out.println("-----------------------------");
		animalSound(new Dog());
		animalBreathe(new Dog());
		animalSound(new Cat());
		animalBreathe(new Cat());
	}

	public static void animalBreathe(Animal animal) {
		animal.breathe();
		
	}

	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
