
public class FizzBuzz {
	
	public boolean isFizz(int n) {
		return n % 3  == 0;
	}
	
	public boolean isBuzz(int n) {
		return n % 5  == 0;
	}
	
	public boolean isFizzBuzz(int n) {
		return n % 3 == 0 && n % 5 == 0;
	}
}
