package GitIsFun;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalenderClass {

	@Test
	public void test_getValue() {
		int nr = 4;
		CalenderClass ex1 = new CalenderClass(nr, "Meet");
		assertTrue(4 == ex1.getValue());
	}
	public void test_getName(){
		String name = "Meeting NOW";
		CalenderClass ex2 = new CalenderClass(4, "me");
		assertTrue(name == ex2.getName());
	}
}
