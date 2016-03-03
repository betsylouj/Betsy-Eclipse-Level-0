public class Primes {
	public static void main(String[] args) {
		boolean prime;
		
		int numPrimes = 1; // 1 is prime
		for (int i = 2; i < 100; i++) {
			prime = false;
			System.out.println("i is " + i);
			for (int j = 2; j < (Math.sqrt(i) + 1); j++) {
				// System.out.println("j is " + j);
				if (i % j == 0) {
					if (i != j) {
						prime = true;
						System.out.println("Not prime ");
					}
				}
			}
			if (prime == false) {

				System.out.println(i + " is prime");
				numPrimes++;
			}

		}
		System.out.println("Number of primes = " + numPrimes);
	}
}
