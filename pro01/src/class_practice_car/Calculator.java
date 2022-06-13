package class_practice_car;

public class Calculator {
	int sum1(int[] values) {
		int sum = 0;
		for (int i = 0; i < values.length;) {
			sum += values[i];
		}
		return sum;
	}

	int sum2(int... values) {
		int sum = 0;
		for (int i = 0; i < values.length;) {
			sum += values[i];
		}
		return sum;

	}
}
