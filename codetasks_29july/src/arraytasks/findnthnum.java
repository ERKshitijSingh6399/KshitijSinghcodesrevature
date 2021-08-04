package arraytasks;

import java.util.*;

public class findnthnum {

	public static void main(String[] args) {
		int arr[]= {3,3,3,3,3,3,2,2,2,2,2,2,5,6,7,3,6,7,9,9,9,4,3,2,8,7,5,5,4,5,5,6,6,7,7,7,7,7,4,4,6,6,9,9};
		System.out.println("Array:"+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Enter N value");
		Scanner s = new Scanner(System.in);
		int Nth_max=s.nextInt();
		s.close();
		int i,temp=arr[0];
		for(i=1;i<arr.length && Nth_max>1;i++)
		{
			if(arr[i]!=temp)
			{
				temp=arr[i];
				Nth_max--;
			}
		}
		System.out.println(arr[i]);
		
	}

}
