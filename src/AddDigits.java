public class AddDigits 
{
	public int addDigits(int num) 
    {
		boolean shouldReturn = false;
		int sum = addUpDigits(num);
		while(shouldReturn == false)
		{
			String stringySum = "" + sum;
			if(stringySum.length() == 1)
			{
				return sum;
			}
			else
			{
				sum = addUpDigits(sum);
			}
		}
		
        return 0;
    }
    
    public int addUpDigits(int number)
    {
        String stringyNum = "" + number;
        int placeHolderNum = 0;
        for(int i = 0; i < stringyNum.length(); i++)
        {
            int current = Integer.parseInt(stringyNum.substring(i, i+1));
            placeHolderNum += current;
        }
        
        return placeHolderNum;
    }
}
