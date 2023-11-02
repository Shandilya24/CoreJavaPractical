package multidimensionarray;

public class MultiDimensionArrayEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = new int[3][];
		a[0]=new int[3];
		a[1]=new int[2];
		a[2]=new int[4];
		int count = 0;
		for(int i=0;i<a.length;i++)//rows
		{
			for(int j=0;j<a[i].length;j++)//cols
			{
				a[i][j]=++count;
			}
		}
		for(int i=0;i<a.length;i++)//rows
		{
			for(int j=0;j<a[i].length;j++)//cols
			{
				System.out.println("\t"+a[i][j]);
			}
			System.out.println();
		}

	}

}
