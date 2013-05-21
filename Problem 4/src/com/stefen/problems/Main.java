package com.stefen.problems;

/**
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91  99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * 
 * Solved: 161109
 */
public class Main
{
	public static void main(String[] args)
	{
		new Main();
	}
	
	public Main()
	{
		findLargestPalindrome(999, 99, 999, 99);
	}
	
	public int flipNumber(int number)
	{
		String num = String.valueOf(number);
		for(String reverse : num.split(" "))
			num = new StringBuffer(reverse).reverse().toString();
		return Integer.parseInt(num);
	}
	
	public void findLargestPalindrome(int firstUpperBound, int firstLowerBound, int secondUpperBound, int secondLowerBound)
	{
		int[] totals = new int[3];
		int largest = 0;
		for(int x = firstUpperBound; x > firstLowerBound; x--)
			for(int y = secondUpperBound; y > secondLowerBound; y--)
				if(x*y == flipNumber(x*y))
					if(x*y > largest)
					{
						largest = x*y;
						totals[0] = x;
						totals[1] = y;
						totals[2] = x*y;
					}
		System.out.println("X: " + totals[0]);
		System.out.println("Y: " + totals[1]);
		System.out.println("Product: " + totals[2]);
	}
}
