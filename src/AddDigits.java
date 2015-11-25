public class AddDigits 
{
	public int addDigits(int num)
	{
		String stringNum = num + "";
		int addedNum = 0;
		
		for(int i = 0; i < stringNum.length(); i++)
		{
			int numAtPlace = Integer.parseInt(stringNum.charAt(i) + "");
			addedNum += numAtPlace;
		}
		
		if(addedNum > 9)
		{
			return addDigits(addedNum);
		}
		else
		{
			return addedNum;
		}
	}
}
