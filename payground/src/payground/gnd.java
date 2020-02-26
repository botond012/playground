package payground;

import java.util.ArrayList;
import java.util.List;

public class gnd {
public static  void getGcd(int p, int q){
	

	int primesEnd = p >= q ? p : q;

	boolean isPrime = false;

	List<Integer> primes = new ArrayList();
	List<Integer> pPrimes = new ArrayList();
	List<Integer> qPrimes = new ArrayList();
	for (int i = 2; i < primesEnd; i++) {
		int primeCount = 0;

		for (int k = 1; k < primesEnd; k++) {

			if (k <= i) {
				isPrime = true;
				if (i % k == 0)

					primeCount++;
				if (primeCount > 2) {
					isPrime = false;
					break;
				}
			} else
				break;
		}
		if (isPrime)
			primes.add(i);
	}
	int i = 0;
	while (p != 1)

	{
		if (primes.get(i) <= p) {
			if (p % primes.get(i) == 0) {
				p = p / primes.get(i);
				pPrimes.add(primes.get(i));
				i = 0;
			} else
				i++;
		}
	}
	while (q != 1)

	{
		if (primes.get(i) <= q) {
			if (q % primes.get(i) == 0) {
				q = q / primes.get(i);
				qPrimes.add(primes.get(i));
				i = 0;
			} else
				i++;
		}
	}

	// I have the needed prime numbers
	System.out.println(primes);
	System.out.println(pPrimes);
	System.out.println(qPrimes);
	int Sum=1;
	if (qPrimes.size() >pPrimes.size()) {
		pPrimes.retainAll(qPrimes);
		System.out.println(pPrimes);
		
		for(Integer prime: pPrimes)
		{
			Sum*=prime;
			
		}
		System.out.println(Sum);
	} else

	{
		qPrimes.retainAll(pPrimes);
		System.out.println(qPrimes);
		for(Integer prime: qPrimes)
		{
			Sum*=prime;
			
		}
		System.out.println(Sum);

	}

}
}
