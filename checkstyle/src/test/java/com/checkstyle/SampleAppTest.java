package com.checkstyle;

import org.junit.Test;
import static org.junit.Assert.*;

public class SampleAppTest {
	@Test
	public void testAddNumbers() {
		int actual = new SampleApp().sumOfNum(3, 2);
		assertEquals(5, actual);
	}
	
	@Test
	public void testAddNumbersFail() {
		int actual = new SampleApp().sumOfNum(3, 3);
		assertNotEquals(5, actual);
	}
}
