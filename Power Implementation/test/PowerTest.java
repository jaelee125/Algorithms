
import static org.junit.Assert.*;

import org.junit.Test;

public class PowerTest {	
	Power power = new Power();

	@Test
	public void pow() {
		assertEquals(1.0, power.pow(2, 0), 0.2);
		assertEquals(1.0, power.pow(-2, 0), 0.2);
		assertEquals(2.0, power.pow(2, 1), 0.2);
		assertEquals(-2.0, power.pow(-2, 1), 0.2);
		assertEquals(64.0, power.pow(2, 6), 0.2);
		assertEquals(64.0, power.pow(-2, 6), 0.2);
		assertEquals(128.0, power.pow(2, 7), 0.2);
		assertEquals(-128.0, power.pow(-2, 7), 0.2);
		assertEquals(1/64.0, power.pow(2, -6), 0.2);
		assertEquals(-1/64.0, power.pow(-2, -6), 0.2);
		assertEquals(1/128.0, power.pow(2, -7), 0.2);
		assertEquals(-1/128.0, power.pow(-2, -7), 0.2);
	}
}
