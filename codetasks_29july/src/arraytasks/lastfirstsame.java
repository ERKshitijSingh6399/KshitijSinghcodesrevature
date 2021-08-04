package arraytasks;
import java.lang.Math;

public class lastfirstsame {
	static boolean islastfirstsame(int x) 
	{
		String str=Integer.toString(x);
		int i=str.length()-1;
		int a=x/(int)Math.pow(10, i);
		int b=x%10;

		if(a==b)
		{return true;}
		else
			return false;
	}
	public static void main(String[] args) {
		int arr[]= {111,212,34,40674,5050,607906,71987,1201,123312,141441415,676,88};
		for(int x:arr)
		{
			if(islastfirstsame(x))
				System.out.print(x+" ");
		}

	}
}
