package y2022_06_09;

public class ClassCastExceptionExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
		
		

	}

	public static void changeDog(Animal animal) {
		if(animal instanceof Dog) {
			Dog dog = (Dog)animal;
		}else {
			System.out.println("넌 틀렸어");
		}
		
	}

}
class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}
