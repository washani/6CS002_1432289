package moseley013;

import org.junit.*;
import static org.junit.Assert.*;
import moseley013.Main;



public class MainTest {

	/**
	 *
	 * @see moseley013.Main#gecko(int)
	 */
	@Test
	public void gecko() {
		int result = Main.gecko(1);
		assertNotNull("result cannot be null", result);
	}

	
}
