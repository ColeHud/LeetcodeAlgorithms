public class NumberOf1Bits 
{
	// you need to treat n as an unsigned value
    public int hammingWeight(int n) 
    {
        //convert to binary string
    	String binary = Integer.toBinaryString(n);
    	
    	//count "1"s in that string
    	int numberOfZeroes = 0;
        
        for(int i = 0; i < binary.length(); i++)
        {
            if(binary.substring(i, i+1).equals("1"))
            {
                numberOfZeroes++;
            }
        }
        
        return numberOfZeroes;
    }
}
