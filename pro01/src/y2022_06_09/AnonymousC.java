package y2022_06_09;

public class AnonymousC {
	private int field;
	
	public void method(int arg1,int arg2) {//매개변수
		int var1 = 0;//지역변수
		int var2 = 0;
		field = 10;
	
	
	Calculatable calc = new  Calculatable() {
		
		@Override
		public int sum() {
			int result = field + arg1 + arg2 + var1 + var2;
			return result;
		}
	};
	System.out.println(calc.sum());
	}
}
