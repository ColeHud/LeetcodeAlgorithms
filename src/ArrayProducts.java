
public class ArrayProducts {
	public int[] productExceptSelf(int[] nums) 
    {
        int indexOfArray = 0;
        int[] returnArray = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = 0; j < nums.length; j++)
            {
                if(j != i)
                {
                    if(indexOfArray != returnArray.length - 1)
                    {
                        returnArray[indexOfArray] = nums[i] * nums[j];
                        indexOfArray++;
                    }
                    else
                    {
                        //double the array size
                    	returnArray = doubleArray(returnArray);
                    }
                }
            }
        }
        
        return returnArray;
    }
	
	public int[] doubleArray(int[] nums)
	{
		int[] returnArray = new int[nums.length * 2];
		
		for(int i = 0; i < nums.length; i++)
		{
			returnArray[i] = nums[i];
		}
		
		return returnArray;
	}
}
