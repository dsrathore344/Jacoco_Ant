package jacoco.learn;

import static org.junit.Assert.*;

import org.junit.Test;

public class TwoTest {

	@Test
	public void test() {
			Two t = new Two();
			assertEquals("this is the test", Two.show());
		}
	}


