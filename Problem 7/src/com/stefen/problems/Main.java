package com.stefen.problems;

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10,001st prime number?
 * 
 * Solved: 150962
 */
public class Main
{
	public static void main(String[] args)
	{
		new Main();
	}
	
	public Main()
	{
		System.out.println(getPrime(10001));
	}
	
	public int getPrime(int num)
	{
		int lastPrime = 0;
		int primes = -1;
		double counter = 1;
		boolean isPrime = true;
		while(primes < num)
		{
			for(int x = 2; x < ((counter/2)+1); x++)
				if((counter/x) == (int)(counter/x))
					isPrime = false;
			if(isPrime)
			{
				primes++;
				lastPrime = (int)counter;
			}
			counter++;
			isPrime=true;
			System.out.println("Last Prime: " + lastPrime);
			System.out.println("Primes Found: " + primes);
		}
		return lastPrime;
	}
}
