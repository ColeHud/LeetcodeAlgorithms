public class ExcelSheetColumnNumber
{
    public int titleToNumber(String s) 
    {
        if(s.length() == 0)
        {
            return -1;
        }
        
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int numberOfPlaces = s.length();
        int returnNum = 0;
        int currentPlace = numberOfPlaces - 1;
        
        for(int i = 0; i < numberOfPlaces; i++)
        {
        	int characterNumber = alphabet.indexOf(s.charAt(i)) + 1;
        	
            returnNum += Math.pow(26.0, currentPlace) * characterNumber;
        	
        	currentPlace--;
        }
        
        return returnNum;
    }
}