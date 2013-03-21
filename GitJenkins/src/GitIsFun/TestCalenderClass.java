package GitIsFun;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalenderClass {

	@Test
	public void test_getValue() {
		int nr = 4;
		CalenderClass ex1 = new CalenderClass(nr, "Meet");
		System.out.println("Testing function getValue()");
		assertTrue(4 == ex1.getValue());
	}
	@Test
	public void test_getName(){
		String name = "Meeting NOW";
		CalenderClass ex2 = new CalenderClass(4, "me");
		System.out.println("Testing function getName()");
		assertTrue(name == ex2.getName());
	}
}
