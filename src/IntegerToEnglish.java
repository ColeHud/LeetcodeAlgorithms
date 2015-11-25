
public class IntegerToEnglish 
{
	public String numberToWords(int num) 
	{
		//edge case
		if(num == 0)
		{
			return "Zero";
		}
		
		//first, break up the int into chunks
		String stringyNum = num+"";

		//add in 0s if there isn't an even chunk divisions
		int numberOfLeftoverSpaces = (stringyNum.length() % 3);
		if(numberOfLeftoverSpaces != 0)
		{
			numberOfLeftoverSpaces = 3 - numberOfLeftoverSpaces;
		}
		for(int i = 0; i < numberOfLeftoverSpaces; i++)
		{
			stringyNum = "0" + stringyNum;
		}
		int numberOfChunks = stringyNum.length() / 3;

		//create the chunks
		String[] chunks = new String[numberOfChunks];

		//initialize the values of chunks
		for(int i = 0; i < chunks.length; i++)
		{
			chunks[i] = "";
		}

		//place in chunks
		int currentChunk = 0;
		//start at the largest place values and work towards smaller ones, placing the chunks into chunks
		for(int i = 0; i < stringyNum.length(); i++)
		{
			if(i > 0 && i%3 == 0)
			{
				currentChunk++;
			}
			chunks[currentChunk] += stringyNum.charAt(i);
		}
		
		/* PRINT CHUNKS
		System.out.println();
		for(String chunk : chunks)
		{
			System.out.print(" " + chunk + " ");
		}
		*/
		
		//create the words for each chunk, sans place value eg "One Hundred Twenty Five" without adding in "Million"
		String[] wordChunks = new String[chunks.length];
		
		String[] onesThroughTeens = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
		String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
		String[] hundreds = {"", "One Hundred", "Two Hundred", "Three Hundred", "Four Hundred", "Five Hundred", "Six Hundred", "Seven Hundred", "Eight Hundred", "Nine Hundred"};
		
		for(int i = 0; i < chunks.length; i++)
		{
			String wordsFromChunk = "";
			String chunk = chunks[i];
			
			int hundredsPlace = Integer.parseInt(chunk.charAt(0) + "");
			int tensPlace = Integer.parseInt(chunk.charAt(1) + "");
			int onesPlace = Integer.parseInt(chunk.charAt(2) + "");
			
			int teens = Integer.parseInt(tensPlace + "" + onesPlace);
			
			if(hundredsPlace > 0)
			{
				wordsFromChunk += hundreds[hundredsPlace] + " ";
			}
			
			if(teens > 9 && teens < 20)
			{
				wordsFromChunk += onesThroughTeens[teens] + " ";
			}
			else
			{
				if(tensPlace > 0)
				{
					wordsFromChunk += tens[tensPlace] + " ";
				}
				if(onesPlace > 0)
				{
					wordsFromChunk += onesThroughTeens[onesPlace] + " ";
				}
			}
			
			wordChunks[i] = wordsFromChunk;
		}
		
		//add in place values (ex. "million")
		String[] placeValueNames = {"", "Thousand", "Million", "Billion", "Trillion", "Zillion"};
		for(int i = 0; i < wordChunks.length; i++)
		{
			int chunkNumber = wordChunks.length;
			int index = chunkNumber - 1 - i;
			String chunk = chunks[i];
			
			String placeValueName = placeValueNames[index] + " ";
			
			//check and see if it's all zeros
			if(!(chunk.charAt(0) == '0' && chunk.charAt(1) == '0' && chunk.charAt(2) == '0'))
			{
				if(placeValueName.length() > 1)
				{
					wordChunks[i] += placeValueName;
				}
			}
		}
		
		//combine all the word chunks together
		String combinedReturnString = "";
		for(int i = 0; i < wordChunks.length; i++)
		{
			String chunk = wordChunks[i];
			//only add a space if there's more than one chunk
			combinedReturnString += chunk;
		}
		
		//trim off the space left at the end of the string
		combinedReturnString = combinedReturnString.substring(0, combinedReturnString.length()-1);

		return combinedReturnString;
	}
}
