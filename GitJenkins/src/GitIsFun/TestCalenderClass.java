package GitIsFun;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalenderClass {

	@Test
	public void test_getValue() {
		int nr = 4;
		CalenderClass ex1 = new CalenderClass(nr, "Meet");
		assertTrue(nr == ex1.getValue());
	}

}
