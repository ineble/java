package class_practice;

public class Example {

	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;
		
		snowTire.run();//스노우타이어
		tire.run();//스노우타이어

	}

}
