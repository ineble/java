package y2022_06_14;

class Data <T extends Number>{
	T obj;

	Data(T obj) {
		this.obj = obj;
	}
	
	int calcMultiple(int n) {
		return obj.intValue()*n;
	}
	
}


public class Code231 {

	public static void main(String[] args) {
		Data<Integer> d = new Data<Integer>(100);
		int result = d.calcMultiple(5);
		System.out.println(result);

		Data<Double> e = new Data<Double>(17.5);
		int result2 = e.calcMultiple(5);
		System.out.println(result2);

	}

}
