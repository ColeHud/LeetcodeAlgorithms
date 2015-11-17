import java.util.ArrayList;

public class IsHappy 
{
	public ArrayList<Integer> usedNums = new ArrayList<Integer>();
	public boolean isHappy(int n) 
	{
		boolean run = true;
		while(run)
		{
			if(usedNums.contains(n))
			{
				return false;
			}
			
			usedNums.add(n);
			
			if(n == 1)
			{
				break;
			}

			String stringyN = (n+"");
			int sumOfPowers = 0;
			for(int i = 0; i < stringyN.length(); i++)
			{
				String digitString = stringyN.substring(i, i+1);
				int digit = Integer.parseInt(digitString);
				sumOfPowers += Math.pow(digit, 2);
			}
			//System.out.println(sumOfPowers);
			
			return isHappy(sumOfPowers); 
		}
		return true;
	}
}
