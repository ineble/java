package sec02.exam02_1;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("------------------------");
		x++; //11  x = x + 1
		++x; //12  x = x + 1
		System.out.println("x=" + x); //12
		
		System.out.println("------------------------");
		y--; //9 y = y - 1
		--y; //8 y = y - 1
		System.out.println("y=" + y); //8
		
		System.out.println("------------------------");
		z = x++; //z = 12 x = 13
		//이거는 z에 우선 x값을 대입 하고 그 후에 x에 x + 1을 대입
		System.out.println("z=" + z); //12
		System.out.println("x=" + x); // 13
		
		System.out.println("------------------------");
		z = ++x; //z = 14 x =14
		//이거는 z에 x + 1을 대입
		System.out.println("z=" + z); //14
		System.out.println("x=" + x); //14
		
		System.out.println("------------------------");
		z = ++x + y ++; //x = 15  z = 23 y = 9 
		System.out.println("z=" + z); // 23
		System.out.println("x=" + x); // 15
		System.out.println("y=" + y); // 9
		
		
		
		
	}

}
