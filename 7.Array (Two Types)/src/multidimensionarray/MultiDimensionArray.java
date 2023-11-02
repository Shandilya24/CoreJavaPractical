package multidimensionarray;

public class MultiDimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{10,30,30},{20,70,60}};
		{
			for (int i=0;i<2;i++)//rows
             {
            	 for(int j=0;j<3;j++)//cols
            	 {
            		 System.out.println("\t"+a[i][j]);
            	 }
             }
			System.out.println();
		}

	}

}
