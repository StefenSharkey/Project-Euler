package com.stefen.problems;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * 
 * Answer: 233168
 * Solved: 293592
 */
public class Main
{
	public static void main(String[] args)
	{
		new Main();
	}
	
	/**
	 * Upon declaration, the total sum is found based off of given integers.
	 */
	public Main()
	{
		int[] nums = new int[4];
		int[] multiples = {0, 3, 5};
		int count = 1000;
		multiples[0] = multiples[1]*multiples[2];
		
		nums[1] = findMultiples(multiples[1], count, true, true);
		nums[2] = findMultiples(multiples[2], count, true, true);
		nums[3] = findMultiples(multiples[0], count, false, false);
		
		nums[0] = (nums[1] + nums[2])-nums[3];
		System.out.println("Total Sum: " + nums[0]);
	}
	
	/**
	 * Finds a specified number of multiples of a specified integer.
	 * @param multiple The number of which the multiples are found of.
	 * @param num The number of multiples that are found.
	 * @param multiples If true, outputs the multiples of the given number.
	 * @param sums If true, outputs the sum of the multiples found.
	 * @return Returns the sum of the multiples.
	 */
	public int findMultiples(int multiple, int num, boolean multiples, boolean sums)
	{
		int sum = 0;
		if(multiples)
			System.out.print(multiple + "'s:");
		for(int x = 1; x < num; x++)
		{
			if(x % multiple == 0)
			{
				sum += x;
				if(multiples)
					System.out.print(" " + x);
			}
		}
		if(sums)
			System.out.println("\nSum of " + multiple + "'s: " + sum);
		return sum;
	}
}
