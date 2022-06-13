package practice;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

class HouseLee {
	static String lastname = "이";
}

class CounterStatic {
	static int count = 0;
	
	CounterStatic(){
		count++;
		System.out.println(count);
	}
}
class Counter {
	int count = 0;
	Counter(){
		this.count ++;
		System.out.println(this.count);
	}
}
class Util{
	public static String getCurrentDate(String fmt) {
		SimpleDateFormat sdf = new SimpleDateFormat(fmt);
		return sdf.format(new Date());
	}
}


public class Sample {

	public static void main(String[] args) {
		HouseLee lee1 = new HouseLee();
		HouseLee lee2 = new HouseLee();
		//스태틱은 서로 공유한다.
		CounterStatic c1 = new CounterStatic();
		CounterStatic c2 = new CounterStatic();
		//객체는 서로 독립적이다.
		Counter c3 = new Counter();
		Counter c4 = new Counter();
		System.out.println(Util.getCurrentDate("yyyy-MM-dd"));
		
		
	}

}
