public class Anagram 
{
	public boolean isAnagram(String s, String t) 
	{	
		String copyt = t;
		boolean isAnagram = true;
        for(int i = 0; i < s.length(); i++)
        {
        	char myChar = s.charAt(i);
        	int indexOfMyChar = copyt.indexOf(myChar);
        	if(indexOfMyChar > -1)
        	{
        		copyt.replace(myChar, '你');
        	}
        	else
        	{
        		isAnagram = false;
        		break;
        	}	
        }
        return isAnagram;
    }	
	
	public boolean efficientIsAnagram(String s, String t) 
	{
		char[] sarray = s.toCharArray();
		char[] tarray = t.toCharArray();
		
		//check if they are the same length
		if(sarray.length != tarray.length)
		{
			return false;
		}
		
		for(int i = 0; i < sarray.length; i++)
		{
			char myChar = sarray[i];
			boolean contains = false;
			for(int j = 0; j < tarray.length; j++)
			{
				if(myChar == tarray[j])
				{
					contains = true;
					tarray[j] = ' ';
					break;
				}
			}
			
			if(contains == false)
			{
				return false;
			}
		}
		
		return true;
    }
}
