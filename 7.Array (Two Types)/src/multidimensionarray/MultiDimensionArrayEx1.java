package multidimensionarray;

public class MultiDimensionArrayEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[2][3];  
		int count=0;
		for(int i=0;i<a.length;i++)//rows
		{
			for(int j=0;j<a[i].length;j++);//cols
			{
				a[i][i]=++count;
			}
		}
		for(int i=0;i<a.length;i++)//rows
		{
			for(int j=0;j<a[i].length;j++)//cols
			{
				System.out.println("\t"+a[i][j]);
			}
		}
		System.out.println();

	}

}
