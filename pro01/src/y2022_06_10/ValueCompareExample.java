package y2022_06_10;

public class ValueCompareExample {

	public static void main(String[] args) {
		//언박싱한 값을 얻어 비교해야함
		System.out.println("[-128~127 초과값일 경우]");
		Integer obj1 = 300;
		Integer obj2 = 300;
		//값을 넘어버리면 우선 값을 비교 할 수가 없으니깐 참조변수로 가고 그래서 참조 변수 ==은 객체의 주소의
		//비교를 의미하기에 false를 반환
		System.out.println("==결과 : " + (obj1 == obj1));
		//언박싱이니깐 스텍으로 값을 비교
		System.out.println("언박싱후 ==결과 : " + (obj1.intValue() == obj2.intValue()));
		//equals은 당연히 값 비교 
		System.out.println("equals() 결과 : " + obj1.equals(obj2));
		System.out.println();
		
		
		System.out.println("[-128~127 범위값일 경우]");
		// 범위안의 값이기에 박싱을 해도 값을 알아서 비교해준다.
		Integer obj3 = 10;
		Integer obj4 = 10;
		// 범위 안 객체로 인식을 안 하고 자동으로 값을 비교해준다.
		System.out.println("==결과 : " + (obj3 == obj4));
		//언박싱이니깐 값 비교
		System.out.println("언박싱후 ==결과 : " + (obj3.intValue() == obj4.intValue()));
		//언박싱이니깐 값 비교
		System.out.println("equals() 결과 : " + obj3.equals(obj4));
		
	}

}
