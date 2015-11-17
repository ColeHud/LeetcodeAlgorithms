public class ReverseBits 
{
	// you need treat n as an unsigned value
    public long reverseBits(int n) 
    {
        //convert to binary string
    	String binary = Integer.toBinaryString(n);
    	
    	//trim to the last 32 bits
    	if(binary.length() != 32)
    	{
    		if(binary.length() > 32)
    		{
    			//remove from the end of the string
    			while(binary.length() > 32)
    			{
    				binary = binary.substring(0, binary.length()-1);
    			}
    		}
    		else if(binary.length() < 32)
    		{
    			while(binary.length() < 32)
    			{
    				//add zeroes to the front of the string
    				binary = "0" + binary;
    			}
    		}
    	}
    	
    	System.out.println("S: " + binary);
    	
    	//reverse the binary string
    	binary = new StringBuilder(binary).reverse().toString();
    	System.out.println("R: " + binary);
    	
    	//convert back to decimal system
    	long result = Integer.parseInt(binary, 2);
    	return result;
    	
    }
}
