import static org.junit.Assert.*;

import org.junit.Test;


public class IsNumberTest {
	IsNumber isNumber = new IsNumber();
	
	@Test
	public void test() {
		assertEquals(true, isNumber.isNumber("0.0"));
		assertEquals(true, isNumber.isNumber("-1"));
		assertEquals(true, isNumber.isNumber("-62.53"));
		assertEquals(true, isNumber.isNumber("62.53"));
		assertEquals(false, isNumber.isNumber("-62.5-3"));
		assertEquals(false, isNumber.isNumber("-62.5.3"));
		assertEquals(true, isNumber.isNumber(".0023"));
		assertEquals(false, isNumber.isNumber("14123."));
		assertEquals(false, isNumber.isNumber(".0.023"));
		assertEquals(true, isNumber.isNumber("23"));
	}

}
