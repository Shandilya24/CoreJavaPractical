package singledimensionarray;

public class SingleDimensionArrrayEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[0];//No CTE or No RTE
		System.out.println(arr.length);//0
		arr[0]=10;//RTE-Array index out of Bond Exception
		int arr1[]=new int[-2];//RTE-negative
		int arr2[]=new int[2];//CTE-Array dimension missing

	}

}
