import java.util.*;
public class ThreeSum 
{
	public List<List<Integer>> threeSum(int[] nums) 
    {
		List<List<Integer>> listOfThreeSums = new ArrayList();
		
		//look for a combination of 3 nums that equal 0
        for(int x = 0; x < nums.length; x++)
        {
            for(int y = 0; y < nums.length; y++)
            {
                for(int z = 0; z < nums.length; z++)
                {
                	int sum = nums[x] + nums[y] + nums[z];
                	if(sum == 0 && y != x && x != z && z != y)
                	{
                		//list to add
                		List<Integer> addList = new ArrayList();
                		addList.add(nums[x]);
                		addList.add(nums[y]);
                		addList.add(nums[z]);
                		
                		//check and see if this list is already contained in listOfThreeSums
                		boolean shouldAdd = true;
                		for(List<Integer> index : listOfThreeSums)
                		{
                			if(index.contains(nums[x]) && index.contains(nums[y]) && index.contains(nums[z]))
                			{
                				shouldAdd = false;
                			}
                		}
                		
                		if(shouldAdd)
                		{
                			listOfThreeSums.add(addList);
                		}
                	}
                }
            }
        }
        return listOfThreeSums;
    }
}
