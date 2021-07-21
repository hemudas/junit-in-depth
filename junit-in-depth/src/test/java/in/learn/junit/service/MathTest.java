package in.learn.junit.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class MathTest {

	// Absence of failure is success
	
	// given array {1,2,3}-> 6(expected)
	@Test
	void sumWith3Numberstest() {
		Math math = new Math();
		int result = math.sum(new Integer[]{1,2,3});
		assertThat(result==6);
	}
	
	// given array {2,3}-> 5(expected)
		@Test
		void sumWith2Numberstest() {
			Math math = new Math();
			int result = math.sum(new Integer[]{2,3});
			assertThat(result==5);
		}

}
