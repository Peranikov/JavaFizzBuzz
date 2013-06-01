import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;


public class FizzBuzzTest {

	private FizzBuzz fizzBuzz;
	
	@Before
	public void setUp() throws Exception {
		this.fizzBuzz = new FizzBuzz();
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	public void testIsFizz() {
		assertThat(this.fizzBuzz.isFizz(3), is(true));
	}
}
