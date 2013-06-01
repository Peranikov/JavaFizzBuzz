import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;


public class FizzBuzzTest {

	private FizzBuzz fizzBuzz;
	
	@Before
	public void setUp() throws Exception {
		this.fizzBuzz = new FizzBuzz();
	}

	@Test
	public void testIsFizz() {
		assertThat(this.fizzBuzz.isFizz(3), is(true));
		assertThat(this.fizzBuzz.isFizz(5), is(false));
	}

	@Test
	public void testIsBuzz() {
		assertThat(this.fizzBuzz.isBuzz(5), is(true));
	}

	@Test
	public void testIsFizzBuzz() {
		assertThat(this.fizzBuzz.isFizzBuzz(15), is(true));
	}
}
