package jUnitTestPackage;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
class testAddNumbers {

	@Test
	public void test() {
		jUnitFunctions JUnit = new jUnitFunctions();
		int result = JUnit.addNumbers(100,200);
		assertEquals(300,result);
	}
}
