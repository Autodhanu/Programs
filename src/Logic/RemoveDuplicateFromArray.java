package Logic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		
		int[] a= {2,5,9,5,6,2,4,3,8};
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}
		
         Integer[] b = set.toArray(new Integer[set.size()]);
         
         System.out.println(Arrays.toString(b));
	}

}

