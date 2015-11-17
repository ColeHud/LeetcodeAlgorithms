public class LessCodeTriangle{
	public static long[] nthRow(int n){
		if(n < 0){return null;};
		long[] row0 = {1};
		long[] row = {};
		if(n == 0){return row0;};
		for(int i = 0; i < n; i++){
			row = new long[row0.length + 1];
			row[0] = 1; row[row.length -1 ] = 1;
			for(int j = 1; j < row.length - 1; j++){
				row[j] = row0[j - 1] + row0[j];
			}
			row0 = row;
		}
		return row;
	}
}
