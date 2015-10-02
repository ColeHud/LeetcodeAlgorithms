public class Tester 
{
	public static void main(String[] args)
	{
		/*
		int[] nums = {1, 3, 0, 6, 0, 5};
		MoveZeroes zeroes = new MoveZeroes();
		zeroes.moveZeroes(nums);
		printIntArray(nums);
		*/
		Anagram anagram = new Anagram();
		String thing1 = "asdf";
		String thing2 = "asfc";
		System.out.println(anagram.efficientIsAnagram(thing1, thing2));
		
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
}
