package Logic;

public class SumOfElementInArray {

	public static void main(String[] args) {
		
		int[] arr= {2,6,9,8,5};
		
		int sum=0;
		
		/*
		 * for(int a:arr) { sum=sum+a; } System.out.println(sum);
		 */
		
		for(int i=0;i<=arr.length-1;i++)
		{
			sum=sum+arr[i];
		}
       System.out.println(sum);
	}

}
