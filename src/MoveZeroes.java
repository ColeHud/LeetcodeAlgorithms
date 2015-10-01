public class MoveZeroes 
{
	public void moveZeroes(int[] nums) 
    {
		for(int i = 0; i < nums.length; i++)
		{
			if(nums[i] == 0)
			{
				//check how many zeroes there are
				int numberOfZeroesAtIndex = 0;
				for(int k = i; k < nums.length; k++)
				{
					if(nums[k] == 0)
					{
						numberOfZeroesAtIndex++;
					}
					else
					{
						break;
					}
				}
				
				//move everything forward by the number of zeroes there were at that index
				for(int j = i; j < nums.length - numberOfZeroesAtIndex; j++)
				{
					nums[j] = nums[j+numberOfZeroesAtIndex];
				}
				
				//add that many zeroes to the end
				for(int z = numberOfZeroesAtIndex; z > 0; z--)
				{
					nums[nums.length - z] = 0;
				}
			}
		}
    }
}
