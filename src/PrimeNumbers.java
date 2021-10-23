import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class PrimeNumbers {
	int start = 2;
	ArrayList<Integer> primes = new ArrayList<Integer>();;

	public void printPrimes(int n) throws StackOverflowError {

		try {

			if (n < 2) {

				Collections.reverse(primes);

				Iterator<Integer> itr = primes.iterator();
				while (itr.hasNext())
					System.out.print(itr.next() + "\n");
				// System.out.println(primes);
			return;
		}

			if (isPrime(n)) {
				primes.add(n);
			}

		} catch (StackOverflowError e) {
			System.out.println(e.getMessage());
		}

		printPrimes(n - 1);
	}

	static boolean isPrime(int n) {

		// Check if number is less than
		// equal to 1
		if (n <= 1)
			return false;

		// Check if number is 2
		else if (n == 2)
			return true;

		// Check if n is a multiple of 2
		else if (n % 2 == 0)
			return false;

		// If not, then just check the odds
		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {

		PrimeNumbers p = new PrimeNumbers();

		try {
			p.printPrimes(10);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}


	}
}
