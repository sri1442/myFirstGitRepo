package io.shree;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilTest {

	@Test
	void test() {
		MathUtil math=new MathUtil();
		int expected=3;
		int actual=math.add(1, 2);
		assertEquals(expected, actual);
	}

}
