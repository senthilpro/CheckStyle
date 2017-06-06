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
	
	 @Test
	  public void testDivNumbers() {
	    int actual = new SampleApp().divOfNum(6, 2);
	    assertEquals(3, actual);
	  }
	  
	  @Test
	  public void testDivNumbersFail() {
	    int actual = new SampleApp().divOfNum(6, 3);
	    assertNotEquals(3, actual);
	  }
	  
	  @Test
    public void testIsEligible() {
      boolean actual = new SampleApp().isEligible(21);
      assertEquals(true, actual);
    }
}
