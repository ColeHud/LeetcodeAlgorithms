public class PascalTriangle 
{
	public static int[] nthRow(int n)
	{
		//only positive rows
		if(n < 0){return null;};
		
		//create the 2 rows
		int[] row0 = {1};
		int[] row = {};
		
		if(n == 0){return row0;};
		
		for(int i = 0; i < n; i++)
		{
			row = new int[row0.length + 1];
			//set the ends to 1
			row[0] = 1; row[row.length -1 ] = 1;
			
			//add the numbers above it
			for(int j = 1; j < row.length - 1; j++)
			{
				row[j] = row0[j - 1] + row0[j];
			}
			
			row0 = row;
		}
		
		//print results
		/*
		for(int thing : row)
		{
			System.out.print(thing + " ");
		}
		System.out.println();
		*/
		return row;
		
	}
}
