package arraytasks;

import java.util.Arrays;

public class removedupli {
	
	public static void main(String[] args) 
	{
		int arr[]= {3,3,3,3,3,3,2,2,2,2,2,2,1,1,1,5,6,7,3,6,7,9,9,9,1,4,3,2,8,7,5,5,4,5,5,6,6,7,7,7,7,7,1,4,4,6,6,9,9};
		Arrays.sort(arr);
		System.out.println("Array:"+Arrays.toString(arr));
		int i,j=0;
		int[] temp = new int[arr.length];
		temp[0]= arr[0];
		for(i=1;i<arr.length;i++)
		{
			if(arr[i]!=temp[j])
			{
				j++;
				temp[j]=arr[i];
			}
		}
		int ar2[]= Arrays.copyOf(temp, j);
		temp=null;
		System.out.println("Minimised:"+Arrays.toString(ar2));
		

	}

}
