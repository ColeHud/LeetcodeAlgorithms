public class BigPascalTriangle 
{
	public static long[] nthRow(int n)
	{
		//only positive rows
		if(n < 0){return null;};
		
		//create the 2 rows
		long[] row0 = {1};
		long[] row = {};
		
		if(n == 0){return row0;};
		
		for(int i = 0; i < n; i++)
		{
			row = new long[row0.length + 1];
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
		for(int i = 0; i < row.length; i++)
		{
			System.out.print(row[i] + " ");
		}
		System.out.println();
		return row;
		
	}
}
