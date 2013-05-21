package com.stefen.problems;

/**
 * The sum of the squares of the first ten natural numbers is,
 * 1^2+2^2+...+10^2=385
 * The square of the sum of the first ten natural numbers is,
 * (1+2+...+10)^2=55^2=3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025-385=2640.
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 * 
 * Answer: 25164150
 * Solved: 177568
 */
public class Main
{
	public static void main(String[] args)
	{
		new Main();
	}
	
	public Main()
	{
		System.out.println(squareOfSum(100)-sumOfSquares(100));
	}
	
	public int sumOfSquares(int num)
	{
		int sum = 0;
		for(int x = 1; x <= num; x++)
		{
			sum += Math.pow(x, 2);
		}
		return sum;
	}
	
	public int squareOfSum(int num)
	{
		int sum = 0;
		for(int x = 1; x <= num; x++)
		{
			sum += x;
		}
		return (int)Math.pow(sum, 2);
	}
}
