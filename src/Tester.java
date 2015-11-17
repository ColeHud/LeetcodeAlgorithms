import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Tester 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		/*
		int[] nums = {1, 3, 0, 6, 0, 5};
		MoveZeroes zeroes = new MoveZeroes();
		zeroes.moveZeroes(nums);
		printIntArray(nums);
		*/
		
		/*
		Anagram anagram = new Anagram();
		String thing1 = "asdf";
		String thing2 = "asfc";
		System.out.println(anagram.efficientIsAnagram(thing1, thing2));
		*/
		
		/*
		System.out.println("E: " + "00000010100101000001111010011100");
		ReverseBits reverse = new ReverseBits();
		reverse.reverseBits(1);
		*/
		
		/*
		File file = new File("happy.txt");
		PrintWriter out = new PrintWriter(file);
		out.println("Happy numbers up to 100000");
		
		for(int i = 0; i < 1000000; i++)
		{
			IsHappy happy = new IsHappy();
			if(happy.isHappy(i))
			{
				System.out.println(i);
				out.println(i);
			}
		}
		
		out.close();
		*/
		
		/*
		BigPascalTriangle.nthRow(43);
		*/
		
		//figure out how many rows I can handle
		//66
		/*
		for(int i = 0; i < 2000; i++)
		{
			long[] array = LessCodeTriangle.nthRow(i);
			
			for(int j = 0; j < array.length; j++)
			{
				if(array[j] < 0)
				{
					System.out.println(i);
					return;
				}
			}
		}
		*/
		
		
		//33
		/*
		for(int i = 0; i < 2000; i++)
		{
			int[] array = PascalTriangle.nthRow(i);
			
			for(int j = 0; j < array.length; j++)
			{
				if(array[j] < 0)
				{
					System.out.println(i);
					return;
				}
			}
		}
		*/
		
		/*
		ThreeSum threeSum = new ThreeSum();
		int[] nums = {-1, 0, 1, 2, -1, -4};
		
		List<List<Integer>> list = threeSum.threeSum(nums);
		
		for(List<Integer> sums : list)
		{
			System.out.println();
			for(int num : sums)
			{
				System.out.print(num + " ");
			}
			System.out.println();
		}
		*/
		
		GameOfLife conway = new GameOfLife();
		/*
		int[][] board = {
				{0, 0, 0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0, 0, 0, 0},
				{0, 0, 0, 1, 0, 0, 0, 0},
				{0, 0, 0, 0, 1, 0, 0, 0},
				{0, 0, 1, 1, 1, 0, 0, 0},
				{0, 0, 0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0, 0, 0, 0},
		};
		*/
		
		int[][] board = {
				{1}
		};
		
		conway.gameOfLife(board);
		
		
	}
	
	//print an array of ints
	public static void printIntArray(int[] nums)
	{
		System.out.print("{");
		for(int i = 0; i < nums.length; i++)
		{
			System.out.print(nums[i] + " ");
		}
		System.out.println("}");
	}
	
	public static void printMatrix(int[][] matrix)
	{
		for(int y = 0; y < matrix.length; y++)
		{
			for(int x = 0; x < matrix[y].length; x++)
			{
				int val = matrix[y][x];
				System.out.print(val + " ");
			}
			System.out.println();
		}
	}
}
