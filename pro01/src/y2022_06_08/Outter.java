package y2022_06_08;

public class Outter {
	
	
	public void method1(final int arg) {
		final int localVariable = 1;
		// arg = 100;
		// localVariable = 100;
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}

	}

	public void method2( int arg) {
		int localVarialbe = 1;
		//arg = 100;
		//localVarialbe = 100;
		class Inner {
			public void method() {
				int result = arg + localVarialbe;
			}
		}

	}

}
