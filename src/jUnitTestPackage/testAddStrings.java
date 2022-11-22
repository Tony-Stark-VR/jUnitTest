package jUnitTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddStrings {
	@Test
	public void test() {
		jUnitFunctions JUnit = new jUnitFunctions();
		String result = JUnit.addStrings("Vikas ", "Choudhary");
		assertEquals("Vikas Choudhary",result);
	}
}
