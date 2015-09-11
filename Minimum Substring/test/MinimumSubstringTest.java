import static org.junit.Assert.*;

import org.junit.Test;


public class MinimumSubstringTest {
	MinimumSubstring minSubstring = new MinimumSubstring();
	
	@Test
	public void test() {
		assertEquals("banc", minSubstring.findMinSubstring("adobecodbanc", "abc"));
		assertEquals("t stri", minSubstring.findMinSubstring("this is a test string", "tist"));
		assertEquals("is i", minSubstring.findMinSubstring("this is a test string", "ii"));
		assertEquals("t", minSubstring.findMinSubstring("this is a test string", "t"));
		assertEquals("", minSubstring.findMinSubstring("this is a test string", "z"));
	}

}
