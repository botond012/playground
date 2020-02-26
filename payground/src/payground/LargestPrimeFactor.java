package payground;


public class LargestPrimeFactor {
	public static Integer largestPrimeFactor(Integer n) {
		int bigestPrime = 0;
		for (int i = 2; i <= n; i++) {
			boolean isPrime = true;
			for (int p = 2; p < i; p++) {
				if (i % p == 0)
					isPrime = false;
			}
			if (isPrime) {
				if (n % i == 0) {
					n = n / i;
					bigestPrime = i > bigestPrime ? i : bigestPrime;
				}
			}
		}
		return bigestPrime;
	}
}
